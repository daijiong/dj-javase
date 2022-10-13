package org.djflying.javase.designpattern.principles.is;

/**
 * 狗类
 * <p>
 * 如果实现单一的动物接口的话，则需要实现一些不必要的接口，未遵循接口隔离原则
 *
 * @author daijiong
 * @version $Id: Dog.java, v 0.1 2019/5/12 6:34 daijiong Exp $$
 */
//public class Dog implements IAnimal {
public class Dog implements IEatAnimal, ISwimAnimal {
    @Override
    public void eat() {

    }

    //@Override
    //public void fly() {
    //    // 这个方法对于狗类只能空着
    //}

    @Override
    public void swim() {

    }
}
