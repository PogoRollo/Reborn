package dev.spiritworker.game.data.def;

import java.nio.ByteBuffer;

import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

import dev.spiritworker.game.data.batch.VBatch;
import dev.spiritworker.game.data.spawns.MapData;
import dev.spiritworker.game.data.MapResourceLoader;

@ResourceType(name = "tb_district.res", idType = ResourceIdType.SHORT)
public class DistrictDef extends ResourceDef{

	private String name;
	private transient MapData data;
	private transient VBatch batch;

	private int v1;
	private int v2;
	private int v3;
	private int v4;
	private int v5;
	private int v6;
	private int v7;
	private int v8;
	private int v9;
	private int v10;

	public DistrictDef(int id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setData(MapData data) {
		this.data = data;
	}

	public MapData getData() {
		return this.data;
	}

	public VBatch getBatch() {
		return batch;
	}

	@Override
	public void loadFromRes(ByteBuffer buf) {
		this.v1 = buf.getShort();
		this.v2 = buf.getShort();
		this.v3 = buf.getShort();
		readString(buf);
		this.name = readString(buf);
		this.v4 = buf.getShort();
		this.v5 = buf.getInt();
		this.v6 = buf.getInt();
		readString(buf);
		readString(buf);
		this.v7 =buf.get();
		this.v8 =buf.get();

		this.readString(buf);
		this.v9 =buf.get();
		this.v10 =buf.get();

		loadBatch();
	}

	public float getUnk1() {
		return this.v5;
	}
	public float getUnk2() {
		return this.v6;
	}

	private void loadBatch() {
		this.batch = MapResourceLoader.getBatchCache().get(getName());
	}

	@Override
	public String toString() {
		return "[" + this.getId() + "]"
				+ " ( " + this.v1
				+ " , " + this.v2
				+ " , " + this.v3
				+ " , " + this.v4
				+ " , " + this.v5
				+ " , " + this.v6
				+ " , " + this.v7
				+ " , " + this.v8
				+ " , " + this.v9
				+ " , " + this.v10 + ")\n";
	}
}