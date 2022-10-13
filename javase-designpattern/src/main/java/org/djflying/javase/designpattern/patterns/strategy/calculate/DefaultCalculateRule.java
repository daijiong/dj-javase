package org.djflying.javase.designpattern.patterns.strategy.calculate;

/**
 * 默认的计算规则
 *
 * @author daijiong
 * @version : DefaultCalculateRule.java, v 0.1 2020/4/15 18:10 daijiong Exp $$
 */
public class DefaultCalculateRule implements ICalculateRule {

    /**
     * 计算费用
     *
     * @param serviceFeeRate 服务费率
     * @param taxFeeRate 个税率
     * @param fee 费用金额
     * @return
     */
    @Override
    public CalculateResult calculate(Double serviceFeeRate, Double taxFeeRate, Double fee) {
        return new CalculateResult();
    }
}
