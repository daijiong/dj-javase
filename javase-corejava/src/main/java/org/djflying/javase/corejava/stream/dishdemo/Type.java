package org.djflying.javase.corejava.stream.dishdemo;

/**
 * Description
 *
 * @author dj4817
 * @version $Id: Type.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public enum Type {
                  MEAT(0, "MEAT"), FISH(0, "FISH"), OTHER(0, "OTHER");

    /** 枚举编码 */
    private int    code;
    /** 枚举描述 */
    private String desc;

    Type(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static Type getEnumByCode(int code) {
        for (Type e : Type.values()) {
            if (code == e.getCode()) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举编码
     */
    public int getCode() {
        return code;
    }

    /**
     * 获取枚举描述
     */
    public String getDesc() {
        return desc;
    }
}
