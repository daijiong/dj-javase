package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 无优惠策略
 *
 * @author daijiong
 * @version : NonPromotionStrategy.java, v 0.1 2020/3/26 9:12 daijiong Exp $$
 */
public class NonPromotionStrategy implements IPromotionStrategy {

    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        System.out.println("对不起，你购买的商品没有任何优惠！！！");
    }
}
