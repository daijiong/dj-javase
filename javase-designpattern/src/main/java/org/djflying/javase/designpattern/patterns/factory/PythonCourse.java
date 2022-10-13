package org.djflying.javase.designpattern.patterns.factory;

/**
 * Python课程
 *
 * @author daijiong
 * @version $Id: PythonCourse.java, v 0.1 2019/5/13 19:56 daijiong Exp $$
 */
public class PythonCourse implements ICourse {

    /**
     * 录制课程
     */
    @Override
    public void record() {
        System.out.println("正在录制Python课程");
    }
}
