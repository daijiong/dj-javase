package org.djflying.javase.designpattern.patterns.singleton.threadlocal;

/**
 * 执行线程
 *
 * @author daijiong
 * @version : ThreadLocalSingleton.java, v 0.1 2020/3/13 16:01 daijiong Exp $$
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
