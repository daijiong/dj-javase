package org.djflying.javase.jvm.gupaoedu;

import java.io.File;

/**
 * JVM分析
 *
 * @author daijiong
 * @version $Id: HelloWorldDemo.java, v 0.1 2019/3/5 16:03 daijiong Exp $$
 */
public class HelloWorldDemo {

    // 常量、静态变量
    private final int  i   = 0;
    private static int k   = 0;
    // 成员变量
    private Object     obj = new Object();
    private int        sss = 0;

    public void methodOne(int i) {
        int j = 0;
        int sum = i + j;
        Object acb = obj;
        long start = System.currentTimeMillis();
        methodTwo();
        //TODO
        return;
    }

    public void methodTwo() {
        File file = new File("");
    }

    public static void methodThree() {
        // 方法递归调用
        methodThree();
    }

}
