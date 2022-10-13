package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.custom;

import org.djflying.javase.designpattern.patterns.proxy.Person;
import org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.jdk.Girl;

/**
 * 自定义动态代理测试类
 *
 * @author daijiong
 * @version : DynamicProxyCustomTest.java, v 0.1 2020/3/14 21:21 daijiong Exp $$
 */
public class DynamicProxyCustomTest {

    public static void main(String[] args) {
        CustomMeipo customMeipo = new CustomMeipo();
        Person girl = (Person) customMeipo.getInstance(new Girl());
        girl.findLove();
    }
}
