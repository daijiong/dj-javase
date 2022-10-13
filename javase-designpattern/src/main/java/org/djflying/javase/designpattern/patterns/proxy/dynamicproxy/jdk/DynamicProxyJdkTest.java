package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.jdk;

import java.io.FileOutputStream;
import java.io.IOException;

import org.djflying.javase.designpattern.patterns.proxy.Person;

import sun.misc.ProxyGenerator;

/**
 * JDK动态代理测试类
 *
 * @author daijiong
 * @version : DynamicProxyJdkTest.java, v 0.1 2020/3/14 20:53 daijiong Exp $$
 */
public class DynamicProxyJdkTest {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        Person girl = (Person) jdkMeipo.getInstance(new Girl());
        girl.findLove();

        try {
            //$Proxy0：动态代理类
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { Person.class });
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
