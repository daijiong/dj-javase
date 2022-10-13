package org.djflying.javase.corejava.reflection;

import org.djflying.javase.corejava.inheritance.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * 对象分析器测试类
 *
 * @author dj4817
 * @version $Id: ObjectAnalyzerTest.java, v 0.1 2018/1/5 16:59 dj4817 Exp $$
 */
public class ObjectAnalyzerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        Employee employee = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        System.out.println(new ObjectAnalyzer().toString(employee));
    }
}
