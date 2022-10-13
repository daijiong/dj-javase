package org.djflying.javase.designpattern.patterns.builder.chain;

import lombok.Data;

/**
 * 课程
 *
 * @author daijiong
 * @version : Course.java, v 0.1 2020/5/14 20:43 daijiong Exp $$
 */
@Data
public class Course {

    /** 名称 */
    private String name;
    /** 课件 */
    private String ppt;
    /** 课堂笔记 */
    private String note;
    /** 视频 */
    private String video;
    /** 课后作业 */
    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", note='" + note + '\'' +
                ", video='" + video + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}
