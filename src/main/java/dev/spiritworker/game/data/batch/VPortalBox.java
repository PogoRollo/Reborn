package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VPortalBox extends VBatchBox {

    private int m_ID;
    private int m_iGenerateID;
    private String iLayerBitmask;
    private Position m_vPosTopLeft;
    private Position m_vPosBottomRight;
    private float m_fRotation;
    private Position m_vSize;
    private boolean m_bShowCustomEntity;
    private String m_ColorLDR;
    private boolean m_bShowGUI;
    private int m_iGUI;
    private String m_eJumpType;
    private int m_iJumpMap;
    private int m_iJump;
    private String m_eEffectType;
    private String m_szDisableEffect;
    private String m_szEnableEffect;
    private int m_iUIString;
    private int m_iNextSectorID;
    private boolean m_bCallScript;
    private int m_uiOpenEpisode;
    private int m_uiCompleteEpisode;
    private float m_fStringOffsetX;
    private float m_fStringOffsetY;
    private float m_fStringOffsetZ;
    private int m_iClearSectorID1;
    private int m_iClearSectorID2;
    private int m_iClearSectorID3;
    private int m_iClearSectorID4;
    private int m_iClearSectorID5;
    private float m_fClearSectorChance1;
    private float m_fClearSectorChance2;
    private float m_fClearSectorChance3;
    private float m_fClearSectorChance4;
    private float m_fClearSectorChance5;
    private int m_iMaxUserCount;
    private int m_iMaxTimeCount;

    public VPortalBox() {}

    public int      getID()               { return this.m_ID; }
    public int      getGenerateID()       { return this.m_iGenerateID; }
    public String   getLayerBitmask()     { return this.iLayerBitmask; }
    public float    getRotation()         { return this.m_fRotation; }
    public Position getSize()             { return this.m_vSize; }
    public boolean  getShowCustomEntity() { return this.m_bShowCustomEntity; }
    public String   getColorLDR()         { return this.m_ColorLDR; }
    public boolean  getShowGUI()          { return this.m_bShowGUI; }
    public int      getGUI()              { return this.m_iGUI; }
    public String   getJumpType()         { return this.m_eJumpType; }
    public int      getJumpMap()          { return this.m_iJumpMap; }
    public int      getJump()             { return this.m_iJump; }

    public String getEffectType()    { return this.m_eEffectType; }
    public String getDisableEffect() { return this.m_szDisableEffect; }
    public String getEnableEffect()  { return this.m_szEnableEffect; }

    public int getUIString()     { return this.m_iUIString; }
    public int getNextSectorID() { return this.m_iNextSectorID; }

    public boolean getCallScript()  { return this.m_bCallScript; }

    public int getOpenEpisode()     { return this.m_uiOpenEpisode; }
    public int getCompleteEpisode() { return this.m_uiCompleteEpisode; }

    public float getStringOffsetX() { return this.m_fStringOffsetX; }
    public float getStringOffsetY() { return this.m_fStringOffsetY; }
    public float getStringOffsetZ() { return this.m_fStringOffsetZ; }

    public int getClearSectorID1() { return this.m_iClearSectorID1; }
    public int getClearSectorID2() { return this.m_iClearSectorID2; }
    public int getClearSectorID3() { return this.m_iClearSectorID3; }
    public int getClearSectorID4() { return this.m_iClearSectorID4; }
    public int getClearSectorID5() { return this.m_iClearSectorID5; }

    public float getClearSectorChance1() { return this.m_fClearSectorChance1; }
    public float getClearSectorChance2() { return this.m_fClearSectorChance2; }
    public float getClearSectorChance3() { return this.m_fClearSectorChance3; }
    public float getClearSectorChance4() { return this.m_fClearSectorChance4; }
    public float getClearSectorChance5() { return this.m_fClearSectorChance5; }

    public int getMaxUserCount() { return this.m_iMaxUserCount; }
    public int getMaxTimeCount() { return this.m_iMaxTimeCount; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }

    // Custom
    /** public Position getExitPosition() {
        // TODO cache to optimize
        return getCenter().clone().translateWithDegrees(200, getRotation());
    } */
}