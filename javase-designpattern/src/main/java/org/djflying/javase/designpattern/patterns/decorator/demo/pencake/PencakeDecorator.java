package org.djflying.javase.designpattern.patterns.decorator.demo.pencake;

/**
 * 煎饼装饰器
 *
 * @author daijiong
 * @version : PencakeDecorator.java, v 0.1 2020/5/15 21:50 daijiong Exp $$
 */
public class PencakeDecorator extends Pencake {

    private Pencake pencake;

    public PencakeDecorator(Pencake pencake) {
        this.pencake = pencake;
    }

    @Override
    protected String getCake() {
        return pencake.getCake();
    }

    @Override
    protected Integer getPrice() {
        return pencake.getPrice();
    }
}
