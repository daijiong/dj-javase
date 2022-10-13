package org.djflying.javase.designpattern.patterns.strategy.calculate;

import java.math.BigDecimal;

/**
 * 计算规则A3（应发）：外加服务费（个税含在服务费内）
 * 服务费基数=个人应发
 * 个人发放不承担个税
 *
 * @author daijiong
 * @version : CalculateRuleA3.java, v 0.1 2020/4/15 15:10 daijiong Exp $$
 */
public class CalculateRuleA3 implements ICalculateRule {

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
        // 个人应发
        BigDecimal personalDueIncome = BigDecimal.valueOf(fee).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setPersonalDueIncome(personalDueIncome);
        // 个人实发 = 个人应发
        calculateResult.setPersonalActualIncome(personalDueIncome);
        // 甲方结算 = 个人应发 * (1+服务费率)
        BigDecimal settlementAmount = personalDueIncome.multiply(BigDecimal.ONE.add(serviceFeeRate)).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setSettlementAmount(settlementAmount);
        // 服务费 = 个人应发 * 服务费率
        BigDecimal serviceFeeAmount = personalDueIncome.multiply(serviceFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setServiceFeeAmount(serviceFeeAmount);
        // 服务费基数 = 个人应发
        calculateResult.setServiceFeeBaseAmount(personalDueIncome);
        // 个税基数 = 个人应发
        calculateResult.setTaxFeeBaseAmount(personalDueIncome);
        // 个税 = 个人应发 * 个税率
        BigDecimal taxFeeAmount = personalDueIncome.multiply(taxFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setTaxFeeAmount(taxFeeAmount);
        return calculateResult;
    }
}
