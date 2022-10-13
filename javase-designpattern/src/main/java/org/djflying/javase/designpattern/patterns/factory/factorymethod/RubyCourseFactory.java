package org.djflying.javase.designpattern.patterns.factory.factorymethod;

import org.djflying.javase.designpattern.patterns.factory.ICourse;
import org.djflying.javase.designpattern.patterns.factory.RubyCourse;

/**
 * Description
 *
 * @author daijiong
 * @version : RubyCourseFactory.java, v 0.1 2020/3/12 16:21 daijiong Exp $$
 */
public class RubyCourseFactory extends AbstractCourseFactory {

    @Override
    ICourse create() {
        super.pre();
        return new RubyCourse();
    }
}
