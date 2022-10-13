package org.djflying.javase.designpattern.patterns.template.course;

/**
 * 网课测试类
 *
 * @author daijiong
 * @version : NetworkCourseTest.java, v 0.1 2020/3/26 22:11 daijiong Exp $$
 */
public class NetworkCourseTest {

    public static void main(String[] args) {
        System.out.println("——————————Java课程————————————");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("——————————大数据课程————————————");
        NetworkCourse bigDataCourse = new BigDataCourse();
        bigDataCourse.createCourse();
    }
}
