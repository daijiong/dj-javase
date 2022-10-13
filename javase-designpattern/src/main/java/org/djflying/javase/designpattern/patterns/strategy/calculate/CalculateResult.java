package org.djflying.javase.designpattern.patterns.strategy.calculate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 计算结果
 *
 * @author daijiong
 * @version : CalculateResult.java, v 0.1 2020/4/15 19:26 daijiong Exp $$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CalculateResult {

    /** 结算金额 */
    private BigDecimal settlementAmount;
    /** 服务费基数 */
    private BigDecimal serviceFeeBaseAmount;
    /** 服务费率 */
    private BigDecimal serviceFeeRate;
    /** 服务费 */
    private BigDecimal serviceFeeAmount;
    /** 个人应发 */
    private BigDecimal personalDueIncome;
    /** 个人实发 */
    private BigDecimal personalActualIncome;
    /** 个税基数 */
    private BigDecimal taxFeeBaseAmount;
    /** 个税率 */
    private BigDecimal taxFeeRate;
    /** 个税 */
    private BigDecimal taxFeeAmount;

    public CalculateResult(BigDecimal serviceFeeRate, BigDecimal taxFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
        this.taxFeeRate = taxFeeRate;
    }
}
