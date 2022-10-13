package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 优惠券促销策略
 *
 * @author daijiong
 * @version : CouponPromotionStrategy.java, v 0.1 2020/3/26 9:16 daijiong Exp $$
 */
public class CouponPromotionStrategy implements IPromotionStrategy {
    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        System.out.println("优惠券促销策略：满100送50优惠券，当日使用！！！");
    }
}
