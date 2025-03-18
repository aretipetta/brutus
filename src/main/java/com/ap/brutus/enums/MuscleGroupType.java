package com.ap.brutus.enums;

import java.util.HashMap;
import java.util.Map;

public enum MuscleGroupType {
    UPPER(1, "Upper Body"),
    LEGS(2, "Legs"),
    MIX(3, "Mix");

    private int code;
    private String name;

    private static final Map<Integer, String> groups = new HashMap<>();

    static {
        for (MuscleGroupType mgt : MuscleGroupType.values()) {
            groups.put(mgt.getCode(), mgt.getName());
        }
    }
    private MuscleGroupType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {return code;}
    public String getName() {return name;}
    public String getCodeByCode(int code) {
        return groups.getOrDefault(code, null);
    }
}
