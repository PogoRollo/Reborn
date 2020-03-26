package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VSectorBox extends VBatchBox {

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
    private String m_szEnterLua;
    private String m_eClearType;
    private int m_iClearKillRatio;
    private String m_szClearLua;
    private int m_iSectorTitle;
    private String m_iSectorExitType;
    private int m_iSectorExitID;
    private int m_iRelativeSectorID;
    private int m_iConditionKillRatio_1Step;
    private int m_iConditionKillRatio_2Step;
    private int m_iConditionKillRatio_3Step;
    private int m_iConditionKillRatio_4Step;
    private int m_iConditionKillRatio_5Step;

    public VSectorBox() {}

    public int     getID()                        { return this.m_ID; }
    public int     getGenerateID()                { return this.m_iGenerateID; }
    public int     getClearKillRatio()            { return this.m_iClearKillRatio; }
    public int     getSectorTitle()               { return this.m_iSectorTitle; }
    public int     getSectorExitID()              { return this.m_iSectorExitID; }
    public int     getRelativeSectorID()          { return this.m_iRelativeSectorID; }
    public float   getRotation()                  { return this.m_fRotation; }
    public String  getLayerBitmask()              { return this.iLayerBitmask; }
    public String  getColorLDR()                  { return this.m_ColorLDR; }
    public String  getType()                      { return this.m_eType; }
    public String  getEnterLua()                  { return this.m_szEnterLua; }
    public String  getClearType()                 { return this.m_eClearType; }
    public String  getClearLua()                  { return this.m_szClearLua; }
    public String  getSectorExitType()            { return this.m_iSectorExitType; }
    public boolean getShowCustomEntity()          { return this.m_bShowCustomEntity; }
    public int     getConditionKillRatio_1Step()  { return this.m_iConditionKillRatio_1Step; }
    public int     getConditionKillRatio_2Step()  { return this.m_iConditionKillRatio_2Step; }
    public int     getConditionKillRatio_3Step()  { return this.m_iConditionKillRatio_3Step; }
    public int     getConditionKillRatio_4Step()  { return this.m_iConditionKillRatio_4Step; }
    public int     getConditionKillRatio_5Step()  { return this.m_iConditionKillRatio_5Step; }

    public Position getSize() { return this.m_vSize; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }
}