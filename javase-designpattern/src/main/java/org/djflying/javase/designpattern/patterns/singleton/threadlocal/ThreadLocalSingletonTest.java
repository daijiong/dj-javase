package org.djflying.javase.designpattern.patterns.singleton.threadlocal;

/**
 * ThreadLocal单例测试类
 *
 * @author daijiong
 * @version : ThreadLocalSingleton.java, v 0.1 2020/3/13 16:01 daijiong Exp $$
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
