package dev.spiritworker.game.data.batch;

import dev.spiritworker.util.Position;

public class VMonsterSpawnBox extends VBatchBox {

    private int m_ID;
    private int m_iGenerateID;
    private String iLayerBitmask;
    private Position m_vPosTopLeft;
    private Position m_vPosBottomRight;
    private float m_fRotation;
    private Position m_vSize;
    private boolean m_bShowCustomEntity;
    private String m_ColorLDR;
    private String m_eType1;
    private int m_iMonsterID1;
    private int m_iChance1;
    private String m_eType2;
    private int m_iMonsterID2;
    private int m_iChance2;
    private String m_eType3;
    private int m_iMonsterID3;
    private int m_iChance3;
    private String m_eType4;
    private int m_iMonsterID4;
    private int m_iChance4;
    private String m_eType5;
    private int m_iMonsterID5;
    private int m_iChance5;
    private String m_eType6;
    private int m_iMonsterID6;
    private int m_iChance6;
    private String m_eType7;
    private int m_iMonsterID7;
    private int m_iChance7;
    private String m_eType8;
    private int m_iMonsterID8;
    private int m_iChance8;
    private String m_eType9;
    private int m_iMonsterID9;
    private int m_iChance9;
    private String m_eType10;
    private int m_iMonsterID10;
    private int m_iChance10;
    private String m_eCreationPositionType;
    private String m_eMoveType;
    private String m_eCreationCondition;
    private String m_CreationEffectFile;
    private float m_fWaitCreationDelayTime;
    private float m_fWaitCreationSequenceTime;
    private int m_iWaitCreationMaxWave;
    private int m_iMaxEntityCount;
    private String m_eWaitCreationSequenceType;
    private int m_iWaypoint;
    private int m_iAggroGroupID;
    private int m_iAggroDistance;
    private int m_iAggroMaxCount;
    private float m_fLookRatio;
    private boolean m_bShowSight;
    private String m_szObjectKey;
    private String m_eScriptType;
    private int m_iCheckScriptHP1;
    private int m_iCheckScriptHP2;
    private int m_iCheckScriptHP3;
    private int m_iCheckScriptHP4;
    private int m_iCheckScriptHP5;
    private int m_iSectorID;
    private String m_ChangeSpawnAction;
    private int m_ProtectionTarget;
    private float m_RespawnTime;
    private int m_iStep;
    private String m_eRespawnType;
    private int m_iRespawnCondition;
    private int m_iGroupID;

    public VMonsterSpawnBox() {}

    public int      getID()                        { return this.m_ID; }
    public int      getGenerateID()                { return this.m_iGenerateID; }
    public String   getLayerBitmask()              { return this.iLayerBitmask; }
    public float    getRotation()                  { return this.m_fRotation; }
    public Position getSize()                      { return this.m_vSize; }
    public boolean  getShowCustomEntity()          { return this.m_bShowCustomEntity; }
    public String   getColorLDR()                  { return this.m_ColorLDR; }
    public String   getType1()                     { return this.m_eType1; }
    public int      getMonsterID1()                { return this.m_iMonsterID1; }
    public int      getChance1()                   { return this.m_iChance1; }
    public String   getType2()                     { return this.m_eType2; }
    public int      getMonsterID2()                { return this.m_iMonsterID2; }
    public int      getChance2()                   { return this.m_iChance2; }
    public String   getType3()                     { return this.m_eType3; }
    public int      getMonsterID3()                { return this.m_iMonsterID3; }
    public int      getChance3()                   { return this.m_iChance3; }
    public String   getType4()                     { return this.m_eType4; }
    public int      getMonsterID4()                { return this.m_iMonsterID4; }
    public int      getChance4()                   { return this.m_iChance4; }
    public String   getType5()                     { return this.m_eType5; }
    public int      getMonsterID5()                { return this.m_iMonsterID5; }
    public int      getChance5()                   { return this.m_iChance5; }
    public String   getType6()                     { return this.m_eType6; }
    public int      getMonsterID6()                { return this.m_iMonsterID6; }
    public int      getChance6()                   { return this.m_iChance6; }
    public String   getType7()                     { return this.m_eType7; }
    public int      getMonsterID7()                { return this.m_iMonsterID7; }
    public int      getChance7()                   { return this.m_iChance7; }
    public String   getType8()                     { return this.m_eType8; }
    public int      getMonsterID8()                { return this.m_iMonsterID8; }
    public int      getChance8()                   { return this.m_iChance8; }
    public String   getType9()                     { return this.m_eType9; }
    public int      getMonsterID9()                { return this.m_iMonsterID9; }
    public int      getChance9()                   { return this.m_iChance9; }
    public String   getType10()                    { return this.m_eType10; }
    public int      getMonsterID10()               { return this.m_iMonsterID10; }
    public int      getChance10()                  { return this.m_iChance10; }
    public String   getCreationPositionType()      { return this.m_eCreationPositionType; }
    public String   getMoveType()                  { return this.m_eMoveType; }
    public String   getCreationCondition()         { return this.m_eCreationCondition; }
    public String   getCreationEffectFile()        { return this.m_CreationEffectFile; }
    public float    getWaitCreationDelayTime()     { return this.m_fWaitCreationDelayTime; }
    public float    getWaitCreationSequenceTime()  { return this.m_fWaitCreationSequenceTime; }
    public int      getWaitCreationMaxWave()       { return this.m_iWaitCreationMaxWave; }
    public int      getMaxEntityCount()            { return this.m_iMaxEntityCount; }
    public String   getWaitCreationSequenceType()  { return this.m_eWaitCreationSequenceType; }
    public int      getWaypoint()                  { return this.m_iWaypoint; }
    public int      getAggroGroupID()              { return this.m_iAggroGroupID; }
    public int      getAggroDistance()             { return this.m_iAggroDistance; }
    public int      getAggroMaxCount()             { return this.m_iAggroMaxCount; }
    public float    getLookRatio()                 { return this.m_fLookRatio; }
    public boolean  getShowSight()                 { return this.m_bShowSight; }
    public String   getObjectKey()                 { return this.m_szObjectKey; }
    public String   getScriptType()                { return this.m_eScriptType; }
    public int      getCheckScriptHP1()            { return this.m_iCheckScriptHP1; }
    public int      getCheckScriptHP2()            { return this.m_iCheckScriptHP2; }
    public int      getCheckScriptHP3()            { return this.m_iCheckScriptHP3; }
    public int      getCheckScriptHP4()            { return this.m_iCheckScriptHP4; }
    public int      getCheckScriptHP5()            { return this.m_iCheckScriptHP5; }
    public int      getSectorID()                  { return this.m_iSectorID; }
    public String   getChangeSpawnAction()         { return this.m_ChangeSpawnAction; }
    public int      getProtectionTarget()          { return this.m_ProtectionTarget; }
    public float    getRespawnTime()               { return this.m_RespawnTime; }
    public int      getStep()                      { return this.m_iStep; }
    public String   getRespawnType()               { return this.m_eRespawnType; }
    public int      getRespawnCondition()          { return this.m_iRespawnCondition; }
    public int      getGroupID()                   { return this.m_iGroupID; }

    @Override
    public Position getPosTopLeft() { return this.m_vPosTopLeft; }

    @Override
    public Position getPosBottomRight() { return this.m_vPosBottomRight; }
}