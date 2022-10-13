package org.djflying.javase.corejava.interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 时间打印器
 *
 * @author dj4817
 * @version $Id: TimePrinter.java, v 0.1 2018/1/9 10:35 dj4817 Exp $$
 */
public class TimePrinter implements ActionListener {

    /**
     * Invoked when an action occurs.(回调函数)
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getSource());
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
