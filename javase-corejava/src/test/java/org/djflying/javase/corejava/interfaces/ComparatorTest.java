package org.djflying.javase.corejava.interfaces;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 比较器测试类
 *
 * @author dj4817
 * @version $Id: ComparatorTest.java, v 0.1 2018/1/9 11:17 dj4817 Exp $$
 */
public class ComparatorTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        Comparator<String> comparator = new LengthComparator();
        String[] friends = { "David", "Jue", "Mary" };
            // 对于Arrays的sort方法来说，只要传入的比较器实现了Comparator接口的compare方法，那么就会执行具体的方法来进行排序。
        Arrays.sort(friends, comparator);
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
