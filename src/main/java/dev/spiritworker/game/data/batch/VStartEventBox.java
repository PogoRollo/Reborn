package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VStartEventBox extends VBatchBox {

    private int m_ID;
    private int m_iGenerateID;
    private String iLayerBitmask;
    private Position m_vPosTopLeft;
    private Position m_vPosBottomRight;
    private float m_fRotation;
    private Position m_vSize;
    private boolean m_bShowCustomEntity;
    private String m_ColorLDR;
    private String m_eSpawnType;

    public VStartEventBox() {}

    public int     getID()               { return   this.m_ID; }
    public int     getGenerateID()       { return this.m_iGenerateID; }
    public float   getRotation()         { return this.m_fRotation; }
    public String  getLayerBitmask()     { return this.iLayerBitmask; }
    public String  getColorLDR()         { return this.m_ColorLDR; }
    public String  getSpawnType()        { return this.m_eSpawnType; }
    public boolean getShowCustomEntity() { return this.m_bShowCustomEntity; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }

    public Position getSize() { return this.m_vSize; }
}