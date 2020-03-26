package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VMazeEscapeBox extends VBatchBox {

    private int m_ID;
    private int m_iGenerateID;
    private String iLayerBitmask;
    private Position m_vPosTopLeft;
    private Position m_vPosBottomRight;
    private float m_fRotation;
    private Position m_vSize;
    private boolean m_bShowCustomEntity;
    private String m_ColorLDR;
    private int m_iField;
    private int m_iEventObject;

    public VMazeEscapeBox() {}

    public int     getID()               { return this.m_ID; }
    public int     getGenerateID()       { return this.m_iGenerateID; }
    public int     getField()            { return this.m_iField; }
    public int     getEventObject()      { return this.m_iEventObject; }
    public float   getRotation()         { return this.m_fRotation; }
    public String  getLayerBitmask()     { return this.iLayerBitmask; }
    public String  getColorLDR()         { return this.m_ColorLDR; }
    public boolean getShowCustomEntity() { return this.m_bShowCustomEntity; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }

    public Position getSize() { return this.m_vSize; }
}