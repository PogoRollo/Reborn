package dev.spiritworker.game.data.batch;

import java.lang.reflect.Field;

import dev.spiritworker.util.Position;

public abstract class VBatchBox {

    private transient Position center;

    private transient float halfX;
    private transient float halfY;
    private transient float halfZ;

    public abstract Position getPosTopLeft();
    public abstract Position getPosBottomRight();

    public Position getCenter() {
        if (this.center == null) {
            this.calcCenter();
        }
        return this.center;
    }

    private void calcCenter() {
        if (this.center != null) {
            return;
        }

        this.center = new Position();
        this.halfX = ((getPosTopLeft().getX() + getPosBottomRight().getX()) / 2);
        this.halfY = ((getPosTopLeft().getY() + getPosBottomRight().getY()) / 2);
        this.halfZ = ((getPosTopLeft().getZ() + getPosBottomRight().getZ()) / 2);

        getCenter().set(
                this.halfX,
                this.halfY,
                this.halfZ
        );
    }

    public boolean contains(Position pos) {
        return getPosTopLeft().getX() <= pos.getX() &&
                pos.getX() <= getPosBottomRight().getX() &&
                getPosTopLeft().getY() <= pos.getY() &&
                pos.getY() <= getPosBottomRight().getY();
    }

    public String getField(String name) {
        try {
            Field f = getClass().getDeclaredField(name);
            if (f != null) {
                f.setAccessible(true);
                return (String) f.get(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getIntField(String name) {
        try {
            Field f = getClass().getDeclaredField(name);
            if (f != null) {
                f.setAccessible(true);
                return f.getInt(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}