package org.djflying.javase.designpattern.patterns.decorator.demo.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 默认菜单
 *
 * @author daijiong
 * @version : DefaultMenu.java, v 0.1 2020/5/16 13:18 daijiong Exp $$
 */
public class DefaultMenu extends Menu {
    @Override
    protected List<String> getMenu() {
        List<String> baseMenus = new ArrayList<>();
        baseMenus.add("问答");
        baseMenus.add("文章");
        baseMenus.add("精品课");
        baseMenus.add("冒泡");
        baseMenus.add("商城");
        baseMenus.add("搜索框");
        baseMenus.add("我要提问");
        baseMenus.add("立即登录");
        baseMenus.add("免费注册");
        return baseMenus;
    }
}
