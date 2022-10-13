package org.djflying.javase.designpattern.patterns.decorator.demo.pencake;

/**
 * 煎饼测试类
 *
 * @author daijiong
 * @version : PencakeTest.java, v 0.1 2020/5/15 21:46 daijiong Exp $$
 */
public class PencakeTest {
    public static void main(String[] args) {
        Pencake pencake;
        pencake = new BasePencake();
        pencake = new EggDecorator(pencake);
        pencake = new EggDecorator(pencake);
        pencake = new SausageDecorator(pencake);
        System.out.println(pencake.getCake() + "，总价为：" + pencake.getPrice());
    }
}
