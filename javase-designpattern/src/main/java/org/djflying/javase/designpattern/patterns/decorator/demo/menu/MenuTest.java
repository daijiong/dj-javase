package org.djflying.javase.designpattern.patterns.decorator.demo.menu;

/**
 * 菜单测试类
 *
 * @author daijiong
 * @version : MenuTest.java, v 0.1 2020/5/16 13:26 daijiong Exp $$
 */
public class MenuTest {
    public static void main(String[] args) {
        Menu baseMenu = new DefaultMenu();
        System.out.println("未登录的菜单为：" + String.join(",",baseMenu.getMenu()));
        Menu memberMenu = new MemberMenuDecorator(baseMenu);
        System.out.println("登录之后的菜单为：" + String.join(",",memberMenu.getMenu()));
    }
}
