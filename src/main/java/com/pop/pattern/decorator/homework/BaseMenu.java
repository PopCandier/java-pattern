package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:21
 */
public class BaseMenu extends Menu {

    @Override
    boolean support(Role role) {
        return role.getRoles().contains("普通用户");
    }

    @Override
    String name() {
        return "";
    }

    @Override
    void setName(String name) {
        this.menuName = menuName;
    }


}
