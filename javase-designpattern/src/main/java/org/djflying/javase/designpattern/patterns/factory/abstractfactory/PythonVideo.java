package org.djflying.javase.designpattern.patterns.factory.abstractfactory;

/**
 * Description
 *
 * @author daijiong
 * @version : PythonVideo.java, v 0.1 2020/3/12 21:19 daijiong Exp $$
 */
public class PythonVideo implements IVideo {

    /**
     * 观看视频
     */
    @Override
    public void watch() {
        System.out.println("观看Python视频");
    }
}
