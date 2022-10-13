package org.djflying.javase.corejava.reflection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 反射测试
 *
 * @author dj4817
 * @version $Id: ReflectionTest.java, v 0.1 2018/1/3 15:00 dj4817 Exp $$
 */
public class ReflectionTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        try {
            String className = "org.djflying.javase.corejava.inheritance.Employee";
            // 根据类名字符串构造这个类
            Class cl = Class.forName(className);
            // 获取类的超类
            Class supercl = cl.getSuperclass();
            // 获取类的修饰符
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + className);
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends " + supercl.getName());
            }
            System.out.print("\n{\n");
            // 获取类的所有属性
            printFields(cl);
            System.out.println();
            // 获取类的所有构造器
            printConstructors(cl);
            System.out.println();
            // 获取类的所有方法
            printMethods(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Prints all constructors of a class
     * @param cl a class
     */
    public void printConstructors(Class cl) {

        // 获取类的所有构造器
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c : constructors) {
            // 获取构造器的名称
            String name = c.getName();
            System.out.print("   ");
            // 获取构造器的修饰符
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            // 获取构造器的所有参数
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all methods of a class
     * @param cl a class
     */
    public void printMethods(Class cl) {

        // 获取类的所有方法
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            // 获取类的方法的返回类型
            Class retType = m.getReturnType();
            // 获取类的方法的名称
            String name = m.getName();
            System.out.print("   ");
            // 获取类的方法的修饰符
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");
            // 获取类的方法的参数
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Prints all fields of a class
     * @param cl a class
     */
    public void printFields(Class cl) {

        // 获取类的所有属性
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            // 获取类的属性的类型
            Class type = f.getType();
            // 获取类的属性的名称
            String name = f.getName();
            System.out.print("   ");
            // 获取类的属性的修饰符
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
