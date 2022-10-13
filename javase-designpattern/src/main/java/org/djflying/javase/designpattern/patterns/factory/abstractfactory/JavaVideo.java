package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: JavaVideo.java, v 0.1 2019/5/14 19:03 daijiong Exp $$
 */
public class JavaVideo implements IVideo {

    /**
     * 观看视频
     */
    @Override
    public void watch() {
        System.out.println("观看Java视频");
    }
}
