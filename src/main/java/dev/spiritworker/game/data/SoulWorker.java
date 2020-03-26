package dev.spiritworker.game.data;

import dev.spiritworker.SpiritWorker;
import dev.spiritworker.game.data.def.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SoulWorker {

//	private final static Logger logger = LogManager.getLogger(SoulWorker.class);

	private static Int2ObjectMap<MonsterDef>         monsterDefs          = new Int2ObjectOpenHashMap<MonsterDef>();
	private static Int2ObjectMap<MazeDef>            mazeDefs             = new Int2ObjectOpenHashMap<MazeDef>();
	private static Int2ObjectMap<SkillDef>           skillDefs            = new Int2ObjectOpenHashMap<SkillDef>();
	private static Int2ObjectMap<NpcDef>             npcDefs              = new Int2ObjectOpenHashMap<NpcDef>();
	private static Int2ObjectMap<PackageDef>         packageDefs          = new Int2ObjectOpenHashMap<PackageDef>();
	private static Int2ObjectMap<DyeInfoDef>         dyeInfoDefs          = new Int2ObjectOpenHashMap<DyeInfoDef>();
	private static Int2ObjectMap<TitleDef>           titleDefs            = new Int2ObjectOpenHashMap<TitleDef>();
	private static Int2ObjectMap<ItemSetDef>         itemSetDefs          = new Int2ObjectOpenHashMap<ItemSetDef>();
	private static Int2ObjectMap<ReinforceOptionDef> reinforceOptionDefs  = new Int2ObjectOpenHashMap<ReinforceOptionDef>();
	private static Int2ObjectMap<ReinforceDef>       reinforceDefs        = new Int2ObjectOpenHashMap<ReinforceDef>();
	private static Int2ObjectMap<DistrictDef>        districtDef          = new Int2ObjectOpenHashMap<DistrictDef>();
	private static Int2ObjectMap<ItemDef>            itemDefs             = new Int2ObjectOpenHashMap<ItemDef>();

	public static Int2ObjectMap<MonsterDef>          getMonsterDefs()          { return monsterDefs; }
	public static Int2ObjectMap<MazeDef>             getMazeDefs()             { return mazeDefs; }
	public static Int2ObjectMap<SkillDef>            getSkillDefs()            { return skillDefs; }
	public static Int2ObjectMap<NpcDef>              getNpcDefs()              { return npcDefs; }
	public static Int2ObjectMap<PackageDef>          getPackageDefs()          { return packageDefs; }
	public static Int2ObjectMap<DyeInfoDef>          getDyeInfoDefs()          { return dyeInfoDefs; }
	public static Int2ObjectMap<TitleDef>            getTitleDefs()            { return titleDefs; }
	public static Int2ObjectMap<ItemSetDef>          getItemSetDefs()          { return itemSetDefs; }
	public static Int2ObjectMap<ReinforceOptionDef>  getReinforceOptionDefs()  { return reinforceOptionDefs; }
	public static Int2ObjectMap<ReinforceDef>        getReinforceDefs()        { return reinforceDefs; }
	public static Int2ObjectMap<DistrictDef>         getDistrictDefs()          { return districtDef; }
	public static Int2ObjectMap<ItemDef>             getItemDefs()              { return itemDefs; }

	public static ItemDef getItemDefById(int itemId) {
		return getItemDefs().get(itemId);
	}

	public static boolean isValidItemId(int id) {
		return itemDefs.containsKey(id);
	}

	public static void initCreate() {

		SpiritWorker.getLogger().info("Create file with data from game resources...");
		long time = System.currentTimeMillis();

		createFileWithRes("Monsters", monsterDefs);
		createFileWithRes("MazeInfo", mazeDefs);
		createFileWithRes("NPC", npcDefs);
		createFileWithRes("District", districtDef);
		createFileWithRes("Title", titleDefs);
		createFileWithRes("Skill", skillDefs);
		// FIXME: неправильный вывод данных ItemSet
		createFileWithRes("ItemSet", itemSetDefs);
		createFileWithRes("DyeInfo", dyeInfoDefs);
		// FIXME: неправильный вывод данных Package
		createFileWithRes("Package", packageDefs);
		// FIXME: неправильный вывод данных Reinforce
		createFileWithRes("Reinforce", reinforceDefs);
		// FIXME: неправильный вывод данных ReinforceOption
		createFileWithRes("ReinforceOption", reinforceOptionDefs);

		SpiritWorker.getLogger().info("Create complete. Took " + (System.currentTimeMillis() - time) + " ms.");
	}

	public static void createFileWithRes(String fileName, Int2ObjectMap map){
		File file = new File("unpacked-resources/" + fileName + ".ur");

		if (file.exists() && !file.isDirectory()) {
			return;
		}

		try (FileWriter writer = new FileWriter(file, true)) {

			int i, id = 0;
			int sizeHashMap = map.size();

			while (sizeHashMap > 0) {

				while (true) {

					id++;
					if (map.containsKey(id)){
						break;
					}
				}

				writer.write(map.get(id).toString());
				sizeHashMap--;
			}

			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}