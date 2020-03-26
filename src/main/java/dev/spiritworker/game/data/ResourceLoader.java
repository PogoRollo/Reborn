package dev.spiritworker.game.data;

import dev.spiritworker.SpiritWorker;
import dev.spiritworker.util.FileUtils;
import dev.spiritworker.game.data.def.*;
import dev.spiritworker.game.data.spawns.MazeData;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

import java.io.File;
import java.io.FileReader;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.lang.reflect.Constructor;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ExecutorService;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import org.reflections.Reflections;
import org.apache.commons.codec.digest.DigestUtils;

public class ResourceLoader {

	protected static ExecutorService pool;
	protected static Semaphore semaphore;
	protected static int tasks = 0;

	public static void loadDefinitions() {

		loadFromResource("tb_Item_Package.res", PackageDef.class, ResourceIdType.INT, SoulWorker.getPackageDefs());

		loadFromResource("tb_Skill.res", SkillDef.class, ResourceIdType.INT, SoulWorker.getSkillDefs());
		loadFromResource("tb_Monster.res", MonsterDef.class, ResourceIdType.INT, SoulWorker.getMonsterDefs());

		loadFromResource("tb_Title_Info.res", TitleDef.class, ResourceIdType.INT, SoulWorker.getTitleDefs());
		loadScriptFromResource("tb_Title_String.res", TitleDef.class, ResourceIdType.INT, SoulWorker.getTitleDefs());

		loadFromResource("tb_Dye_Info.res", DyeInfoDef.class, ResourceIdType.SHORT, SoulWorker.getDyeInfoDefs());
		loadFromResource("tb_Item_SetItem.res", ItemSetDef.class, ResourceIdType.INT, SoulWorker.getItemSetDefs());
		loadFromResource("tb_Reinforce.res", ReinforceDef.class, ResourceIdType.INT, SoulWorker.getReinforceDefs());
		loadFromResource("tb_Reinforce_Option.res", ReinforceOptionDef.class, ResourceIdType.INT, SoulWorker.getReinforceOptionDefs());

		loadFromResource("tb_Maze_Info.res", MazeDef.class, ResourceIdType.SHORT, SoulWorker.getMazeDefs());
		loadFromResource("tb_Item.res", ItemDef.class, ResourceIdType.INT, SoulWorker.getItemDefs());
		loadFromResource("tb_NPC.res", NpcDef.class, ResourceIdType.INT, SoulWorker.getNpcDefs());
		loadFromResource("tb_district.res", DistrictDef.class, ResourceIdType.SHORT, SoulWorker.getDistrictDefs());

		loadMazes();
	}

	@SuppressWarnings("rawtypes")
	protected static void loadFromResource(String fileName, Class<?> c, ResourceIdType idType, Int2ObjectMap map) {
		File file = new File(SpiritWorker.getConfig().RESOURCE_FOLDER + fileName);

		try (FileInputStream fis = new FileInputStream(file); DataInputStream dis = new DataInputStream(fis)) {
			byte[] bytes = new byte[(int) file.length()];
			dis.readFully(bytes);

			ByteBuffer buf = ByteBuffer.wrap(bytes);
			buf.order(ByteOrder.LITTLE_ENDIAN);

			int count = buf.getInt();

			Constructor<?> constructor = c.getConstructor(Integer.TYPE);

			for (int i = 0; i < count; i++) {

				int id = getIdFromDef(buf, idType);

				ResourceDef def = (ResourceDef) constructor.newInstance(id);
				def.loadFromRes(buf);
				map.put(id, def);

			}

			SpiritWorker.getLogger().info("Loaded " + count + " " + c.getSimpleName() + "s.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	protected static void loadScriptFromResource(String fileName, Class<?> c, ResourceIdType idType, Int2ObjectMap map) {
		File file = new File(SpiritWorker.getConfig().RESOURCE_FOLDER + fileName);

		try (FileInputStream fis = new FileInputStream(file); DataInputStream dis = new DataInputStream(fis)) {

			byte[] bytes = new byte[(int) file.length()];
			dis.readFully(bytes);

			ByteBuffer buf = ByteBuffer.wrap(bytes);
			buf.order(ByteOrder.LITTLE_ENDIAN);

			int count = buf.getInt();

			long sum = 0;
			for (int i = 0; i < count; i++) {
				// Set id
				int id = getIdFromDef(buf, idType);

				// Get def
				Object defObj = map.get(id);

				if (defObj != null) {
					((ResourceDef) defObj).loadScriptFromRes(buf);
				}
			}

			SpiritWorker.getLogger().info("Loaded " + count + " scripts from " + c.getSimpleName() + "s.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getIdFromDef(ByteBuffer buf, ResourceIdType idType){
		if (idType == ResourceIdType.INT) {
			return buf.getInt();
		} else if (idType == ResourceIdType.SHORT) {
			return buf.getShort() & 0xFFFF;
		} else {
			return buf.get();
		}
	}

	public static void loadMazes() {
		File dir = new File(SpiritWorker.getConfig().DATA_FOLDER + "mazes/");

		if (!dir.exists()) {
			return;
		}

		for (File file : dir.listFiles()) {
			try (FileReader fr = new FileReader(file)) {
				MazeData mazeSpawnData = SpiritWorker.getGsonFactory().fromJson(fr, MazeData.class);
				MazeDef maze = SoulWorker.getMazeDefs().get(mazeSpawnData.getId());
				if (maze != null) {
					maze.setData(mazeSpawnData);
				}
			} catch (Exception e) {
				SpiritWorker.getLogger().error("Error reading from data files.", e);
			}
		}
	}

	// Async
	public static void resetTasks() {
		semaphore.drainPermits();
		tasks = 0;
	}
	public static void addTask(Runnable task) {
		pool.execute(task);
		tasks++;
	}
	public static void waitForTasks() {
		try {
			semaphore.acquire(tasks);
		} catch (InterruptedException e) {

		}
		resetTasks();
	}
	public static void dispose() {
		pool.shutdown();
		pool = null;
		semaphore = null;
	}
}
