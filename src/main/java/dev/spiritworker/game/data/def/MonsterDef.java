package dev.spiritworker.game.data.def;

import java.nio.ByteBuffer;

import dev.spiritworker.game.data.ResourceDef;

public class MonsterDef extends ResourceDef {
	private String v1;
	private int v2;
	private int v3;
	private String v4;
	private String v5;
	private int v6;
	private int v7;
	private int v8;
	private int v9;
	private int v10;
	private int v11;
	private int v12;
	private int v13;
	private int v14;
	private int v15;
	private int v16;
	private int v17;
	private int v18;
	private int v19;
	private int v20;
	private int v21;
	private int v22;
	private int v23;
	private int v24;
	private int v25;
	private String v26;
	private String v27;
	private int v28;
	private int v29;
	private int v30;
	private int v31;
	private int v32;
	private int v33;
	private int v34;
	private int v35;
	private int v36;
	private int v37;
	private int v38;
	private int v39;
	private int v40;
	private int v41;
	private int v42;
	private int v43;
	private int v44;
	private int v45;
	private int v46;
	private String v47;
	private int v48;
	private int v49;
	private int v50;
	private String v51;
	private String v52;
	private int v53;
	private int v54;
	private int v55;
	private int v56;
	private int v57;
	private int v58;
	private String v59;
	private String v60;
	private String v61;
	private int v62;
	private int v63;
	private int v64;
	private String v65;
	private String v66;
	private String v67;
	private int v68;
	private int v69;
	private int v70;
	private int v71;
	private int v72;
	private int v73;
	private int v74;
	private int v75;
	private int v76;
	private int v77;
	private int v78;
	private int v79;
	private String v80;
	private String v81;
	private String v82;
	private int v83;
	private int v84;
	private int v85;
	private int v86;
	private int v87;
	private int v88;
	private int v89;
	private int v90;
	private int v91;
	private int v92;
	private int v93;
	private int v94;
	private int v95;
	private int v96;
	private float v97;
	private int v98;
	private int v99;
	private int v100;
	private int v101;
	private int v102;
	private int v103;
	private String v104;
	private int v105;
	private int v106;
	private float v107;
	private int v108;
	private int v109;
	private int v110;
	private int v111;
	private int v112;
	private int v113;
	private int v114;
	private int v115;
	private int v116;
	private int v117;
	private int v118;
	private int v119;
	private int v120;
	private int v121;
	private int v122;
	private int v123;
	private int v124;
	private int v125;
	private int v126;
	private int v127;
	private int v128;
	private int v129;
	private int v130;
	private int v131;
	private int v132;
	private int v133;
	private int v134;
	private int v135;
	private int v136;
	private int v137;
	private int v138;
	private int v139;
	private int v140;
	private int v141;
	private int v142;
	private int v143;
	private int v144;
	private int v145;
	private int v146;
	private int v147;
	private String v148;
	private String v149;
	private String v150;
	private String v151;
	private int v152;
	private int v153;

	public MonsterDef(int id) {
		super(id);
	}

