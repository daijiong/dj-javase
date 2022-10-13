package org.djflying.javase.designpattern.patterns.singleton.hungry;

/**
 * 饿汉式单例
 *
 * @author daijiong
 * @version $Id: HungrySingleton.java, v 0.1 2019/5/14 19:54 daijiong Exp $$
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
