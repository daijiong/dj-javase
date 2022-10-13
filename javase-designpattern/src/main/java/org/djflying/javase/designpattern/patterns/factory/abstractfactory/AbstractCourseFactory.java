package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Description
 *
 * @author daijiong
 * @version : AbstractCourseFactory.java, v 0.1 2020/3/12 21:15 daijiong Exp $$
 */
public abstract class AbstractCourseFactory {

    abstract INote createNote();

    abstract IVideo createVideo();
}
