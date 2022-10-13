package org.djflying.javase.designpattern.patterns.proxy.staticproxy.sample;

/**
 * 静态代理测试类
 *
 * @author daijiong
 * @version : StaticProxySampleTest.java, v 0.1 2020/3/14 19:36 daijiong Exp $$
 */
public class StaticProxySampleTest {

    public static void main(String[] args) {
        // 我只能给我儿子找对象
        Father father = new Father(new Son());
        father.findLove();
    }
}
