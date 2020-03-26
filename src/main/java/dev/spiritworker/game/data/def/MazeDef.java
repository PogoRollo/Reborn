package dev.spiritworker.game.data.def;

import java.nio.ByteBuffer;

import dev.spiritworker.game.data.batch.VBatch;
import dev.spiritworker.game.data.spawns.MazeData;
import dev.spiritworker.game.data.MapResourceLoader;

import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Maze_Info.res", idType = ResourceIdType.SHORT)
public class MazeDef extends ResourceDef {

	private transient MazeData data;
	private transient VBatch batch = null;
	private transient String luaScript = null;

	private byte v1;
	private short groupId;
	private byte v2;
	private byte v3;
	private byte v4;
	private short energyCost;
	private short v5;
	private short v6;
	private byte v7;
	private byte v8;
	private byte v9;
	private byte v10;
	private byte v11;
	private byte v12;
	private int ticketItemId;
	private byte v13;
	private byte v14;
	private byte difficultyIndex;
	private byte v15;
	private byte episode;
	private int prevMazeId;
	private short nextMazeId;
	private short v16;
	private short v17;
	private String name;
	private String path;
	private String batchName;
	private String v18;
	private String v19;
	private String v20;
	private short uiString;
	private short v21;
	private byte levelRequirement;
	private short v22;
	private String loadingImage;
	private String icon;
	private short v23;
	private short guiValue;
	private int v24;
	private int v25;

	// THIS IS NEW TYPE
	private int v26;

	private int v27;
	private int v28;
	private int v29;
	private int v30;
	private int v31;
	private byte v32;
	private byte v33;
	private String v34;
	private byte v35;
	private int v36;
	private byte v37;

	public MazeDef(int id) {
		super(id);
	}

	public MazeData getData() {
		return data;
	}
	public void setData(MazeData data) {
		this.data = data;
	}

	public String getName()         { return name; }
	public String getBatchName()    { return batchName; }
	public String getRawLuaScript() { return luaScript; }

	public VBatch getBatch() {
		return batch;
	}

	public int getGroupId()    { return groupId; }
	public int getEnergyCost() { return energyCost; }
	public int getGuiValue()   { return guiValue; }

	@Override
	public void loadFromRes(ByteBuffer buf) {
		v1 = buf.get();
		groupId = buf.getShort();
		v2 = buf.get();
		v3 = buf.get();
		v4 = buf.get();
		energyCost = buf.getShort();
		v5 = buf.getShort();
		v6 = buf.getShort();

		v7 = buf.get();
		v8 = buf.get();
		v9 = buf.get();
		v10 = buf.get();
		v11 = buf.get();
		v12 = buf.get();

		ticketItemId = buf.getInt();

		v13 = buf.get();
		v14 = buf.get();
		difficultyIndex = buf.get();
		v15 = buf.get();
		episode = buf.get();

		prevMazeId = buf.getInt();

		nextMazeId = buf.getShort();
		v16 = buf.getShort();
		v17 = buf.getShort();

		name = readString(buf);
		path = readString(buf);
		batchName = readString(buf);
		v18 = readString(buf);
		v19 = readString(buf);
		v20 = readString(buf);

		uiString = buf.getShort();
		v21 = buf.getShort();
		levelRequirement = buf.get();
		v22 = buf.getShort();



		loadingImage = readString(buf);
		icon = readString(buf);
		v23 = buf.getShort();
		guiValue = buf.getShort();
		v24 = buf.getInt();
		v25 = buf.getInt();

		v26 = buf.getShort(); // new type SHORT ?!

		v27 = buf.getInt();
		v28 = buf.getInt();
		v29 = buf.getInt();
		v30 = buf.getInt();
		v31 = buf.getInt();
		v32 = buf.get();
		v33 = buf.get();

		v34 = readString(buf);
		v35 = buf.get();
		v36 = buf.getInt();
		v37 = buf.get();

		// Load these
		loadBatch();
		loadScript();
	}

	public int getNextMazeId() {
		return nextMazeId;
	}
	public int getPrevMazeId() {
		return prevMazeId;
	}

	private void loadBatch()  { this.batch = MapResourceLoader.getBatchCache().get(getName()); }
	private void loadScript() {
		this.luaScript = MapResourceLoader.getScripts().get(getBatchName());
	}

	public boolean isScripted() {
		return this.batch != null && this.luaScript != null;
	}

	@Override
	public String toString() {
		return "[" + this.getId() + "]"
				+ " ( " + this.v1
				+ " , " + this.groupId
				+ " , " + this.v2
				+ " , " + this.v3
				+ " , " + this.v4
				+ " , " + this.energyCost
				+ " , " + this.v5
				+ " , " + this.v6
				+ " , " + this.v7
				+ " , " + this.v8
				+ " , " + this.v9
				+ " , " + this.v10
				+ " , " + this.v11
				+ " , " + this.v12
				+ " , " + this.ticketItemId
				+ " , " + this.v13
				+ " , " + this.v14
				+ " , " + this.difficultyIndex
				+ " , " + this.v15
				+ " , " + this.episode
				+ " , " + this.prevMazeId
				+ " , " + this.nextMazeId
				+ " , " + this.v16
				+ " , " + this.v17
				+ " , " + this.name
				+ " , " + this.path
				+ " , " + this.batchName
				+ " , " + this.v18
				+ " , " + this.v19
				+ " , " + this.v20
				+ " , " + this.uiString
				+ " , " + this.v21
				+ " , " + this.levelRequirement
				+ " , " + this.v22
				+ " , " + this.loadingImage
				+ " , " + this.icon
				+ " , " + this.v23
				+ " , " + this.guiValue
				+ " , " + this.v24
				+ " , " + this.v25
				+ " , " + this.v26
				+ " , " + this.v27
				+ " , " + this.v28
				+ " , " + this.v29
				+ " , " + this.v30
				+ " , " + this.v31
				+ " , " + this.v32
				+ " , " + this.v33
				+ " , " + this.v34
				+ " , " + this.v35
				+ " , " + this.v36
				+ " , " + this.v37 + ")\n";
	}
}