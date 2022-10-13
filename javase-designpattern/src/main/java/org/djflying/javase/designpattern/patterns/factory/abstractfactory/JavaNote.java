package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Java笔记
 *
 * @author daijiong
 * @version $Id: JavaNote.java, v 0.1 2019/5/14 19:00 daijiong Exp $$
 */
public class JavaNote implements INote {

    /**
     * 查看笔记
     */
    @Override
    public void read() {
        System.out.println("查看Java笔记");
    }
}
