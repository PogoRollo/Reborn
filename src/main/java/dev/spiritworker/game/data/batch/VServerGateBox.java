package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VServerGateBox extends VBatchBox {

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
    private int m_iNextSectorID;
    private int m_iSectorID;

    public VServerGateBox() { }

    public int      getID()              { return this.m_ID; }
    public int      getGenerateID()      { return this.m_iGenerateID; }
    public int      getNextSectorID()    { return m_iNextSectorID; }
    public int      getSectorID()        { return m_iSectorID; }
    public float    getRotation()        { return this.m_fRotation; }
    public String   getLayerBitmask()    { return this.iLayerBitmask; }
    public String   getColorLDR()        { return m_ColorLDR; }
    public String   getType()            { return m_eType; }
    public boolean  isShowCustomEntity() { return m_bShowCustomEntity; }

    public Position getSize() { return this.m_vSize; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }
}