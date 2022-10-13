package org.djflying.javase.designpattern.principles.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板类
 * <p>
 * 让TeamLeader去统计课程数量
 *
 * @author daijiong
 * @version $Id: Boss.java, v 0.1 2019/5/12 6:48 daijiong Exp $$
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        // 模拟Boss一页一页往下翻页，TeamLeader实时统计
        // 根据迪米特原则，Boss只想要结果，不需要跟Course产生直接的交流。TeamLeader统计需要引用Course对象，所以应该把下面一段代码移动到TeamLeader类中
        //List<Course> courses = new ArrayList<>();
        //        //for (int i = 0; i < 20; i++) {
        //        //    courses.add(new Course());
        //        //}
        //teamLeader.checkNumberOfCourses(courses);
        teamLeader.checkNumberOfCourses();
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
