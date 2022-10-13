package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Description
 *
 * @author daijiong
 * @version : PythonNote.java, v 0.1 2020/3/12 21:19 daijiong Exp $$
 */
public class PythonNote implements INote {

    /**
     * 查看笔记
     */
    @Override
    public void read() {
        System.out.println("查看Python笔记");
    }
}
