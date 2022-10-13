package org.djflying.javase.designpattern.patterns.singleton.lazy;

/**
 * 懒汉式单例（使用synchronized同步锁）
 *
 * @author daijiong
 * @version $Id: LazySimpleSingleton.java, v 0.1 2019/5/16 13:18 daijiong Exp $$
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {

    }

    public synchronized static LazySimpleSingleton getInstance() {
        // 这种方式是线程不安全的，一旦两个线程同时进入这个if代码，每个线程都会创建实例。
        // 要解决这个问题，可以再方法上添加synchronized关键字
        // 但是使用synchronized关键字的话，会产生性能问题
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
