package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:25
 */
public class UserMenu extends MenuDecorator {

    public UserMenu(Menu menu) {
        super(menu);
    }


    @Override
    boolean support(Role role) {
        return super.support(role)&&role.getRoles().contains("用户管理");
    }

    @Override
    String name() {
        return super.name()+"用户管理|";
    }
}
