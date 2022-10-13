package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 *  课程抽象工厂
 *
 * @author daijiong
 * @version $Id: ICourseFactory.java, v 0.1 2019/5/14 18:50 daijiong Exp $$
 */
public interface ICourseFactory {

    /**
     * 创建笔记
     *
     * @return
     */
    INote createNote();

    /**
     * 创建视频
     *
     * @return
     */
    IVideo createVideo();
}
