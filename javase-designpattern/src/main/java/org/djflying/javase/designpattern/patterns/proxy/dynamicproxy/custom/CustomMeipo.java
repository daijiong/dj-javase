package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.custom;

import org.djflying.javase.designpattern.patterns.proxy.Person;

import java.lang.reflect.Method;

/**
 * 自定义代理类
 *
 * @author daijiong
 * @version : CustomMeipo.java, v 0.1 2020/3/14 21:16 daijiong Exp $$
 */
public class CustomMeipo implements CustomInvocationHandler {

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return CustomProxy.newProxyInstance(new CustomClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
