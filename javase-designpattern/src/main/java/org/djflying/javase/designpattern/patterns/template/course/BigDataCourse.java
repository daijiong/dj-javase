package org.djflying.javase.designpattern.patterns.template.course;

/**
 * 大数据课程
 *
 * @author daijiong
 * @version : BigDataCourse.java, v 0.1 2020/3/26 22:09 daijiong Exp $$
 */
public class BigDataCourse extends NetworkCourse {

    /**
     * 是否需要作业，钩子方法，子类可以选择性的去修改
     *
     * @return
     */
    @Override
    protected boolean needHomework() {
        return true;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查是否提交大数据课程作业");
    }
}
