package dev.spiritworker.game.data.def;

import java.util.List;
import java.util.LinkedList;
import java.nio.ByteBuffer;

import dev.spiritworker.game.data.ItemStatData;
import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Random_Option.res", idType = ResourceIdType.INT)
public class ReinforceOptionDef extends ResourceDef {

    private int v1;
    private List<ReinforceOption> optionData;
    public  ReinforceOptionDef(int id) { super(id); }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        int[] count = new int[5];
        int[] ids = new int[5];
        float[] values = new float[5];

        v1 = buf.get();
        // Reinforce count needed
        for (int i = 0; i < 5; i++) {
            count[i] = buf.get();
        }
        // Unknown
        buf.get();
        buf.get();
        buf.get();
        buf.get();
        buf.get();
        // Stat id
        for (int i = 0; i < 5; i++) {
            ids[i] = buf.getShort();
        }
        // Stat value
        for (int i = 0; i < 5; i++) {
            values[i] = buf.getInt();
        }

        // Parse
        this.optionData = new LinkedList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                break;
            }

            optionData.add(
                    new ReinforceOption(count[i], new ItemStatData(ids[i], values[i]))
            );
        }
    }

    public List<ReinforceOption> getOptionData() {
        return optionData;
    }

    public class ReinforceOption {
        private int requiredUpgrades;
        private ItemStatData stat;

        private ReinforceOption(int amount, ItemStatData stat) {
            this.requiredUpgrades = amount;
            this.stat = stat;
        }

        public int          getRequiredUpgrades() { return requiredUpgrades; }
        public ItemStatData getStat()             { return stat; }
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.v1
                + " , " + this.optionData + ")\n";
    }
}
