package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:27
 */
public class RoleMenu extends MenuDecorator {

    public RoleMenu(Menu menu) {
        super(menu);
    }

    @Override
    boolean support(Role role) {
        return super.support(role)&&role.getRoles().contains("权限管理");
    }



    @Override
    String name() {
        return super.name()+"权限管理|";
    }
}
