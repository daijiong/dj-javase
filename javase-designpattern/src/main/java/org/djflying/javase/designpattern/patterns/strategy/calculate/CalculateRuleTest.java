package org.djflying.javase.designpattern.patterns.strategy.calculate;

/**
 * Description
 *
 * @author daijiong
 * @version : CalculateRuleTest.java, v 0.1 2020/4/15 15:38 daijiong Exp $$
 */
public class CalculateRuleTest {

    public static void main(String[] args) {
        ICalculateRule calculateRule = CalculateRuleFactory.getInstance(RuleNoEnum.FIVE.getCode());
        CalculateResult calculateResult = calculateRule.calculate(0.0450, 0.0150, 100.0000);
        System.out.println(calculateResult);

    }
}
