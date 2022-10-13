package org.djflying.javase.designpattern.patterns.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂
 *
 * @author daijiong
 * @version : PromotionStrategyFactory.java, v 0.1 2020/3/26 9:42 daijiong Exp $$
 */
public class PromotionStrategyFactory {

    private static final NonPromotionStrategy      NON_PROMOTION_STRATEGY = new NonPromotionStrategy();

    private static Map<String, IPromotionStrategy> PROMOTION_STRATEGY     = new HashMap<>();

    static {
        PROMOTION_STRATEGY.put("COUPON", new CouponPromotionStrategy());
        PROMOTION_STRATEGY.put("GROUPBUY", new GroupBuyPromotionStrategy());
        PROMOTION_STRATEGY.put("CASHBACK", new CashBackPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getInstance(String promotionKey) {
        IPromotionStrategy promotionStrategy = PROMOTION_STRATEGY.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION_STRATEGY : promotionStrategy;
    }
}
