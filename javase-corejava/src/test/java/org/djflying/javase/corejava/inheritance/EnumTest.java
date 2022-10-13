package org.djflying.javase.corejava.inheritance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 枚举测试类
 *
 * @author dj4817
 * @version $Id: EnumTest.java, v 0.1 2018/1/4 18:08 dj4817 Exp $$
 */
public class EnumTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        Size size = Enum.valueOf(Size.class, "EXTRA_LARGE");
        System.out.println("size=" + size.toString());
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE){
            System.out.println("Good Job -- you paid attention to the _.");
        }
    }
}
