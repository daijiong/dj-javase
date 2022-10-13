package org.djflying.javase.designpattern.patterns.factory.factorymethod;

import org.djflying.javase.designpattern.patterns.factory.ICourse;
import org.djflying.javase.designpattern.patterns.factory.JavaCourse;

/**
 * Java课程工厂
 *
 * @author daijiong
 * @version $Id: JavaCourseFactory.java, v 0.1 2019/5/13 20:19 daijiong Exp $$
 */
public class JavaCourseFactory implements ICourseFactory {
    /**
     * 创建课程
     *
     * @return 具体课程
     */
    @Override
    public ICourse create() {
        pre();
        return new JavaCourse();
    }
}