	@Override
	public void loadFromRes(ByteBuffer buf) {
		v1 = readString(buf);
		v2 = buf.getInt();
		v3 = buf.getInt();
		v4 = readString(buf);
		v5 = readString(buf);
		v6 = buf.getInt();
		v7 = buf.getInt();
		v8 = buf.getInt();
		v9 = buf.get();
		v10 = buf.getInt();
		v11 = buf.getInt();
		v12 = buf.getInt();
		v13 = buf.getInt();
		v14 = buf.getInt();
		v15 = buf.getInt();
		v16 = buf.getInt();
		v17 = buf.getInt();
		v18 = buf.get();
		v19 = buf.get();
		v20 = buf.get();
		v21 = buf.get();
		v22 = buf.get();
		v23 = buf.get();
		v24 = buf.get();
		v25 = buf.get();
		v26 = readString(buf);
		v27 = readString(buf);
		v28 = buf.get();
		v29 = buf.get();
		v30 = buf.get();
		v31 = buf.getInt();
		v32 = buf.get();
		v33 = buf.get();
		v34 = buf.get();
		v35 = buf.get();
		v36 = buf.get();
		v37 = buf.get();
		v38 = buf.getShort();
		v39 = buf.getShort();
		v40 = buf.getShort();
		v41 = buf.getShort();
		v42 = buf.get();
		v43 = buf.getInt();
		v44 = buf.getShort();
		v45 = buf.get();
		v46 = buf.get();
		v47 = readString(buf);
		v48 = buf.get();
		v49 = buf.get();
		v50 = buf.getInt();
		v51 = readString(buf);
		v52 = readString(buf);
		v53 = buf.get();
		v54 = buf.getShort();
		v55 = buf.get();
		v56 = buf.get();
		v57 = buf.get();
		v58 = buf.getShort();
		v59 = readString(buf);
		v60 = readString(buf);
		v61 = readString(buf);
		v62 = buf.get();
		v63 = buf.get();
		v64 = buf.get();
		v65 = readString(buf);
		v66 = readString(buf);
		v67 = readString(buf);
		v68 = buf.getInt();
		v69 = buf.getInt();
		v70 = buf.getInt();
		v71 = buf.get();
		v72 = buf.get();
		v73 = buf.get();
		v74 = buf.getInt();
		v75 = buf.getInt();
		v76 = buf.getInt();
		v77 = buf.get();
		v78 = buf.get();
		v79 = buf.get();
		v80 = readString(buf);
		v81 = readString(buf);
		v82 = readString(buf);
		v83 = buf.getShort();
		v84 = buf.getShort();
		v85 = buf.getInt();
		v86 = buf.getInt();
		v87 = buf.getInt();
		v88 = buf.getInt();
		v89 = buf.getInt();
		v90 = buf.getInt();
		v91 = buf.getInt();
		v92 = buf.getInt();
		v93 = buf.getInt();
		v94 = buf.getInt();
		v95 = buf.getInt();
		v96 = buf.getInt();
		v97 = buf.getFloat();
		v98 = buf.getInt();
		v99 = buf.get();
		v100 = buf.getShort();
		v101 = buf.getShort();
		v102 = buf.get();
		v103 = buf.get();
		v104 = readString(buf);
		v105 = buf.getShort();
		v106 = buf.getShort();
		v107 = buf.getFloat();
		v108 = buf.getShort();
		v109 = buf.get();
		v110 = buf.getInt();
		v111 = buf.getShort();
		v112 = buf.getShort();
		v113 = buf.get();
		v114 = buf.getInt();
		v115 = buf.getInt();
		v116 = buf.getInt();
		v117 = buf.getInt();
		v118 = buf.getInt();
		v119 = buf.getInt();
		v120 = buf.getInt();
		v121 = buf.getInt();
		v122 = buf.getInt();
		v123 = buf.getInt();
		v124 = buf.getInt();
		v125 = buf.getInt();
		v126 = buf.getInt();
		v127 = buf.getInt();
		v128 = buf.getInt();
		v129 = buf.getInt();
		v130 = buf.getInt();
		v131 = buf.getInt();
		v132 = buf.getInt();
		v133 = buf.getInt();
		v134 = buf.getInt();
		v135 = buf.getInt();
		v136 = buf.getInt();
		v137 = buf.getInt();
		v138 = buf.getInt();
		v139 = buf.getInt();
		v140 = buf.getInt();
		v141 = buf.getInt();
		v142 = buf.getInt();
		v143 = buf.getInt();
		v144 = buf.getInt();
		v145 = buf.getInt();
		v146 = buf.getInt();
		v147 = buf.getInt();
		v148 = readString(buf);
		v149 = readString(buf);
		v150 = readString(buf);
		v151 = readString(buf);
		v152 = buf.getInt();
		v153 = buf.get();
	}
	public String getAllInfo()
	{
		return 	"id : " + getId() +
				"	v1 : " + v1 +
				"	v2 : " + v2 +
				"	v3 : " + v3 +
				"	v4 : " + v4 +
				"	v5 : " + v5 +
				"	v6 : " + v6 +
				"	v7 : " + v7 +
				"	v8 : " + v8 +
				"	v9 : " + v9 +
				"	v10 : " + v10 + "\n" +
				"	v11 : " + v11 +
				"	v12 : " + v12 +
				"	v13 : " + v13 +
				"	v14 : " + v14 +
				"	v15 : " + v15 +
				"	v16 : " + v16 +
				"	v17 : " + v17 +
				"	v18 : " + v18 +
				"	v19 : " + v19 +
				"	v20 : " + v20 + "\n" +
				"	v21 : " + v21 +
				"	v22 : " + v22 +
				"	v23 : " + v23 +
				"	v24 : " + v24 +
				"	v25 : " + v25 +
				"	v26 : " + v26 +
				"	v27 : " + v27 +
				"	v28 : " + v28 +
				"	v29 : " + v29 +
				"	v30 : " + v30 + "\n" +
				"	v31 : " + v31 +
				"	v32 : " + v32 +
				"	v33 : " + v33 +
				"	v34 : " + v34 +
				"	v35 : " + v35 +
				"	v36 : " + v36 +
				"	v37 : " + v37 +
				"	v38 : " + v38 +
				"	v39 : " + v39 +
				"	v40 : " + v40 + "\n" +
				"	v41 : " + v41 +
				"	v42 : " + v42 +
				"	v43 : " + v43 +
				"	v44 : " + v44 +
				"	v45 : " + v45 +
				"	v46 : " + v46 +
				"	v47 : " + v47 +
				"	v48 : " + v48 +
				"	v49 : " + v49 +
				"	v50 : " + v50 + "\n" +
				"	v51 : " + v51 +
				"	v52 : " + v52 +
				"	v53 : " + v53 +
				"	v54 : " + v54 +
				"	v55 : " + v55 +
				"	v56 : " + v56 +
				"	v57 : " + v57 +
				"	v58 : " + v58 +
				"	v59 : " + v59 +
				"	v60 : " + v60 + "\n" +
				"	v61 : " + v61 +
				"	v62 : " + v62 +
				"	v63 : " + v63 +
				"	v64 : " + v64 +
				"	v65 : " + v65 +
				"	v66 : " + v66 +
				"	v67 : " + v67 +
				"	v68 : " + v68 +
				"	v69 : " + v69 +
				"	v70 : " + v70 + "\n" +
				"	v71 : " + v71 +
				"	v72 : " + v72 +
				"	v73 : " + v73 +
				"	v74 : " + v74 +
				"	v75 : " + v75 +
				"	v76 : " + v76 +
				"	v77 : " + v77 +
				"	v78 : " + v78 +
				"	v79 : " + v79 +
				"	v80 : " + v80 + "\n" +
				"	v81 : " + v81 +
				"	v82 : " + v82 +
				"	v83 : " + v83 +
				"	v84 : " + v84 +
				"	v85 : " + v85 +
				"	v86 : " + v86 +
				"	v87 : " + v87 +
				"	v88 : " + v88 +
				"	v89 : " + v89 +
				"	v90 : " + v90 + "\n" +
				"	v91 : " + v91 +
				"	v92 : " + v92 +
				"	v93 : " + v93 +
				"	v94 : " + v94 +
				"	v95 : " + v95 +
				"	v96 : " + v96 +
				"	v97 : " + v97 +
				"	v98 : " + v98 +
				"	v99 : " + v99 +
				"	v100 : " + v100 + "\n" +
				"	v101 : " + v101 +
				"	v102 : " + v102 +
				"	v103 : " + v103 +
				"	v104 : " + v104 +
				"	v105 : " + v105 +
				"	v106 : " + v106 +
				"	v107 : " + v107 +
				"	v108 : " + v108 +
				"	v109 : " + v109 +
				"	v110 : " + v110 + "\n" +
				"	v111 : " + v111 +
				"	v112 : " + v112 +
				"	v113 : " + v113 +
				"	v114 : " + v114 +
				"	v115 : " + v115 +
				"	v116 : " + v116 +
				"	v117 : " + v117 +
				"	v118 : " + v118 +
				"	v119 : " + v119 +
				"	v120 : " + v120 + "\n" +
				"	v121 : " + v121 +
				"	v122 : " + v122 +
				"	v123 : " + v123 +
				"	v124 : " + v124 +
				"	v125 : " + v125 +
				"	v126 : " + v126 +
				"	v127 : " + v127 +
				"	v128 : " + v128 +
				"	v129 : " + v129 +
				"	v130 : " + v130 + "\n" +
				"	v131 : " + v131 +
				"	v132 : " + v132 +
				"	v133 : " + v133 +
				"	v134 : " + v134 +
				"	v135 : " + v135 +
				"	v136 : " + v136 +
				"	v137 : " + v137 +
				"	v138 : " + v138 +
				"	v139 : " + v139 +
				"	v140 : " + v140 + "\n" +
				"	v141 : " + v141 +
				"	v142 : " + v142 +
				"	v143 : " + v143 +
				"	v144 : " + v144 +
				"	v145 : " + v145 +
				"	v146 : " + v146 +
				"	v147 : " + v147 +
				"	v148 : " + v148 +
				"	v149 : " + v149 +
				"	v150 : " + v150 + "\n" +
				"	v151 : " + v151 +
				"	v152 : " + v152 +
				"	v153 : " + v153 + "\n\n";
	}
}
