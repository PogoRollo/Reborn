package dev.spiritworker.game.data.def;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import dev.spiritworker.game.data.ItemStatData;
import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Title_Info.res", idType = ResourceIdType.INT, scriptFile = "tb_Title_String.res")
public class TitleDef extends ResourceDef{

    private String name;
    private String s_v2;
    private String s_v3;

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
    private int v11;
    private int v12;

    private List<ItemStatData> stats;

    public TitleDef(int id) {
        super(id);
    }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        v1 = buf.getInt();
        v2 = buf.get();
        v3 = buf.get();
        v4 = buf.getShort();
        v5 = buf.get();
        v6 = buf.getInt();
        v7 = buf.get();
        v8 = buf.get();
        v9 = buf.get();
        v10 = buf.get();
        v11 = buf.get();
        v12 = buf.get();
        // Stat ids
        this.stats = new ArrayList<>(5);

        int[] ids = new int[5];
        float[] values = new float[5];

        // Get data
        for (int i = 0; i < 5; i++) {
            ids[i] = ((int) buf.getShort()) & 0xffff; // unsigned short
        }
        for (int i = 0; i < 5; i++) {
            values[i] = buf.getFloat();
        }

        // Push to stats list
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == 0) {
                continue;
            }
            this.getStats().add(new ItemStatData(ids[i], values[i]));
        }
    }

    @Override
    public void loadScriptFromRes(ByteBuffer buf) {
        name = readString(buf);
        s_v2 = readString(buf);
        s_v3 = readString(buf);
    }

    public boolean isPrimaryTitle() {
        // TODO Auto-generated method stub
        return v2 == 0;
    }
    public boolean isSecondaryTitle() {
        // TODO Auto-generated method stub
        return v2 == 1;
    }

    public List<ItemStatData> getStats() {
        return stats;
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.name
                + " ( " + this.v1
                + " , " + this.v2
                + " , " + this.v3
                + " , " + this.v4
                + " , " + this.v5
                + " , " + this.v6
                + " , " + this.v7
                + " , " + this.v8
                + " , " + this.v9
                + " , " + this.v10
                + " , " + this.v11
                + " , " + this.v12
                + " , " + this.s_v2
                + " , " + this.s_v3
                + " , " + this.stats + ")\n";
    }
}