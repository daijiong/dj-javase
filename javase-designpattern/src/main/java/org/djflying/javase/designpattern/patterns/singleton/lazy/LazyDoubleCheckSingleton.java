package org.djflying.javase.designpattern.patterns.singleton.lazy;

/**
 * 懒汉式单例（使用双重检查锁）
 *
 * @author daijiong
 * @version $Id: LazyDoubleCheckSingleton.java, v 0.1 2019/5/16 13:59 daijiong Exp $$
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        // 为了解决synchronized锁定方法，从而锁定类的问题，这里使用双重检查锁的方式实现。
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
