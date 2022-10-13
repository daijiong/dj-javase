package org.djflying.javase.designpattern.patterns.strategy.calculate;

import java.math.BigDecimal;

/**
 * 计算规则A2（应发）：外加服务费，再内扣个税
 * 服务费基数=个人应发
 * 个人发放承担个税
 *
 * @author daijiong
 * @version : CalculateRuleA2.java, v 0.1 2020/4/15 15:09 daijiong Exp $$
 */
public class CalculateRuleA2 implements ICalculateRule {

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
        // 服务费 = 个人应发 * 服务费率
        BigDecimal serviceFeeAmount = personalDueIncome.multiply(serviceFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setServiceFeeAmount(serviceFeeAmount);
        // 个税 = 个人应发 * 个税率
        BigDecimal taxFeeAmount = personalDueIncome.multiply(taxFeeRate).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setTaxFeeAmount(taxFeeAmount);
        // 个人实发 = 个人应发 - 个税
        BigDecimal personalActualIncome = personalDueIncome.subtract(taxFeeAmount).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setPersonalActualIncome(personalActualIncome);
        // 甲方结算 = 个人应发 + 服务费
        BigDecimal settlementAmount = personalDueIncome.add(serviceFeeAmount).setScale(4, BigDecimal.ROUND_HALF_UP);
        calculateResult.setSettlementAmount(settlementAmount);
        // 服务费基数 = 个人应发
        calculateResult.setServiceFeeBaseAmount(personalDueIncome);
        // 个税基数 = 个人应发
        calculateResult.setTaxFeeBaseAmount(personalDueIncome);
        return calculateResult;
    }
}
