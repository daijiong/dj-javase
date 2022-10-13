package org.djflying.javase.designpattern.patterns.factory.simplefactory;

import org.djflying.javase.designpattern.patterns.factory.ICourse;
import org.djflying.javase.designpattern.patterns.factory.PythonCourse;

/**
 * 简单工厂测试类
 *
 * @author daijiong
 * @version $Id: SimpleFactoryTest.java, v 0.1 2019/5/13 19:39 daijiong Exp $$
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        // 1.没有课程工厂的情况下，我们需要自己new具体的课程
        //ICourse course = new JavaCourse();
        //course.record();
        // 2.有课程工厂的情况下，我们通过课程工厂可以创建具体的课程
        //CourseFactory factory = new CourseFactory();
        //ICourse course = factory.create("java");
        //course.record();
        // 3.通过课程的类来创建具体的课程
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(PythonCourse.class);
        course.record();

    }
}
