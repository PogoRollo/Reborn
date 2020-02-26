package dev.spiritworker.game.data;

import dev.spiritworker.game.data.def.*;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class SoulWorker {
	private static Int2ObjectMap<ItemDef> itemDefs = new Int2ObjectOpenHashMap<ItemDef>();
	private static Int2ObjectMap<PackageDef> packageDefs = new Int2ObjectOpenHashMap<PackageDef>();
	private static Int2ObjectMap<DistrictDef> districtDefs = new Int2ObjectOpenHashMap<DistrictDef>();
	private static Int2ObjectMap<SkillDef> skillDefs = new Int2ObjectOpenHashMap<SkillDef>();
	private static Int2ObjectMap<MazeDef> mazeDefs = new Int2ObjectOpenHashMap<MazeDef>();
	private static Int2ObjectMap<MonsterDef> monsterDefs = new Int2ObjectOpenHashMap<MonsterDef>();
	private static Int2ObjectMap<NpcDef> npcDefs = new Int2ObjectOpenHashMap<NpcDef>();
	
	public static Int2ObjectMap<ItemDef> getItemDefs() {
		return itemDefs;
	}
	
	public static boolean isValidItemId(int id) {
		return itemDefs.containsKey(id);
	}
	
	public static ItemDef getItemDefById(int itemId) {
		return getItemDefs().get(itemId);
	}
	
	public static Int2ObjectMap<PackageDef> getPackageDefs() {
		return packageDefs;
	}

	public static Int2ObjectMap<DistrictDef> getDistrictDefs() {
		return districtDefs;
	}

	public static Int2ObjectMap<SkillDef> getSkillDefs() {
		return skillDefs;
	}

	public static Int2ObjectMap<MazeDef> getMazeDefs() {
		return mazeDefs;
	}

	public static Int2ObjectMap<MonsterDef> getMonsterDefs() {
		return monsterDefs;
	}

	public static Int2ObjectMap<NpcDef> getNpcDefs() { return npcDefs; }

	public static boolean isValidMonsterId(int id) {
		return monsterDefs.containsKey(id);
	}

	public static boolean isValidNpcId(int id) {
		return npcDefs.containsKey(id);
	}

	public static boolean isValidDistrictId(int id) {
		return districtDefs.containsKey(id);
	}

	public static void createFileWithItems()
	{
		File dir = new File(".");
		try(FileWriter writer = new FileWriter("unpacked-resources/defitems.ur", true)) {
			int sizehashMap = itemDefs.size();
			int i = 0;
			int k = 0;
			while(sizehashMap > 0) {
				while(true) {
					k++;
					if(isValidItemId(k)) {
						break;
					}
				}
				writer.write(itemDefs.get(k).getAllInfo());
				sizehashMap--;
				}
			writer.flush();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFileWithMonsters()
	{
		File dir = new File(".");
		try(FileWriter writer = new FileWriter("unpacked-resources/monsters.ur", true)) {
			int sizehashMap = monsterDefs.size();
			int i = 0;
			int k = 0;
			while(sizehashMap > 0) {
				while(true) {
					k++;
					if(isValidMonsterId(k)) {
						break;
					}
				}
				writer.write(monsterDefs.get(k).getAllInfo());
				sizehashMap--;
			}
			writer.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFileWithNpcs()
	{
		File dir = new File(".");
		try(FileWriter writer = new FileWriter("unpacked-resources/npcs.ur", true)) {
			int sizehashMap = npcDefs.size();
			int i = 0;
			int k = 0;
			while(sizehashMap > 0) {
				while(true) {
					k++;
					if(isValidNpcId(k)) {
						break;
					}
				}
				writer.write(npcDefs.get(k).getAllInfo());
				sizehashMap--;
			}
			writer.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFileWithDistricts()
	{
		File dir = new File(".");
		try(FileWriter writer = new FileWriter("unpacked-resources/mazes.ur", true)) {
			int sizehashMap = districtDefs.size();
			int i = 0;
			int k = 0;
			while(sizehashMap > 0) {
				while(true) {
					k++;
					if(isValidDistrictId(k)) {
						break;
					}
				}
				writer.write(districtDefs.get(k).toString());
				sizehashMap--;
			}
			writer.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
