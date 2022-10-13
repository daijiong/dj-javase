package org.djflying.javase.designpattern.patterns.singleton.register;

/**
 * 注册式单例（容器）测试类
 *
 * @author daijiong
 * @version : ContainerSingletonTest.java, v 0.1 2020/3/13 16:01 daijiong Exp $$
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("org.djflying.javase.designpattern.patterns.singleton.register.Pojo");
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10, 6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
