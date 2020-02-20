package dev.spiritworker.game.managers;

import dev.spiritworker.game.character.GameCharacter;
import dev.spiritworker.net.packet.PacketBuilder;
import dev.spiritworker.net.packet.PacketOpcodes;
import dev.spiritworker.net.packet.util.PacketWriter;
import dev.spiritworker.server.world.WorldServer;
import dev.spiritworker.server.world.WorldSession;

public class ChatManager {
	private final WorldServer server;
	
	public ChatManager(WorldServer server) { this.server = server; }

	public WorldServer getServer() {
		return server;
	}

	public static void handleSystemChat(GameCharacter character, String message)
	{
		PacketWriter p = new PacketWriter(PacketOpcodes.ClientChatNormal);

		p.writeUint32(character.getId());
		p.writeUint32(1);
		p.writeString16(message);
	}

	public void handleNormalChat(WorldSession session, String message) {
		if (message.charAt(0) == '!') {
			CommandHandler.handle(session.getCharacter(), message);
			return;
		}
		
		session.getCharacter().getMap().broadcastPacket(PacketBuilder.sendClientChatNormal(session, message));
	}
	
	public void handlePartyChat(WorldSession session, String message) {
		// TODO
	}
	
	public void handleWhisperChat(WorldSession session, String message) {
		
	}
}
