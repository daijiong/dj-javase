package org.djflying.javase.designpattern.patterns.decorator.demo.menu;

import java.util.List;

/**
 * 菜单装饰器
 *
 * @author daijiong
 * @version : MenuDecorator.java, v 0.1 2020/5/16 13:21 daijiong Exp $$
 */
public abstract class MenuDecorator extends Menu {
    private Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    protected List<String> getMenu() {
        return menu.getMenu();
    }
}
