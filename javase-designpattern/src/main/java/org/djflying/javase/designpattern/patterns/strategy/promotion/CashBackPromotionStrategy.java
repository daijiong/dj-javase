package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 返现促销策略
 *
 * @author daijiong
 * @version : CashBackPromotionStrategy.java, v 0.1 2020/3/26 9:51 daijiong Exp $$
 */
public class CashBackPromotionStrategy implements IPromotionStrategy {
    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        System.out.println("返现促销策略：买1000返现100，当日使用！！！");
    }
}
