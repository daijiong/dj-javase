package org.djflying.javase.jvm.gupaoedu;

/**
 * 栈测试
 *
 * @author daijiong
 * @version $Id: StackTest.java, v 0.1 2019/4/9 10:58 daijiong Exp $$
 */
public class StackTest {

    private static final String name = "test";
    private static String staticName = "test";

    public StackTest() {
    }

    public static void add(int a, int b) {
        int result = a + b;
    }

    public static void test02() {
        test02();
    }

    public static void test03() {

    }

    public static void main(String[] args) {
        add(1, 2);
        test02();
    }
}
