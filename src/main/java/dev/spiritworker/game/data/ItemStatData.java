package dev.spiritworker.game.data;

public class ItemStatData {
    private int id;
    private float value;

    public ItemStatData(int id, float value) {
        this.id = id;
        this.value = value;
    }

    public int getId()      { return id; }
    public float getValue() { return value; }

    public void setId(int id)       { this.id = id; }
    public void setValue(int value) { this.value = value; }
}