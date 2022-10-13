package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 团购促销策略
 *
 * @author daijiong
 * @version : GroupBuyPromotionStrategy.java, v 0.1 2020/3/26 9:14 daijiong Exp $$
 */
public class GroupBuyPromotionStrategy implements IPromotionStrategy {

    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        System.out.println("团购活动促销策略：满10人可成团，成团5折价！！！");
    }
}
