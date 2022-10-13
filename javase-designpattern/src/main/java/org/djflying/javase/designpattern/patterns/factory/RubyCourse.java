package org.djflying.javase.designpattern.patterns.factory;

/**
 * Description
 *
 * @author daijiong
 * @version : RubyCourse.java, v 0.1 2020/3/12 16:22 daijiong Exp $$
 */
public class RubyCourse implements ICourse {

    /**
     * 录制课程
     */
    @Override
    public void record() {
        System.out.println("正在录制Ruby课程");
    }
}
