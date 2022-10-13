package org.djflying.javase.designpattern.patterns.singleton.hungry;

/**
 * 饿汉式单例（静态代码块）
 *
 * @author daijiong
 * @version $Id: HungryStaticSingleton.java, v 0.1 2019/5/14 19:56 daijiong Exp $$
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_STATIC_SINGLETON;
    }
}
