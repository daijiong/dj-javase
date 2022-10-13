package org.djflying.javase.designpattern.patterns.template.course;

/**
 * 网课
 *
 * @author daijiong
 * @version : NetworkCourse.java, v 0.1 2020/3/26 21:58 daijiong Exp $$
 */
public abstract class NetworkCourse {

    /**
     * 创建课程
     */
    protected void createCourse(){
        // 1.发布预习资料
        postPreResource();
        // 2.线上授课
        liveVideo();
        // 3.发布上课PPT和笔记
        postNote();
        // 4.发布作业
        postHomework();
        // 5.检查作业
        if(needHomework()){
            checkHomework();
        }
    }

    final void postPreResource(){
        System.out.println("发布预习资料");
    }

    final void liveVideo() {
        System.out.println("线上授课");
    }

    final void postNote() {
        System.out.println("发布上课PPT和笔记");
    }

    final void postHomework() {
        System.out.println("发布作业");
    }

    /**
     * 是否需要作业，钩子方法，子类可以选择性的去修改
     *
     * @return
     */
    protected boolean needHomework() {
        return false;
    }

    /**
     * 检查作业，需要子类去实现
     */
    protected abstract void checkHomework();






}
