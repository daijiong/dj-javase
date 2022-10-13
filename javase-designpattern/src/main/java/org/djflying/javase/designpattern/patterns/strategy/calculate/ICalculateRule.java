package org.djflying.javase.designpattern.patterns.strategy.calculate;

/**
 * 计算规则类
 *
 * @author daijiong
 * @version : ICalculateRule.java, v 0.1 2020/4/15 14:51 daijiong Exp $$
 */
public interface ICalculateRule {

    /**
     * 计算费用
     *
     * @param serviceFeeRate 服务费率
     * @param taxFeeRate 个税率
     * @param fee 费用金额
     * @return
     */
    CalculateResult calculate(Double serviceFeeRate, Double taxFeeRate, Double fee);
}
