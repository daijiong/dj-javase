package org.djflying.javase.designpattern.patterns.singleton.threadlocal;

/**
 * ThreadLocal单例
 *
 * @author daijiong
 * @version : ThreadLocalSingleton.java, v 0.1 2020/3/13 16:01 daijiong Exp $$
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());
    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
