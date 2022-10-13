package org.djflying.javase.designpattern.patterns.builder.simple;

/**
 * 课程建造者
 *
 * @author daijiong
 * @version : CourseBuilder.java, v 0.1 2020/5/14 20:46 daijiong Exp $$
 */
public class CourseBuilder {

    private Course course = new Course();

    /**
     * 添加课程名称
     * @param name
     */
    public void addName(String name){
        course.setName(name);
    }

    /**
     * 添加课程PPT
     * @param ppt
     */
    public void addPpt(String ppt){
        course.setPpt(ppt);
    }

    /**
     * 添加课堂笔记
     * @param note
     */
    public void addNote(String note){
        course.setNote(note);
    }

    /**
     * 添加视频
     * @param video
     */
    public void addVideo(String video){
        course.setVideo(video);
    }

    /**
     * 添加课后作业
     * @param homework
     */
    public void addHomework(String homework){
        course.setHomework(homework);
    }

    public Course build(){
        return course;
    }
}
