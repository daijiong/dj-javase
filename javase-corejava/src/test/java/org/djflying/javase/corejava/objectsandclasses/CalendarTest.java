package org.djflying.javase.corejava.objectsandclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Calendar测试类
 *
 * @author dj4817
 * @version $Id: CalendarTest.java, v 0.1 2017/12/27 16:48 dj4817 Exp $$
 */
public class CalendarTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println("当前月份：" + month);
        System.out.println("当前日期：" + today);

        // Set to start of month
        date = date.minusDays(today - 1);
        System.out.println("当月初的日期：" + date.getDayOfMonth());
        DayOfWeek weekday = date.getDayOfWeek();
        // 1 = Monday, ... 7 = Sunday
        int value = weekday.getValue();
        System.out.println("当月初的星期：" + value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        // 打印第一行
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        // 循环当月的所有日期
        while (date.getMonthValue() == month) {
            // 打印当前日期
            System.out.printf("%3d", date.getDayOfMonth());
            // 遍历到当前日期，加*号
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // 遍历到星期天则回车
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            // 当前日期+1
            date = date.plusDays(1);
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
