package org.djflying.javase.designpattern.patterns.decorator.demo.pencake;

/**
 * 加香肠装饰器
 *
 * @author daijiong
 * @version : SausageDecorator.java, v 0.1 2020/5/16 9:04 daijiong Exp $$
 */
public class SausageDecorator extends PencakeDecorator {

    public SausageDecorator(Pencake pencake) {
        super(pencake);
    }

    @Override
    protected String getCake() {
        return super.getCake() + "+1根香肠";
    }

    @Override
    protected Integer getPrice() {
        return super.getPrice() + 2;
    }
}
