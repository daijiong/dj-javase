package org.djflying.javase.designpattern.patterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例（容器）
 *
 * @author daijiong
 * @version : ContainerSingleton.java, v 0.1 2020/3/13 16:01 daijiong Exp $$
 */
public class ContainerSingleton {

    private ContainerSingleton(){}
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();
    public static Object getInstance(String className){
        synchronized (ioc) {
            if (ioc.containsKey(className)){
                return ioc.get(className);
            }
            Object object = null;
            try {
                object = Class.forName(className).newInstance();
                ioc.put(className, object);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return object;
        }
    }


}
