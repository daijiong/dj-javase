package org.djflying.javase.designpattern.patterns.decorator.demo.pencake;

/**
 * 什么都不加的煎饼
 *
 * @author daijiong
 * @version : BasePencake.java, v 0.1 2020/5/15 21:44 daijiong Exp $$
 */
public class BasePencake extends Pencake {

    @Override
    protected String getCake() {
        return "煎饼";
    }

    @Override
    protected Integer getPrice() {
        return 5;
    }
}
