package org.djflying.javase.designpattern.patterns.strategy.calculate;

import java.math.BigDecimal;

/**
 * 计算规则A4（结算）：内扣服务费（个税含在服务费内）
 * 服务费基数=甲方结算
 * 个人发放不承担个税
 *
 * @author daijiong
 * @version : CalculateRuleA4.java, v 0.1 2020/4/15 15:06 daijiong Exp $$
 */
public class CalculateRuleA4 implements ICalculateRule {

    /**
     * 计算费用
     *
     * @param serviceFeeRateDouble 服务费率
     * @param taxFeeRateDouble 个税率
     * @param fee 费用金额
     * @return
     */
    @Override
    public CalculateResult calculate(Double serviceFeeRateDouble, Double taxFeeRateDouble, Double fee) {
        // 服务费率
        BigDecimal serviceFeeRate = BigDecimal.valueOf(serviceFeeRateDouble).setScale(4, BigDecimal.ROUND_HALF_UP);
        // 个税率
        BigDecimal taxFeeRate = BigDecimal.valueOf(taxFeeRateDouble).setScale(4, BigDecimal.ROUND_HALF_UP);
        CalculateResult calculateResult = new CalculateResult(serviceFeeRate, taxFeeRate);
        // 甲方结算
        BigDecimal settlementAmount = BigDecimal.valueOf(fee).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setSettlementAmount(settlementAmount);
        // 服务费基数 = 甲方结算
        calculateResult.setServiceFeeBaseAmount(settlementAmount);
        // 服务费 = 甲方结算 * 服务费率
        BigDecimal serviceFeeAmount = settlementAmount.multiply(serviceFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setServiceFeeAmount(serviceFeeAmount);
        // 个人应发 = 甲方结算 - 服务费
        BigDecimal personalDueIncome = settlementAmount.subtract(serviceFeeAmount).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setPersonalDueIncome(personalDueIncome);
        // 个人实发 = 个人应发
        calculateResult.setPersonalActualIncome(personalDueIncome);
        // 个税 = 个人应发 * 个税率
        BigDecimal taxFeeAmount = personalDueIncome.multiply(taxFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setTaxFeeAmount(taxFeeAmount);
        // 个税基数 = 个人应发
        calculateResult.setTaxFeeBaseAmount(personalDueIncome);
        return calculateResult;
    }
}
