package org.djflying.javase.designpattern.principles.di;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: Tom.java, v 0.1 2019/5/11 11:42 daijiong Exp $$
 */
public class Tom {

    private ICourse course;

    public void studyJavaCourse() {
        System.out.println("Tom在学习Java课程");
    }

    public void studyPythonCourse() {
        System.out.println("Tom在学习Python课程");
    }

    public void study(ICourse course) {
        course.study();
    }

    public void study() {
        course.study();
    }

    public Tom() {
    }

    public Tom(ICourse course) {
        this.course = course;
    }

    /**
     * Getter method for property <tt>course</tt>.
     *
     * @return property value of course
     */
    public ICourse getCourse() {
        return course;
    }

    /**
     * Setter method for property <tt>course</tt>.
     *
     * @param course value to be assigned to property course
     */
    public void setCourse(ICourse course) {
        this.course = course;
    }

    public static void main(String[] args) {
        // 1.未遵循DI原则
        //Tom tom = new Tom();
        //tom.studyJavaCourse();
        //tom.studyPythonCourse();
        // 2.通过传参方式注入依赖
        //Tom tom = new Tom();
        //tom.study(new JavaCourse());
        //tom.study(new PythonCourse());
        // 3.通过构造方法方式注入依赖
        //Tom tom = new Tom(new JavaCourse());
        //tom.study();
        //Tom tom1 = new Tom(new PythonCourse());
        //tom1.study();
        // 4.通过setter方法方式注入依赖（当Tom是一个全局单例时）
        //Tom tom = new Tom();
        //tom.setCourse(new JavaCourse());
        //tom.study();
        //Tom tom1 = new Tom();
        //tom1.setCourse(new PythonCourse());
        //tom1.study();

    }
}
