package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 促销活动
 *
 * @author daijiong
 * @version : PromotionActivity.java, v 0.1 2020/3/26 9:20 daijiong Exp $$
 */
public class PromotionActivity {

    private IPromotionStrategy promotionStrategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行促销活动
     */
    public void execute() {
        promotionStrategy.doPromotion();
    }
}
