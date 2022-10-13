package org.djflying.javase.designpattern.patterns.factory;

/**
 * Java课程
 *
 * @author daijiong
 * @version $Id: JavaCourse.java, v 0.1 2019/5/13 19:37 daijiong Exp $$
 */
public class JavaCourse implements ICourse {
    /**
     * 录制课程
     */
    @Override
    public void record() {
        System.out.println("正在录制Java课程");
    }
}
