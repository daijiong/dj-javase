package org.djflying.javase.designpattern.patterns.decorator.demo.menu;

import java.util.List;

/**
 * 会员菜单
 *
 * @author daijiong
 * @version : MemberMenuDecorator.java, v 0.1 2020/5/16 13:22 daijiong Exp $$
 */
public class MemberMenuDecorator extends MenuDecorator {

    public MemberMenuDecorator(Menu menu) {
        super(menu);
    }

    @Override
    protected List<String> getMenu() {
        List<String> menu = super.getMenu();
        menu.remove("立即登录");
        menu.remove("免费注册");
        menu.add("作业");
        menu.add("题库");
        menu.add("成长墙");
        menu.add("头像");
        return menu;
    }
}
