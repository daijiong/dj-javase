package org.djflying.javase.designpattern.patterns.strategy.calculate;

/**
 * 计算规则号码枚举
 *
 * @author daijiong
 * @version : FeeTypeEnum.java, v 0.1 2020/4/15 15:14 daijiong Exp $$
 */
public enum RuleNoEnum {
                        /** 一号规则 */
                        ONE("A1", "一号规则"),
                        /** 二号规则 */
                        TWO("A2", "二号规则"),
                        /** 三号规则 */
                        THREE("A3", "三号规则"),
                        /** 四号规则 */
                        FOUR("A4", "四号规则"),
                        /** 五号规则 */
                        FIVE("A5", "五号规则");

    /** 枚举编码 */
    private String code;
    /** 枚举描述 */
    private String desc;

    RuleNoEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static RuleNoEnum getEnumByCode(String code) {
        for (RuleNoEnum e : RuleNoEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取枚举描述
     */
    public String getDesc() {
        return desc;
    }
}
