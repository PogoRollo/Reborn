package dev.spiritworker.game.map;

import dev.spiritworker.game.data.def.DistrictDef;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public class District extends GameMap {
	private final DistrictDef districtDef;
	private Int2ObjectMap<Npc> npcs;

	public District(DistrictDef districtDef) {
		super(districtDef.getId());
		this.districtDef = districtDef;
	}

	public DistrictDef getDef() {
		return districtDef;
	}
}
