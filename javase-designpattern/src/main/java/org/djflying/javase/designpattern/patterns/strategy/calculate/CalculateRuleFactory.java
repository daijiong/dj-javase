package org.djflying.javase.designpattern.patterns.strategy.calculate;

import java.util.HashMap;
import java.util.Map;

/**
 * 计算规则工厂类
 *
 * @author daijiong
 * @version : CalculateRuleFactory.java, v 0.1 2020/4/15 17:35 daijiong Exp $$
 */
public class CalculateRuleFactory {

    private static final DefaultCalculateRule  DEFAULT_CALCULATE_RULE = new DefaultCalculateRule();

    private static Map<String, ICalculateRule> CALCULATE_RULES        = new HashMap<>();

    static {
        CALCULATE_RULES.put(RuleNoEnum.ONE.getCode(), new CalculateRuleA1());
        CALCULATE_RULES.put(RuleNoEnum.TWO.getCode(), new CalculateRuleA2());
        CALCULATE_RULES.put(RuleNoEnum.THREE.getCode(), new CalculateRuleA3());
        CALCULATE_RULES.put(RuleNoEnum.FOUR.getCode(), new CalculateRuleA4());
        CALCULATE_RULES.put(RuleNoEnum.FIVE.getCode(), new CalculateRuleA5());
    }

    private CalculateRuleFactory() {
    }

    public static ICalculateRule getInstance(String ruleNo) {
        ICalculateRule calculateRule = CALCULATE_RULES.get(ruleNo);
        return calculateRule == null ? DEFAULT_CALCULATE_RULE : calculateRule;
    }
}
