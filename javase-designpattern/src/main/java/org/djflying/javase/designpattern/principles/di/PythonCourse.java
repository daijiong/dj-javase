package org.djflying.javase.designpattern.principles.di;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: PythonCourse.java, v 0.1 2019/5/11 13:17 daijiong Exp $$
 */
public class PythonCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("Tom在学习Python课程");
    }
}
