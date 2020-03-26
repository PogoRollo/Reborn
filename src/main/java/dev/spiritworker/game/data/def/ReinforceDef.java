package dev.spiritworker.game.data.def;

import java.nio.ByteBuffer;

import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

@ResourceType(name = "tb_Reinforce.res", idType = ResourceIdType.INT)
public class ReinforceDef extends ResourceDef{

    private int v1;	// Unknown
    private int maxUpgrades;
    private int maxUpgradeAttempts;
    private int v4; // Unknown

    private int[] etherCost;
    private int[] zennyCost;
    private int[] bpCost;

    private int[] upgradeMaterialId1;
    private int[] upgradeMaterialCost1;

    private int[] upgradeMaterialId2;
    private int[] upgradeMaterialCost2;

    private float[] damageModifier;

    public ReinforceDef(int id) {
        super(id);
    }

    @Override
    public void loadFromRes(ByteBuffer buf) {
        this.v1 = buf.get();
        this.maxUpgrades = buf.getShort();
        this.maxUpgradeAttempts = buf.getShort();
        this.v4 = buf.getShort();

        // Cost
        this.etherCost = new int[10];
        for (int i = 0; i < 10; i++) {
            this.etherCost[i] = buf.getInt();
        }

        this.zennyCost = new int[10];
        for (int i = 0; i < 10; i++) {
            this.zennyCost[i] = buf.getInt();
        }

        this.bpCost = new int[10];
        for (int i = 0; i < 10; i++) {
            this.bpCost[i] = buf.getInt();
        }

        // Upgrade materials
        this.upgradeMaterialId1 = new int[10];
        for (int i = 0; i < 10; i++) {
            this.upgradeMaterialId1[i] = buf.getInt();
        }

        this.upgradeMaterialCost1 = new int[10];
        for (int i = 0; i < 10; i++) {
            this.upgradeMaterialCost1[i] = buf.getShort();
        }

        this.upgradeMaterialId2 = new int[10];
        for (int i = 0; i < 10; i++) {
            this.upgradeMaterialId2[i] = buf.getInt();
        }

        this.upgradeMaterialCost2 = new int[10];
        for (int i = 0; i < 10; i++) {
            this.upgradeMaterialCost2[i] = buf.getShort();
        }

        // Damage boost
        this.damageModifier = new float[11];
        this.damageModifier[0] = 1.0f;
        for (int i = 1; i < 11; i++) {
            this.damageModifier[i] = (buf.getFloat() / 100f) + 1.0f;
        }
    }

    public int      getMaxUpgrades()           { return maxUpgrades; }
    public int      getMaxUpgradeAttempts()    { return maxUpgradeAttempts; }
    public int[]    getEtherCost()             { return etherCost; }
    public int[]    getZennyCost()             { return zennyCost; }
    public int[]    getBpCost()                { return bpCost; }
    public int[]    getUpgradeMaterialId1()    { return upgradeMaterialId1; }
    public int[]    getUpgradeMaterialCost1()  { return upgradeMaterialCost1; }
    public int[]    getUpgradeMaterialId2()    { return upgradeMaterialId2; }
    public int[]    getUpgradeMaterialCost2()  { return upgradeMaterialCost2; }
    public float[]  getDamageModifier()        { return damageModifier; }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.v1
                + " , " + this.maxUpgrades
                + " , " + this.maxUpgradeAttempts
                + " , " + this.v4
                + " , " + this.etherCost
                + " , " + this.zennyCost
                + " , " + this.bpCost
                + " , " + this.upgradeMaterialId1
                + " , " + this.upgradeMaterialCost1
                + " , " + this.upgradeMaterialId2
                + " , " + this.upgradeMaterialCost2
                + " , " + this.damageModifier + ")\n";
    }
}
