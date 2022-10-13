package org.djflying.javase.corejava.reflection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组的拷贝功能测试类
 *
 * @author dj4817
 * @version $Id: CopyOfTest.java, v 0.1 2018/1/5 17:19 dj4817 Exp $$
 */
public class CopyOfTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        int[] a = { 1, 2, 3 };
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = { "Tom", "Dick", "Harry" };
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        // badCopyOf方法返回的Object数组无法强转为String数组
        b = (String[]) badCopyOf(b, 10);

    }

    /**
     * 糟糕的拷贝方法
     *
     * @param a 原数组
     * @param newLength 新数组的长度
     * @return 新数组
     */
    public Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * 好的拷贝方法
     *
     * @param a 原数组
     * @param newLength 新数组的长度
     * @return 新数组
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        }
        // 获取传入数组的元素类型
        Class componentType = cl.getComponentType();
        // 获取传入数组的长度
        int length = Array.getLength(a);
        // 构建新的数组实例
        Object newArray = Array.newInstance(componentType, newLength);
        // 将传入的a数组拷贝到新的数组，都从0位置开始拷贝，拷贝原数组的长度
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
