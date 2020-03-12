package dev.spiritworker.game.managers;

import dev.spiritworker.game.character.GameCharacter;
import dev.spiritworker.game.map.District;
import dev.spiritworker.game.map.GameMap;
import dev.spiritworker.server.game.GameServer;
import dev.spiritworker.server.world.WorldServer;
import it.unimi.dsi.fastutil.objects.ObjectCollection;

import java.util.ArrayList;
import java.util.List;

public class SystemChatManager {
    private final GameCharacter character;
    private final GameServer gameServer;

    public SystemChatManager(GameCharacter character, GameServer gameServer) {
        this.character = character;
        this.gameServer = gameServer;
    }

    public GameCharacter getSystem() { return character; }

    public List<GameMap> getMaps() {
        List<GameMap> returnValue = new ArrayList<GameMap>();
        for(GameCharacter character : gameServer.getCharacters().values()) {
            returnValue.add(character.getMap());
        }
        return returnValue;
    }

}
