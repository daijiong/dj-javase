package org.djflying.javase.designpattern.patterns.decorator.demo.pencake;

/**
 * 加蛋装饰器
 *
 * @author daijiong
 * @version : EggDecorator.java, v 0.1 2020/5/15 21:51 daijiong Exp $$
 */
public class EggDecorator extends PencakeDecorator {

    public EggDecorator(Pencake pencake) {
        super(pencake);
    }

    @Override
    protected String getCake() {
        return super.getCake() + "+1个鸡蛋";
    }

    @Override
    protected Integer getPrice() {
        return super.getPrice() + 1;
    }
}
