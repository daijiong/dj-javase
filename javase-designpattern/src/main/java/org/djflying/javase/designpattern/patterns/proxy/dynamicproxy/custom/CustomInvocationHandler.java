package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.custom;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 *
 * @author daijiong
 * @version : CustomInvocationHandler.java, v 0.1 2020/3/14 21:11 daijiong Exp $$
 */
public interface CustomInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
