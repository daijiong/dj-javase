package org.djflying.javase.jvm.gupaoedu;

/**
 * 打印GC的日志
 *
 * @author daijiong
 * @version $Id: GCPrint.java, v 0.1 2019/4/11 12:52 daijiong Exp $$
 */
public class GCPrint {

    public static void main(String[] args) {
        // JVM最大内存量
        long maxMemory = Runtime.getRuntime().maxMemory();
        // JVM内存总量
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("JVM最大内存量为：" + maxMemory + "(" + maxMemory/1024/1024 + "MB" + ")");
        System.out.println("JVM内存总量为：" + totalMemory + "(" + totalMemory/1024/1024 + "MB" + ")");

    }
}
