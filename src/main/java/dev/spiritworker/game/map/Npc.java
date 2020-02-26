package dev.spiritworker.game.map;

import dev.spiritworker.game.data.def.NpcDef;
import dev.spiritworker.net.packet.util.PacketWriter;

public class Npc {
    private NpcDef npc;

    public Npc(NpcDef npcdef)
    {
        npc = npcdef;
    }

    public void write(PacketWriter p)
    {
        p.writeUint16(this.npc.getId());
        p.writeFloat(this.npc.getPosition().getX());
        p.writeFloat(this.npc.getPosition().getY());
        p.writeFloat(this.npc.getPosition().getZ());
        p.writeFloat(this.npc.getAngle());

        // can be 1
        p.writeUint32(1);
        p.writeUint32(1);
        p.writeUint32(this.npc.getCurrentStageId());
        p.writeUint32(this.npc.getLevel());
        p.writeUint32(this.npc.getRealId());
    }
}
