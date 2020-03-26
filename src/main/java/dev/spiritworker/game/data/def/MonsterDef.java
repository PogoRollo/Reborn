package dev.spiritworker.game.data.def;

import dev.spiritworker.game.data.ResourceDef;
import dev.spiritworker.game.data.ResourceType;
import dev.spiritworker.game.data.ResourceType.ResourceIdType;

import java.nio.ByteBuffer;

@ResourceType(name = "tb_Monster.res", idType = ResourceIdType.INT)
public class MonsterDef extends ResourceDef {

    private String name;

    private int v2;
    private int v3;
    private String v4;
    private String v5;
    private int v6;
    private int v7;
    private int v8;
    private byte v9;

    private int[] questConditionsValues = new int[4];

    private int v14;
    private int v15;
    private int v16;
    private int v17;

    private byte level;

    private int v19;

    private byte v20;
    private byte v21;
    private byte v22;
    private byte v23;
    private byte v24;
    private byte v25;
    private byte v26;

    private String v27;
    private String v28;

    private byte v29;
    private byte v30;
    private byte v31;

    private int v32;

    private byte v33;
    private byte v34;
    private byte v35;
    private byte v36;
    private byte v37;
    private byte v38;

    private short v39;
    private short v40;
    private short v41;
    private short v42;

    private byte v43;

    private int v44;

    private short v45;

    private byte v46;
    private byte v47;

    private String aiScriptName;

    private byte v49;
    private byte v50;

    private int v51;

    private String v52;
    private String v53;

    private byte v54;

    private int v55;

    private byte v56;
    private byte v57;
    private byte v58;

    private int v59;

    private String v60;
    private String v61;
    private String v62;

    private byte v63;
    private byte v64;
    private byte v65;

    private String v66;
    private String v67;
    private String v68;

    private int v69;
    private int v70;
    private int v71;

    private byte v72;
    private byte v73;
    private byte v74;

    private int v75;
    private int v76;
    private int v77;

    private byte v78;
    private byte v79;
    private byte v80;

    private String v81;
    private String v82;
    private String v83;

    private int v84;
    private int v85;

    private int skill1;
    private int skill2;
    private int skill3;
    private int skill4;
    private int skill5;
    private int skill6;
    private int skill7;
    private int skill8;
    private int skill9;
    private int skill10;

    private int v96;
    private int v97;

    private float v98;

    private int v99;

    private byte v100;

    private short v101;
    private short v102;

    private byte v103;
    private byte v104;

    private String v105;

    private short v106;
    private short v107;

    private float v108;

    private int v109;

    private byte v110;

    private int v111;

    public short v112;

    private short bossType;
    private byte showHealthbar;

    public int v115;
    private int v116;

    private int damage;

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
    private int v148;

    private String v149;
    private String v150;
    private String v151;
    private String v152;

    private int v153;

    private byte v154;

    public MonsterDef(int id) { super(id); }

    public int     getSkill1() { return this.skill1; }
    public int     getLevel()  { return this.level; }
    public int     getDamage() { return this.damage; }
    public boolean isBoss()    { return this.bossType == 3; }
    public int[] getQuestConditionsValues() { return this.questConditionsValues; }

