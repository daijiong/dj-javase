package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK媒婆
 *
 * @author daijiong
 * @version : JdkMeipo.java, v 0.1 2020/3/14 20:48 daijiong Exp $$
 */
public class JdkMeipo implements InvocationHandler {

    /** 被代理对象 */
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
