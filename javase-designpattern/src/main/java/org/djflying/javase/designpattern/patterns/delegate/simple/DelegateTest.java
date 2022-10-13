package org.djflying.javase.designpattern.patterns.delegate.simple;

/**
 * 委派模式测试类
 *
 * @author daijiong
 * @version : DelegateTest.java, v 0.1 2020/3/25 22:07 daijiong Exp $$
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("架构", new org.djflying.javase.designpattern.patterns.delegate.simple.Manager());
    }
}
