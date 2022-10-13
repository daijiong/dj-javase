package org.djflying.javase.corejava.interfaces;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * 时间测试类
 *
 * @author dj4817
 * @version $Id: TimerTest.java, v 0.1 2018/1/9 10:37 dj4817 Exp $$
 */
public class TimerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        ActionListener listener = new TimePrinter();
        // construct a timer that calls the listener
        // once every 10 seconds
        // 对于Timer来说，只要传进来的listener实现了ActionListener接口的actionPerformed方法，那么在Timer调用start()方法之后就会执行这个回调函数。
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
