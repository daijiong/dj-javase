package org.djflying.javase.designpattern.principles.sr;

import org.apache.commons.lang3.StringUtils;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: Course.java, v 0.1 2019/5/11 23:08 daijiong Exp $$
 */
public class Course {

    public void study(String courseName) {
        if (StringUtils.equals("直播课", courseName)) {
            System.out.println(courseName + "不能快进");
        } else {
            System.out.println(courseName + "可以反复回看");
        }
    }

    public static void main(String[] args) {
        // 1.未遵循单一职责原则
        //Course course = new Course();
        //course.study("直播课");
        //course.study("录播课");
        // 2.遵循单一职责原则
        //ReplayCourse replayCourse = new ReplayCourse();
        //replayCourse.study("录播课");
        //LiveCourse liveCourse = new LiveCourse();
        //liveCourse.study("直播课");

    }
}
