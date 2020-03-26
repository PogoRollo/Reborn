package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VWayPoint extends VBatchBox {

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
    private String m_eBattleType;
    private int m_iBeforePoint;
    private int m_iNextPoint;
    private int m_iNextPoint2;
    private int m_iNextPoint3;
    private int m_iNextPoint4;
    private String m_szIdleAction;
    private int m_uiIdleActionRatio;
    private int m_uiDelayTime;
    private int m_RepeatCount;

    public VWayPoint() {}

    public int     getID()               { return this.m_ID; }
    public int     getGenerateID()       { return this.m_iGenerateID; }
    public float   getRotation()         { return this.m_fRotation; }
    public int     getBeforePoint()      { return m_iBeforePoint; }
    public int     getNextPoint()        { return m_iNextPoint; }
    public int     getNextPoint2()       { return m_iNextPoint2; }
    public int     getNextPoint3()       { return m_iNextPoint3; }
    public int     getNextPoint4()       { return m_iNextPoint4; }
    public int     getIdleActionRatio()  { return m_uiIdleActionRatio; }
    public int     getDelayTime()        { return m_uiDelayTime; }
    public int     getRepeatCount()      { return m_RepeatCount; }
    public String  getLayerBitmask()     { return this.iLayerBitmask; }
    public String  getColorLDR()         { return this.m_ColorLDR; }
    public String  getType()             { return this.m_eType; }
    public String  getIdleAction()       { return m_szIdleAction; }
    public String  getBattleType()       { return m_eBattleType; }
    public boolean getShowCustomEntity() { return this.m_bShowCustomEntity; }

    public Position getSize() { return this.m_vSize; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }
}