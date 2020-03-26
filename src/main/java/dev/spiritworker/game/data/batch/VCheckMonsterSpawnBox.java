package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VCheckMonsterSpawnBox extends VBatchBox{

    private int m_ID;
    private int m_iGenerateID;
    private String iLayerBitmask;
    private Position m_vPosTopLeft;
    private Position m_vPosBottomRight;
    private float m_fRotation;
    private Position m_vSize;
    private boolean m_bShowCustomEntity;
    private String m_ColorLDR;
    private String m_eType;
    private int m_iLoopCount;
    private int m_iEntityID;
    private int m_iCheckBox_0;
    private int m_iCheckBox_1;
    private int m_iCheckBox_2;
    private int m_iCheckBox_3;
    private int m_iCheckBox_4;
    private int m_iCheckBox_5;
    private int m_iCheckBox_6;
    private int m_iCheckBox_7;
    private int m_iCheckBox_8;
    private int m_iCheckBox_9;

    public VCheckMonsterSpawnBox() {}

    public int     getID()                { return this.m_ID; }
    public int     getGenerateID()        { return this.m_iGenerateID; }
    public float   getRotation()          { return this.m_fRotation; }
    public String  getLayerBitmask()      { return this.iLayerBitmask; }
    public String  getColorLDR()          { return this.m_ColorLDR; }
    public String  getType()              { return this.m_eType; }
    public boolean getShowCustomEntity()  { return this.m_bShowCustomEntity; }

    public int getLoopCount() { return this.m_iLoopCount; }
    public int getEntityID() { return this.m_iEntityID; }

    public int getCheckBox_0() { return this.m_iCheckBox_0; }
    public int getCheckBox_1() { return this.m_iCheckBox_1; }
    public int getCheckBox_2() { return this.m_iCheckBox_2; }
    public int getCheckBox_3() { return this.m_iCheckBox_3; }
    public int getCheckBox_4() { return this.m_iCheckBox_4; }
    public int getCheckBox_5() { return this.m_iCheckBox_5; }
    public int getCheckBox_6() { return this.m_iCheckBox_6; }
    public int getCheckBox_7() { return this.m_iCheckBox_7; }
    public int getCheckBox_8() { return this.m_iCheckBox_8; }
    public int getCheckBox_9() { return this.m_iCheckBox_9; }

    public Position getSize() { return this.m_vSize; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }
}