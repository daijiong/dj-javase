package org.djflying.javase.designpattern.patterns.factory.factorymethod;


import org.djflying.javase.designpattern.patterns.factory.ICourse;
import org.djflying.javase.designpattern.patterns.factory.PythonCourse;

/**
 * Python课程工厂
 *
 * @author daijiong
 * @version $Id: PythonCourseFactory.java, v 0.1 2019/5/13 20:20 daijiong Exp $$
 */
public class PythonCourseFactory implements ICourseFactory {

    /**
     * 创建课程
     *
     * @return 具体课程
     */
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
