package dev.spiritworker.game.data.def;

import java.util.Set;
import java.util.HashSet;
import java.nio.ByteBuffer;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import dev.spiritworker.game.data.ItemStatData;
import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Item_SetItem.res", idType = ResourceIdType.INT)
public class ItemSetDef extends ResourceDef{

    private int v1;
    private int v2;

    private int itemId1;
    private int itemId2;
    private int itemId3;
    private int itemId4;
    private int itemId5;
    private int itemId6;

    private int[] itemsRequired;

    public ItemSetDef(int id) {
        super(id);
    }

    private Int2ObjectMap<ItemSetBonus> setBonuses;
    public Int2ObjectMap<ItemSetBonus>  getSetBonuses()                        { return setBonuses; }
    public ItemSetBonus                 getBonusWithItemsInSet(int itemsInSet) {
        return setBonuses.get(itemsInSet);
    }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        // Set bonuses
        this.setBonuses = new Int2ObjectOpenHashMap<>();

        // Parse
        this.v1 = ((int) buf.getShort()) & 0xffff;
        this.v2 = buf.get();
        // Item ids in the set
        this.itemId1 = buf.getInt();
        this.itemId2 = buf.getInt();
        this.itemId3 = buf.getInt();
        this.itemId4 = buf.getInt();
        this.itemId5 = buf.getInt();
        this.itemId6 = buf.getInt();
        // Get item count required for each set bonus
        this.itemsRequired = new int[5];
        for (int i = 0; i < 5; i++) {
            int count = buf.get();
            itemsRequired[i] = count;
            if (count != 0) {
                getSetBonuses().put(count, new ItemSetBonus(count));
            }
        }

        // Set
        int[] unk = new int[5];
        int[] ids = new int[5];
        float[] values = new float[5];

        for (int count = 0; count < 4; count++) {
            for (int i = 0; i < 5; i++) {
                unk[i] = buf.get();
            }
            for (int i = 0; i < 5; i++) {
                ids[i] = ((int) buf.getShort()) & 0xffff; // unsigned short
            }
            for (int i = 0; i < 5; i++) {
                values[i] = buf.getFloat();
            }

            for (int i = 0; i < 5; i++) {
                if (ids[i] == 0) {
                    continue;
                }
                ItemSetBonus setBonus = getSetBonuses().get(itemsRequired[i]);
                if (setBonus != null) {
                    setBonus.getStats().add(new ItemStatData(ids[i], values[i]));
                }
            }

        }
    }

    public class ItemSetBonus {
        private transient final int id;
        private Set<ItemStatData> stats;

        public ItemSetBonus(int id) {
            this.id = id;
            stats = new HashSet<>();
        }

        public int getId() {
            return id;
        }

        public Set<ItemStatData> getStats() {
            return stats;
        }
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.setBonuses
                + " , " + this.v1
                + " , " + this.v2
                + " , " + this.itemId1
                + " , " + this.itemId2
                + " , " + this.itemId3
                + " , " + this.itemId4
                + " , " + this.itemId5
                + " , " + this.itemId6
                + " , " + this.itemsRequired + ")\n";
    }
}