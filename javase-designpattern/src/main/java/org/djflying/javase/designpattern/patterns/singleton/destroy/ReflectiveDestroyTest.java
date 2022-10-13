package org.djflying.javase.designpattern.patterns.singleton.destroy;

import java.lang.reflect.Constructor;

import org.djflying.javase.designpattern.patterns.singleton.lazy.LazyInnerClassSingleton;

/**
 * 反射破坏单例测试
 *
 * @author daijiong
 * @version : ReflectiveDestroyTest.java, v 0.1 2020/3/13 9:56 daijiong Exp $$
 */
public class ReflectiveDestroyTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            // 获取私有的构造函数
            Constructor constructor = clazz.getDeclaredConstructor(null);
            // 强制访问
            constructor.setAccessible(true);
            // 通过构造函数初始化对象
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
