package org.djflying.javase.designpattern.principles.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * TeamLeader类
 * <p>
 * 统计课程数量
 *
 * @author daijiong
 * @version $Id: TeamLeader.java, v 0.1 2019/5/12 6:46 daijiong Exp $$
 */
public class TeamLeader {

    public void checkNumberOfCourses(List<Course> courses) {
        System.out.println("已发布的课程数量：" + courses.size());
    }

    public void checkNumberOfCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("已发布的课程数量：" + courses.size());
    }
}
