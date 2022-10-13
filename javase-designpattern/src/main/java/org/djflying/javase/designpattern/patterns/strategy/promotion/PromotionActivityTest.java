package org.djflying.javase.designpattern.patterns.strategy.promotion;

/**
 * 促销活动测试类
 *
 * @author daijiong
 * @version : PromotionActivityTest.java, v 0.1 2020/3/26 9:24 daijiong Exp $$
 */
public class PromotionActivityTest {

    public static void main(String[] args) {
        // 由具体的促销活动指定具体的促销策略
        //        PromotionActivity promotionActivity618 = new PromotionActivity(new CouponPromotionStrategy());
        //        promotionActivity618.execute();

        // 根据促销KEY来指定具体的促销策略，但是这段代码里面有很多的if和else，不方便维护，可以使用单例+工厂模式进行重构
        //        PromotionActivity promotionActivity = null;
        //        String promotionKey = "COUPON";
        //        if (StringUtils.equals(promotionKey, "COUPON")) {
        //            promotionActivity = new PromotionActivity(new CouponPromotionStrategy());
        //        } else if (StringUtils.equals(promotionKey, "GROUPBUY")) {
        //            promotionActivity = new PromotionActivity(new GroupBuyPromotionStrategy());
        //        } else {
        //            promotionActivity = new PromotionActivity(new NonPromotionStrategy());
        //        }
        //        promotionActivity.execute();

        // 使用注册式单例+工厂模式重构以上代码
        String promotionKey = "CASHBACK";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getInstance(promotionKey));
        promotionActivity.execute();
    }
}
