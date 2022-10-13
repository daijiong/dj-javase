package org.djflying.javase.designpattern.patterns.singleton.lazy;

/**
 * 线程执行类
 *
 * @author daijiong
 * @version $Id: ExecutorThread.java, v 0.1 2019/5/16 13:23 daijiong Exp $$
 */
public class ExecutorThread implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        //        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        //                LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println("当前线程：" + Thread.currentThread().getName() + "|创建实例：" + instance);

    }
}
