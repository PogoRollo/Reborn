package dev.spiritworker.game.data.spawns;

import java.util.List;
import java.util.LinkedList;

import dev.spiritworker.util.Position;

public class MazeData {
	private int id;
	private float angle;
	private String name;
	private Position pos;
	private List<MazeStageData> stages;

	private int version = 1;

	public MazeData() {}
	public MazeData(int id) {
		this.id = id;
		this.pos = new Position();
		this.stages = new LinkedList<MazeStageData>();
	}

	public int   getId()    { return id; }
	public float getAngle() { return angle; }

	public Position getPosition()          { return pos; }
	public List<MazeStageData> getStages() { return stages; }
	public MazeStageData getLastStage()    { return getStages().get(getStages().size() - 1); }

	public void  setAngle(float angle) { this.angle = angle; }

	public static class MazeStageData {
		private int stage;
		private float angle;
		private Position pos;
		private List<MazeWaveData> waves;

		public MazeStageData() {
			this.pos = new Position();
			this.waves = new LinkedList<MazeWaveData>();
		}

		public MazeStageData(int stage) {
			this.setStage(stage);
			this.pos = new Position();
			this.waves = new LinkedList<MazeWaveData>();
		}

		public int   getId()    { return stage; }
		public float getAngle() { return angle; }

		public Position getPos() { return pos; }
		public List<MazeWaveData> getWaves() { return waves; }

		public void setStage(int stage)   { this.stage = stage; }
		public void setAngle(float angle) { this.angle = angle; }
	}

	public static class MazeWaveData {
		private List<MazeSpawnData> spawns;

		public List<MazeSpawnData> getSpawns() { return spawns; }
		public MazeWaveData() { this.spawns = new LinkedList<MazeSpawnData>(); }
	}

	public static class MazeSpawnData {
		private int id; // Monster id
		private int level;
		private int health;
		private float angle;
		private Position pos;

		public MazeSpawnData() {}

		public MazeSpawnData(int id) {
			this.setId(id);
			this.pos = new Position();
		}

		public int   getId()     { return id; }
		public int   getLevel()  { return level; }
		public int   getHealth() { return health; }
		public float getAngle()  { return angle; }

		public Position getPos() { return pos; }
		public void createPos()  { this.pos = new Position(); }

		public void setId(int id)         { this.id = id; }
		public void setLevel(byte b)      { this.level = b; }
		public void setHealth(int health) { this.health = health; }
		public void setAngle(float angle) { this.angle = angle; }
	}
}