package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Description
 *
 * @author daijiong
 * @version : PythonCourseFactory.java, v 0.1 2020/3/12 21:18 daijiong Exp $$
 */
public class PythonCourseFactory extends AbstractCourseFactory {

    @Override
    INote createNote() {
        return new PythonNote();
    }

    @Override
    IVideo createVideo() {
        return new PythonVideo();
    }
}
