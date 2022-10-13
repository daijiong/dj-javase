package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * 抽象工厂测试类
 *
 * @author daijiong
 * @version $Id: AbstractFactoryTest.java, v 0.1 2019/5/14 19:04 daijiong Exp $$
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().read();
        javaCourseFactory.createVideo().watch();

        AbstractCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().read();
        pythonCourseFactory.createVideo().watch();

    }
}
