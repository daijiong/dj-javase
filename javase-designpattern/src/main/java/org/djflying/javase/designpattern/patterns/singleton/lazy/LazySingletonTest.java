package org.djflying.javase.designpattern.patterns.singleton.lazy;

/**
 * 懒汉式单例测试类
 *
 * @author daijiong
 * @version $Id: LazySingletonTest.java, v 0.1 2019/5/16 13:21 daijiong Exp $$
 */
public class LazySingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread(), "thread1");
        Thread t2 = new Thread(new ExecutorThread(), "thread2");
        t1.start();
        t2.start();
        System.out.println("Executor End");
    }
}
