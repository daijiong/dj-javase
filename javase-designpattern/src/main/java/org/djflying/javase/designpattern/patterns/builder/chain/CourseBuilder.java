package org.djflying.javase.designpattern.patterns.builder.chain;

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
     * @return 
     */
    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    /**
     * 添加课程PPT
     * @param ppt
     * @return 
     */
    public CourseBuilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    /**
     * 添加课堂笔记
     * @param note
     * @return 
     */
    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    /**
     * 添加视频
     * @param video
     * @return 
     */
    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    /**
     * 添加课后作业
     * @param homework
     * @return 
     */
    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return course;
    }
}
