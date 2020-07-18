package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:23
 */
public class MenuDecorator extends Menu {

    private Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    boolean support(Role role) {
        return menu.support(role);
    }

    @Override
    String name() {
        return menu.name();
    }

    @Override
    void setName(String name) {
        menu.setName(name);
    }
}
