package org.djflying.javase.designpattern.patterns.factory.factorymethod;


import org.djflying.javase.designpattern.patterns.factory.ICourse;

/**
 * 课程的抽象工厂
 *
 * @author daijiong
 * @version $Id: AbstractCourseFactory.java, v 0.1 2019/5/13 20:29 daijiong Exp $$
 */
public abstract class AbstractCourseFactory {

    public void pre() {
        System.out.println("打开录制视频软件");
    }

    abstract ICourse create();
}
