package org.djflying.javase.designpattern.patterns.proxy.dbroute;

/**
 * 数据源切换测试类
 *
 * @author daijiong
 * @version : DbRouteTest.java, v 0.1 2020/3/14 19:57 daijiong Exp $$
 */
public class DbRouteTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(System.currentTimeMillis());
        // 使用静态代理
//        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(new OrderService());
        // 使用动态代理
        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        proxy.createOrder(order);
    }
}
