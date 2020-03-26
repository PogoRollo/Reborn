package dev.spiritworker.game.data.spawns;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

import dev.spiritworker.util.Position;

public class MapData {

    private int id;
    private Position pos;
    private float angle;
    private List<MazeStageData> stages;
    private Map<Integer, MazeSpawnData> spawns;
    private List<NpcSpawnData> npcs;

    private int version = 2;

    public MapData() {}

    public MapData(int id) {
        this.id = id;
        this.pos = new Position();
        this.stages = new LinkedList<>();
        this.spawns = new HashMap<>();
        this.npcs = new LinkedList<>();
    }

    public int getId() {
        return id;
    }
    public float getAngle() {
        return angle;
    }

    public List<MazeStageData> getStages()         { return stages; }
    public Map<Integer, MazeSpawnData> getSpawns() { return spawns; }
    public MazeStageData getLastStage()            { return getStages().get(getStages().size() - 1); }

    public Position getPosition() { return pos; }
    public List<NpcSpawnData> getNpcList() { return npcs; }

    public void setAngle(float angle) { this.angle = angle; }

    public static class MazeStageData {
        private int stage;
        private int portal;
        private float angle;
        private Position pos;
        private List<MazeWaveData> waves;

        public MazeStageData() {
            this.pos = new Position();
            this.waves = new LinkedList<MazeWaveData>();
        }

        public MazeStageData(int id, int portal) {
            this.setId(id);
            this.setPortal(portal);
            this.pos = new Position();
            this.waves = new LinkedList<MazeWaveData>();
        }

        public int getId()      { return stage; }
        public int getPortal()  { return portal; }
        public float getAngle() { return angle; }


        public Position           getPos() { return pos; }
        public List<MazeWaveData> getWaves() { return waves; }

        public void  setId(int stage)      { this.stage = stage; }
        public void  setAngle(float angle) { this.angle = angle; }
        public void  setPortal(int portal) { this.portal = portal; }
    }

    public static class MazeWaveData {

        private List<MazeSpawnData> spawns;

        public MazeWaveData() {
            this.spawns = new LinkedList<MazeSpawnData>();
        }

        public List<MazeSpawnData> getSpawns() {
            return spawns;
        }
    }

    public enum SpawnType {
        Monster,
        Npc
    }

    public static class MazeSpawnData {
        private int id; // Monster id
        private int level;
        private int health;
        private int spawnId;
        private float angle;
        private Position pos;
        private SpawnType type;

        public MazeSpawnData() {}

        public MazeSpawnData(int id) {
            this.setId(id);
            this.pos = new Position();
        }

        public SpawnType getType() { return type == null ? SpawnType.Monster : type; }

        public int   getId()      { return id; }
        public int   getLevel()   { return level; }
        public float getAngle()   { return angle; }
        public int   getHealth()  { return health; }
        public int   getSpawnId() { return spawnId; }


        public Position getPos() { return pos; }
        public void     createPos()  { this.pos = new Position(); }

        public void setId(int id)           { this.id = id; }
        public void setLevel(byte b)        { this.level = b; }
        public void setType(SpawnType type) { this.type = type; }
        public void setAngle(float angle)   { this.angle = angle; }
        public void setHealth(int health)   { this.health = health; }
        public void setSpawnId(int spawnId) { this.spawnId = spawnId; }
    }

    public static class NpcSpawnData {
        private Position pos;
        private float angle;
        private int npcId;
        private int script;

        public NpcSpawnData () {
            this.pos = new Position();
        }

        public Position getPos() { return pos; }

        public float getAngle()  { return angle; }
        public int   getNpcId()  { return npcId; }
        public int   getScript() { return script; }

        public void setAngle(float angle) { this.angle = angle; }
        public void setNpcId(int npcId)   { this.npcId = npcId; }
        public void setScript(int script) { this.script = script; }
    }
}