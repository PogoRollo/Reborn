package dev.spiritworker.game.data.def;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Dye_Info.res", idType = ResourceIdType.SHORT)
public class DyeInfoDef extends ResourceDef{

    private int dyeItemId;
    private int randomDyeItemId;

    private ArrayList<Integer> regularDyeIds;
    private ArrayList<Integer> randomDyeIds;

    private int v2;
    private int v14;
    private int v15;
    private int v16;
    private int v17;
    private int v18;
    private int v19;
    private int v20;
    private int v21;
    private int v22;
    private int v23;
    private int v24;
    private int v25;
    private int v26;
    private int v27;
    private int v28;
    private int v29;
    private int v30;
    private int v31;
    private int v32;
    private int v33;
    private int v34;

    public DyeInfoDef(int id) {
        super(id);
    }
    public ArrayList<Integer> getRegularDyeIds() {
        return regularDyeIds;
    }
    public ArrayList<Integer> getRandomDyeIds()  { return randomDyeIds; }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        this.dyeItemId = buf.getInt();
        v2 = buf.getInt();	// Always 1, probably the amount of dyes it costs

        this.regularDyeIds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int dyeId = buf.getShort();
            if (dyeId != 0) {
                getRegularDyeIds().add(dyeId);
            }
        }

        this.randomDyeItemId = buf.getInt();
        v14 = buf.get();	// Always 1, probably the amount of dyes it costs

        this.randomDyeIds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int dyeId = buf.getShort();
            if (dyeId != 0) {
                getRandomDyeIds().add(dyeId);
            }
        }

        v25 = buf.getShort();
        v26 = buf.getShort();
        v27 = buf.getShort();
        v28 = buf.getShort();
        v29 = buf.getShort();
        v30 = buf.getShort();
        v31 = buf.getShort();
        v32 = buf.getShort();
        v33 = buf.getShort();
        v34 = buf.getShort();
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.dyeItemId
                + " , " + this.v2
                + " , " + this.regularDyeIds
                + " , " + this.randomDyeItemId
                + " , " + this.v14
                + " , " + this.randomDyeIds
                + " , " + this.v25
                + " , " + this.v26
                + " , " + this.v27
                + " , " + this.v28
                + " , " + this.v29
                + " , " + this.v30
                + " , " + this.v31
                + " , " + this.v32
                + " , " + this.v33
                + " , " + this.v34 + ")\n";
    }
}