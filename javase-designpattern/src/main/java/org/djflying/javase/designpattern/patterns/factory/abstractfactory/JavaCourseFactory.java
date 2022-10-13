package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Java课程工厂
 *
 * @author daijiong
 * @version $Id: JavaCourseFactory.java, v 0.1 2019/5/14 18:57 daijiong Exp $$
 */
public class JavaCourseFactory implements ICourseFactory {

    /**
     * 创建笔记
     *
     * @return
     */
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    /**
     * 创建视频
     *
     * @return
     */
    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
