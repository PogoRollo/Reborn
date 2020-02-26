package dev.spiritworker.game.data.def;

import dev.spiritworker.SpiritWorker;
import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.util.Position;

import java.nio.ByteBuffer;

public class NpcDef extends ResourceDef {

    public NpcDef(int id) {
        super(id);
    }

    private int id;

    private float x;
    private float y;
    private float z;
    private Position position;

    private float angle;

    private int maxHealth;
    private int waypoint;
    private int currentStageId;
    private int level;
    private int realId;

    private ByteBuffer buf;

    @Override
    public void loadFromRes(ByteBuffer buf) {
        this.buf = buf;
        this.id = buf.getShort();

        this.position = new Position(this.x, this.y, this.z);
    }

    public String getAllInfo()
    {
        return "========================== \n" + "ID : " + id + "     buf-1 " + buf.get() +
                "   buf-2 " + buf.get() +
                "   buf-3 " + buf.get() +
                "   buf-4 " + buf.get() +
                "   buf-5 " + buf.get() +
                "   buf-6 " + buf.get() +
                "   buf-7 " + buf.get() +
                "\n" +
                "   buf-8 " + buf.get() +
                "   buf-9 " + buf.get() +
                "   buf-10 " + buf.get() +
                "   buf-11 " + buf.get() +
                "   buf-12 " + buf.get() +
                "   buf-13 " + buf.get() +
                "\n" +
                "   buf-14 " + buf.get() +
                "   buf-15 " + buf.get() +
                "   buf-16 " + buf.get() +
                "   buf-17 " + buf.get() +
                "   buf-18 " + buf.get() +
                "   buf-19 " + buf.get() +
                "\n" +
                "   buf-20 " + buf.get() +
                "   buf-21 " + buf.get() +
                "   buf-22 " + buf.get() +
                "   buf-23 " + buf.get() +
                "   buf-24 " + buf.get() +
                "   buf-25 " + buf.get() +
                "\n" +
                "   buf-26 " + buf.get() +
                "   buf-27 " + buf.get() +
                "   buf-28 " + buf.get() +
                "   buf-29 " + buf.get() +
                "   buf-30 " + buf.get() +
                "   buf-31 " + buf.get() +
                "\r\n\n";
    }

    @Override
    public int getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public float getAngle() {
        return angle;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getWaypoint() {
        return waypoint;
    }

    public int getCurrentStageId() {
        return currentStageId;
    }

    public int getLevel() {
        return level;
    }

    public int getRealId() {
        return realId;
    }
}
