package dev.spiritworker.game.data.batch;

import java.util.LinkedList;
import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class VBatch {

    private final String name;
    private VStartEventBox startEventBox;
    private VMazeEscapeBox mazeEscapeBox;

    private final List<VPortalBox> portalBoxes;
    private final List<VPortalExitBox> portalExitBoxes;
    private final List<VServerGateBox> gateBoxes;

    private final List<VSectorBox> sectorBoxes;
    private final List<VLuaFunctionBox> luaFunctionBoxes;
    private final List<VMonsterSpawnBox> monsterSpawnBoxes;
    private final List<VCheckMonsterSpawnBox> checkMonsterSpawnBoxes;

    private final List<VWayPoint> wayPoints;
    private final Int2ObjectMap<VCommonPositionBox> positionBoxes;

    public VBatch(String name) {
        this.name = name;

        this.portalBoxes = new LinkedList<>();
        this.portalExitBoxes = new LinkedList<>();
        this.gateBoxes = new LinkedList<>();

        this.sectorBoxes = new LinkedList<>();
        this.luaFunctionBoxes = new LinkedList<>();
        this.monsterSpawnBoxes = new LinkedList<>();
        this.checkMonsterSpawnBoxes = new LinkedList<>();

        this.wayPoints = new LinkedList<>();
        this.positionBoxes = new Int2ObjectOpenHashMap<>();
    }

    public String getName() { return name; }

    public VStartEventBox getStartEventBox() { return startEventBox; }
    public VMazeEscapeBox getMazeEscapeBox() { return mazeEscapeBox; }

    public void setStartEventBox(VStartEventBox vStartEventBox) { this.startEventBox = vStartEventBox; }
    public void setMazeEscapeBox(VMazeEscapeBox vMazeEscapeBox) { this.mazeEscapeBox = vMazeEscapeBox; }

    public List<VPortalBox>            getPortalBoxes()            { return portalBoxes; }
    public List<VPortalExitBox>        getPortalExitBoxes()        { return portalExitBoxes; }
    public List<VServerGateBox>        getGateBoxes()              { return gateBoxes; }
    public List<VSectorBox>            getSectorBoxes()            { return sectorBoxes; }
    public List<VLuaFunctionBox>       getLuaFunctionBoxes()       { return luaFunctionBoxes; }
    public List<VMonsterSpawnBox>      getMonsterSpawnBoxes()      { return monsterSpawnBoxes; }
    public List<VCheckMonsterSpawnBox> getCheckMonsterSpawnBoxes() { return checkMonsterSpawnBoxes; }
    public List<VWayPoint>             getWayPoints()              { return wayPoints; }

    public Int2ObjectMap<VCommonPositionBox> getPositionBoxes() { return positionBoxes; }
}