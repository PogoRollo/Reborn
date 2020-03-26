package dev.spiritworker.game.managers;

import java.lang.reflect.Modifier;
import java.util.HashMap;

import dev.spiritworker.SpiritWorker;
import dev.spiritworker.game.character.GameCharacter;
import dev.spiritworker.game.character.Stat;
import dev.spiritworker.game.data.SoulWorker;
import dev.spiritworker.game.data.def.MonsterDef;
import dev.spiritworker.game.data.spawns.MazeData;
import dev.spiritworker.game.inventory.InventorySlotType;
import dev.spiritworker.game.inventory.InventoryTab;
import dev.spiritworker.game.inventory.Item;
import dev.spiritworker.game.map.District;
import dev.spiritworker.game.map.GameMap;
import dev.spiritworker.game.map.Monster;
import dev.spiritworker.net.packet.PacketBuilder;
import dev.spiritworker.netty.SoulWorkerSession;
import dev.spiritworker.server.game.GameServer;
import dev.spiritworker.server.game.GameSession;
import dev.spiritworker.server.world.WorldServer;
import dev.spiritworker.server.world.WorldSession;
import dev.spiritworker.util.Position;

public class CommandHandler {
	private static HashMap<String, PlayerCommand> list = new HashMap<String, PlayerCommand>();
	public static WorldSession session;
	public static ChatManager chatManager;
	static {
		try {
			// Look for classes
			for (Class<?> cls : CommandHandler.class.getDeclaredClasses()) {
				// Get non abstract classes
			    if (!Modifier.isAbstract(cls.getModifiers())) {
			    	String commandName = "!" + cls.getSimpleName().toLowerCase();
			    	list.put(commandName, (PlayerCommand) cls.newInstance());
			    }
		
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void handle(GameCharacter character, String msg) {
		String[] split = msg.split(" ");
		
		// End if invalid
		if (split.length == 0) {
			return;
		}
		
		//
		String first = split[0].toLowerCase();
		PlayerCommand c = CommandHandler.list.get(first);
		
		if (c != null) {
			// Level check
			if (character.getGmLevel() < c.level) {
				return;
			}
			// Execute
			int len = Math.min(first.length() + 1, msg.length());
			c.execute(character, msg.substring(len));
		}
	}
	
	public static abstract class PlayerCommand {
		// Level required to use this command
		public int level;
		
		public void setLevel(int minLevel) {
			this.level = minLevel;
		}
		
		// Main
		public abstract void execute(GameCharacter character, String raw);
	}
	
	// ================ Commands ================
	
	public static class Give extends PlayerCommand {
		
		public Give() {
			this.setLevel(0);
		}

		@Override
		public void execute(GameCharacter character, String raw) {
			String[] split = raw.split(" ");
			int itemId = 0, count = 1;
			
			try {
				itemId = Integer.parseInt(split[0]);
			} catch (Exception e) {
				itemId = 0;
			}
			
			try {
				count = Math.min(Integer.parseInt(split[1]), Short.MAX_VALUE);
			} catch (Exception e) {
				count = 1;
			}
			
			if (!SoulWorker.isValidItemId(itemId)) {
				return;
			}

			Item item = new Item(itemId);
			item.setCount(count);
			character.getInventory().addItem(item);
		}
	}
	
	public static class ClearInventory extends PlayerCommand {
		
		public ClearInventory() {
			this.setLevel(0);
		}

		@Override
		public void execute(GameCharacter character, String raw) {
			InventoryTab tab = character.getInventory().getInventoryTabByType(InventorySlotType.NORMAL);
			for (Item item : character.getInventory().getTabByType(InventorySlotType.NORMAL).getItems()) {
				if (item != null) {
					tab.deleteItem(item.getSlot(), item.getCount());
				}
			}
		}
	}
	
	public static class StarterPack extends PlayerCommand {
		
		public StarterPack() {
			this.setLevel(0);
		}

		@Override
		public void execute(GameCharacter character, String raw) {
			// Gear
			character.getInventory().addItem(new Item(510014351));
			character.getInventory().addItem(new Item(520014351));
			character.getInventory().addItem(new Item(530014351));
			character.getInventory().addItem(new Item(540014351));
			// Rings
			character.getInventory().addItem(new Item(410015401));
			character.getInventory().addItem(new Item(430015401));
			character.getInventory().addItem(new Item(440015401));
			character.getInventory().addItem(new Item(440015401));
		}
	}

	public static class ChangeStat extends PlayerCommand {
		
		public ChangeStat() {
			this.setLevel(0);
		}

		@Override
		public void execute(GameCharacter character, String raw) {
			String[] split = raw.split(" ");
			int type = 0;
			float value = 1.0f;
			
			try {
				type = Integer.parseInt(split[0]);
			} catch (Exception e) {
				type = 0;
			}
			
			try {
				value = Float.parseFloat(split[1]);
			} catch (Exception e) {
				value = 1;
			}
			
			Stat stat = character.getStats().getMap().get(type);
			if (stat != null) {
				stat.set(value);
				character.getMap().broadcastPacket(PacketBuilder.sendClientCharacterUpdate(character, stat));
			}
			
		}
	}

	public static class GetPosition extends  PlayerCommand {

		public GetPosition() {
			this.setLevel(0);
		}

		@Override
		public void execute(GameCharacter character, String raw)
		{
			Position posit = character.getPosition();
			String position = "X:" + posit.getX() + " Y:" + posit.getY() + " Z:" + posit.getZ();
			//ChatManager.handleSystemChat(character, position);
		}
	}

	public static class Teleport extends PlayerCommand {
		public Teleport() { this.setLevel(0); }

		@Override
		public void execute(GameCharacter character, String raw)
		{
			String[] split = raw.split(" ");

			int districtId = 10003;
			districtId = Integer.parseInt(split[0]);

			District district = session.getServer().getDistrictById(districtId);
			if(district == null)
			{
				SpiritWorker.getLogger().error("Teleport break. District id " + districtId + " does not exist");
				return;
			}
			district.addCharacter(session.getCharacter());
			character.getPosition().set(10000, 10000, 100);

			if(districtId == 10031)
			{
				character.getPosition().set(42200, 47900, 250);
			}

			session.sendPacket(PacketBuilder.sendClientJoinMap(character, district));
		}
	}

	public static class GoToPos extends PlayerCommand {
		public GoToPos() { this.setLevel(0); }

		@Override
		public void execute(GameCharacter character, String raw)
		{
			String[] split = raw.split(" ");

			Position newPosition = new Position(Integer.parseInt(split[0]) * 100, Integer.parseInt(split[1]) * 100, Integer.parseInt(split[2]) * 100);
			SpiritWorker.getLogger().info("New Position character - " + character.getName() + " = x: " + split[0] + ", y: " + split[1] + ", z: " + split[2]);
			character.getPosition().set(newPosition);
			session.sendPacket(PacketBuilder.sendClientUpdatePosition(character));
		}
	}
}
