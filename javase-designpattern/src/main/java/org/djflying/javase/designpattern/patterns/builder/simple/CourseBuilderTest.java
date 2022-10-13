package org.djflying.javase.designpattern.patterns.builder.simple;

/**
 * 课程建造者测试类
 *
 * @author daijiong
 * @version : CourseBuilderTest.java, v 0.1 2020/5/14 20:53 daijiong Exp $$
 */
public class CourseBuilderTest {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("设计模式");
        builder.addPpt("设计模式PPT");
        builder.addVideo("设计模式视频");
        builder.addNote("设计模式课堂笔记");
        builder.addHomework("设计模式课后作业");
        Course course = builder.build();
        System.out.println(course);
    }

}
