package org.djflying.javase.designpattern.patterns.singleton.lazy;

/**
 * 懒汉式单例（使用内部类）
 *
 * @author daijiong
 * @version : LazyInnerClassSingleton.java, v 0.1 2020/3/13 9:10 daijiong Exp $$
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
//        if (LazyInnerClassSingletonHolder.LAZY_INNER_CLASS_SINGLETON != null) {
//            throw new RuntimeException("不允许创建多个实例");
//        }
    };

    /**
     * static使单例的空间共享
     * final保证这个方法不会被重写，重载
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        // 在返回结果以前，一定会先加载内部类
        return LazyInnerClassSingletonHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    /**
     * 默认不加载，只有在使用的时候才会加载
     */
    private static class LazyInnerClassSingletonHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

}
