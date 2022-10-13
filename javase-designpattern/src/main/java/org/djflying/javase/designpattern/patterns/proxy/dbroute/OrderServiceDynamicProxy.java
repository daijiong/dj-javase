package org.djflying.javase.designpattern.patterns.proxy.dbroute;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * OrderService动态代理类
 *
 * @author daijiong
 * @version : OrderServiceDynamicProxy.java, v 0.1 2020/3/15 21:28 daijiong Exp $$
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private Object           target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before(Object target) {
        try {
            // 利用反射活动被代理类中的属性值
            Long time = (Long) target.getClass().getMethod("getCreateTime", null).invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("动态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void after() {
        System.out.println("数据源还原成功");
        DynamicDataSourceEntity.restore();
    }
}
