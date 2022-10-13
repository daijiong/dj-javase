package org.djflying.javase.designpattern.patterns.prototype.simple;

/**
 * 克隆测试
 *
 * @author daijiong
 * @version : PrototypeTest.java, v 0.1 2020/5/15 14:30 daijiong Exp $$
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setAge(18);
        prototype.setName("David");
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }
}
