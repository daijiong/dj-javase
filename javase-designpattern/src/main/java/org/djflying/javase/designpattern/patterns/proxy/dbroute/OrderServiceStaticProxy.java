package org.djflying.javase.designpattern.patterns.proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * OrderService静态代理类
 *
 * @author daijiong
 * @version : DbRouteTest.java, v 0.1 2020/3/14 19:57 daijiong Exp $$
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService    orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 1;
    }
}
