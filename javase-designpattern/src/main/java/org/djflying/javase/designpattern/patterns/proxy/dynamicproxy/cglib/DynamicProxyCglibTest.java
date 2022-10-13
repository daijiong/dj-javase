package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.cglib;

/**
 * Cglib动态代理测试类
 *
 * @author daijiong
 * @version : DynamicProxyCglibTest.java, v 0.1 2020/3/15 22:03 daijiong Exp $$
 */
public class DynamicProxyCglibTest {

    public static void main(String[] args) {
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
