package org.djflying.javase.designpattern.patterns.factory.factorymethod;

import org.djflying.javase.designpattern.patterns.factory.ICourse;

/**
 * 课程工厂接口
 *
 * @author daijiong
 * @version $Id: ICourseFactory.java, v 0.1 2019/5/13 20:18 daijiong Exp $$
 */
public interface ICourseFactory {

    default void pre() {
        System.out.println("打开录制视频软件");
    }

    /**
     * 创建课程
     * 
     * @return 具体课程
     */
    ICourse create();
}
