package org.djflying.javase.designpattern.patterns.template.course;

/**
 * Java课程
 *
 * @author daijiong
 * @version : JavaCourse.java, v 0.1 2020/3/26 22:08 daijiong Exp $$
 */
public class JavaCourse extends NetworkCourse {

    @Override
    protected void checkHomework() {
        System.out.println("检查是否提交Java课程作业");
    }
}
