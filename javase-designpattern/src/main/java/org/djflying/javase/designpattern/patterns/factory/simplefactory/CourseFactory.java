package org.djflying.javase.designpattern.patterns.factory.simplefactory;

import org.djflying.javase.designpattern.patterns.factory.ICourse;
import org.djflying.javase.designpattern.patterns.factory.JavaCourse;
import org.djflying.javase.designpattern.patterns.factory.PythonCourse;

/**
 * 课程工厂
 *
 * @author daijiong
 * @version $Id: CourseFactory.java, v 0.1 2019/5/13 19:40 daijiong Exp $$
 */
public class CourseFactory {

    ///**
    // * 通过课程名称创建课程
    // * 
    // * @param name 课程名称
    // * @return 具体课程
    // */
    //public ICourse create(String name) {
    //    if (StringUtils.equals("java", name)) {
    //        return new JavaCourse();
    //    } else {
    //        return null;
    //    }
    //}

    /**
     * 通过课程类创建课程
     *
     * @param clazz 课程类
     * @return 具体的课程
     */
    public ICourse create(Class clazz) {
        try {
            if (JavaCourse.class == clazz) {
                return (ICourse) clazz.newInstance();
            }
            if (PythonCourse.class == clazz) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
