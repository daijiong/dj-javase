package org.djflying.javase.designpattern.principles.is;

/**
 * 鸟类
 * <p>
 * 如果实现单一的动物接口的话，则需要实现一些不必要的接口，未遵循接口隔离原则
 *
 * @author daijiong
 * @version $Id: Bird.java, v 0.1 2019/5/12 6:33 daijiong Exp $$
 */
//public class Bird implements IAnimal {
public class Bird implements IEatAnimal, IFlyAnimal {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    //@Override
    //public void swim() {
    //    // 这个方法对于鸟类只能空着
    //}
}
