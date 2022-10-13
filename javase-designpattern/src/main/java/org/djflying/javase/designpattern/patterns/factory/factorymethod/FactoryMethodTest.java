package org.djflying.javase.designpattern.patterns.factory.factorymethod;

import org.djflying.javase.designpattern.patterns.factory.ICourse;

/**
 * 工厂方法测试类
 *
 * @author daijiong
 * @version $Id: FactoryMethodTest.java, v 0.1 2019/5/13 20:21 daijiong Exp $$
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        // 使用具体的课程工厂来创建具体的课程（接口方式）
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();
        // 使用具体的课程工厂来创建具体的课程（抽象类方式）
        AbstractCourseFactory rubyCourseFactory = new RubyCourseFactory();
        ICourse rubyCourse = rubyCourseFactory.create();
        rubyCourse.record();
    }
}
