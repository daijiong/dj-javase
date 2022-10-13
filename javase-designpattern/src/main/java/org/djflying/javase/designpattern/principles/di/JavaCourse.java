package org.djflying.javase.designpattern.principles.di;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: JavaCourse.java, v 0.1 2019/5/11 13:15 daijiong Exp $$
 */
public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom在学习Java课程");
    }
}