    @Override
    public void loadFromRes(ByteBuffer buf) {

        String v1 = readString(buf);

        v2 = buf.getInt();
        v3 = buf.getInt();

        v4 = readString(buf);
        v5 = readString(buf);

        v6 = buf.getInt();
        v7 = buf.getInt();
        v8 = buf.getInt();

        v9 = buf.get();

        int v10 = buf.getInt();
        int v11 = buf.getInt();
        int v12 = buf.getInt();
        int v13 = buf.getInt();

        v14 = buf.getInt();
        v15 = buf.getInt();
        v16 = buf.getInt();
        v17 = buf.getInt();

        byte v18 = buf.get();

        v19 = buf.getInt();

        v20 = buf.get();
        v21 = buf.get();
        v22 = buf.get();
        v23 = buf.get();
        v24 = buf.get();
        v25 = buf.get();
        v26 = buf.get();

        v27 = readString(buf);
        v28 = readString(buf);

        v29 = buf.get();
        v30 = buf.get();
        v31 = buf.get();

        v32 = buf.getInt();

        v33 = buf.get();
        v34 = buf.get();
        v35 = buf.get();
        v36 = buf.get();
        v37 = buf.get();
        v38 = buf.get();

        v39 = buf.getShort();
        v40 = buf.getShort();
        v41 = buf.getShort();
        v42 = buf.getShort();

        v43 = buf.get();

        v44 = buf.getInt();

        v45 = buf.getShort();

        v46 = buf.get();
        v47 = buf.get();

        String v48 = readString(buf);

        v49 = buf.get();
        v50 = buf.get();

        v51 = buf.getInt();

        v52 = readString(buf);
        v53 = readString(buf);

        v54 = buf.get();

        v55 = buf.getShort();

        v56 = buf.get();
        v57 = buf.get();
        v58 = buf.get();

        v59 = buf.getShort();

        v60 = readString(buf);
        v61 = readString(buf);
        v62 = readString(buf);

        v63 = buf.get();
        v64 = buf.get();
        v65 = buf.get();

        v66 = readString(buf);
        v67 = readString(buf);
        v68 = readString(buf);

        v69 = buf.getInt();
        v70 = buf.getInt();
        v71 = buf.getInt();

        v72 = buf.get();
        v73 = buf.get();
        v74 = buf.get();

        v75 = buf.getInt();
        v76 = buf.getInt();
        v77 = buf.getInt();

        v78 = buf.get();
        v79 = buf.get();
        v80 = buf.get();

        v81 = readString(buf);
        v82 = readString(buf);
        v83 = readString(buf);

        v84 = buf.getShort();
        v85 = buf.getShort();

        int v86 = buf.getInt();
        int v87 = buf.getInt();
        int v88 = buf.getInt();
        int v89 = buf.getInt();
        int v90 = buf.getInt();
        int v91 = buf.getInt();
        int v92 = buf.getInt();
        int v93 = buf.getInt();
        int v94 = buf.getInt();
        int v95 = buf.getInt();

        v96 = buf.getInt();
        v97 = buf.getInt();

        v98 = buf.getFloat();

        v99 = buf.getInt();

        v100 = buf.get();

        v101 = buf.getShort();
        v102 = buf.getShort();

        v103 = buf.get();
        v104 = buf.get();

        v105 = readString(buf);

        v106 = buf.getShort();
        v107 = buf.getShort();
        v108 = buf.getFloat();
        v109 = buf.getShort();

        v110 = buf.get();

        v111 = buf.getInt();

        v112 = buf.getShort();

        short v113 = buf.getShort();

        byte v114 = buf.get();

        v115 = buf.getInt();
        v116 = buf.getInt();

        int v117 = buf.getInt();

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
        v148 = buf.getInt();

        v149 = readString(buf);
        v150 = readString(buf);
        v151 = readString(buf);
        v152 = readString(buf);

        v153 = buf.getInt();

        v154 = buf.get();

        name = v1;
        questConditionsValues[0] = v10;
        questConditionsValues[1] = v11;
        questConditionsValues[2] = v12;
        questConditionsValues[3] = v13;
        level = v18;
        aiScriptName = v48;
        skill1 = v86;
        skill2 = v87;
        skill3 = v88;
        skill4 = v89;
        skill5 = v90;
        skill6 = v91;
        skill7 = v92;
        skill8 = v93;
        skill9 = v94;
        skill10 = v95;
        bossType = v113;
        showHealthbar = v114;
        damage = v117;
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]"
                + " ( " + this.name
                + " , " + this.v2
                + " , " + this.v3
                + " , " + this.v4
                + " , " + this.v5
                + " , " + this.v6
                + " , " + this.v7
                + " , " + this.v8
                + " , " + this.v9
                + " , " + this.questConditionsValues[0]
                + " , " + this.questConditionsValues[1]
                + " , " + this.questConditionsValues[2]
                + " , " + this.questConditionsValues[3]
                + " , " + this.v14
                + " , " + this.v15
                + " , " + this.v16
                + " , " + this.v17
                + " , " + this.level
                + " , " + this.v19
                + " , " + this.v20
                + " , " + this.v21
                + " , " + this.v22
                + " , " + this.v23
                + " , " + this.v24
                + " , " + this.v25
                + " , " + this.v26
                + " , " + this.v27
                + " , " + this.v28
                + " , " + this.v29
                + " , " + this.v30
                + " , " + this.v31
                + " , " + this.v32
                + " , " + this.v33
                + " , " + this.v34
                + " , " + this.v35
                + " , " + this.v36
                + " , " + this.v37
                + " , " + this.v38
                + " , " + this.v39
                + " , " + this.v40
                + " , " + this.v41
                + " , " + this.v42
                + " , " + this.v43
                + " , " + this.v44
                + " , " + this.v45
                + " , " + this.v46
                + " , " + this.v47
                + " , " + this.aiScriptName
                + " , " + this.v49
                + " , " + this.v50
                + " , " + this.v51
                + " , " + this.v52
                + " , " + this.v53
                + " , " + this.v54
                + " , " + this.v55
                + " , " + this.v56
                + " , " + this.v57
                + " , " + this.v58
                + " , " + this.v59
                + " , " + this.v60
                + " , " + this.v61
                + " , " + this.v62
                + " , " + this.v63
                + " , " + this.v64
                + " , " + this.v65
                + " , " + this.v66
                + " , " + this.v67
                + " , " + this.v68
                + " , " + this.v69
                + " , " + this.v70
                + " , " + this.v71
                + " , " + this.v72
                + " , " + this.v73
                + " , " + this.v74
                + " , " + this.v75
                + " , " + this.v76
                + " , " + this.v77
                + " , " + this.v78
                + " , " + this.v79
                + " , " + this.v80
                + " , " + this.v81
                + " , " + this.v82
                + " , " + this.v83
                + " , " + this.v84
                + " , " + this.v85
                + " , " + this.skill1
                + " , " + this.skill2
                + " , " + this.skill3
                + " , " + this.skill4
                + " , " + this.skill5
                + " , " + this.skill6
                + " , " + this.skill7
                + " , " + this.skill8
                + " , " + this.skill9
                + " , " + this.skill10
                + " , " + this.v96
                + " , " + this.v97
                + " , " + this.v98
                + " , " + this.v99
                + " , " + this.v100
                + " , " + this.v101
                + " , " + this.v102
                + " , " + this.v103
                + " , " + this.v104
                + " , " + this.v105
                + " , " + this.v106
                + " , " + this.v107
                + " , " + this.v108
                + " , " + this.v109
                + " , " + this.v110
                + " , " + this.v111
                + " , " + this.v112
                + " , " + this.bossType
                + " , " + this.showHealthbar
                + " , " + this.v115
                + " , " + this.v116
                + " , " + this.damage
                + " , " + this.v118
                + " , " + this.v119
                + " , " + this.v120
                + " , " + this.v121
                + " , " + this.v122
                + " , " + this.v123
                + " , " + this.v124
                + " , " + this.v125
                + " , " + this.v126
                + " , " + this.v127
                + " , " + this.v128
                + " , " + this.v129
                + " , " + this.v130
                + " , " + this.v131
                + " , " + this.v132
                + " , " + this.v133
                + " , " + this.v134
                + " , " + this.v135
                + " , " + this.v136
                + " , " + this.v137
                + " , " + this.v138
                + " , " + this.v139
                + " , " + this.v140
                + " , " + this.v141
                + " , " + this.v142
                + " , " + this.v143
                + " , " + this.v144
                + " , " + this.v145
                + " , " + this.v146
                + " , " + this.v147
                + " , " + this.v148
                + " , " + this.v149
                + " , " + this.v150
                + " , " + this.v151
                + " , " + this.v152
                + " , " + this.v153
                + " , " + this.v154 + ")\n";
    }
}