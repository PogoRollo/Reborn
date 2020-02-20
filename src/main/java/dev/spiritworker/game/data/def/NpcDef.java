package dev.spiritworker.game.data.def;

import dev.spiritworker.game.data.ResourceDef;

import java.nio.ByteBuffer;

public class NpcDef extends ResourceDef {

    public NpcDef(int id) {
        super(id);
    }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        byte[] array = new byte[buf.limit()];
        buf.get(array);
        System.out.println(buf.limit());
        for(int i=0; i<buf.limit(); i++)
            System.out.println(array[i]);
    }

    public String getAllInfo()
    {
        return "";
    }
}
