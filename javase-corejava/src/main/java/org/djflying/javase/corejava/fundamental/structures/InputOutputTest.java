package org.djflying.javase.corejava.fundamental.structures;

import java.io.Console;

/**
 * 测试Scanner操作
 *
 * @author dj4817
 * @version $Id: InputOutputTest.java, v 0.1 2017/11/2 17:50 dj4817 Exp $$
 */
public class InputOutputTest {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);

        System.out.print("测试nextLine()方法：");
        String nextLine = in.nextLine();
        System.out.println(nextLine);

        System.out.println("测试next()方法：");
        String next = in.next();
        System.out.println(next);

        System.out.print("测试nextInt()方法：");
        int nextInt = in.nextInt();
        System.out.println(nextInt);

        System.out.println("测试nextDouble()方法：");
        double nextDouble = in.nextDouble();
        System.out.println(nextDouble);*/

        Console console = System.console();

        String userName = console.readLine("用户名：");
        char[] password = console.readPassword("密码：");
        System.out.println("你输入的用户名是：" + userName);
        System.out.println("你输入的密码是：" + password);

    }
}
