package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:13
 *
 * 基础菜单
 * 抽象菜单组件，用于定义行为
 */
public abstract class Menu {

    protected String menuName="|";

    /**
     * 用于判断用户权限是否能够使得这个菜单显示
     * @param role
     * @return
     */
    abstract boolean support(Role role);

    /**
     * 菜单名字的展示
     * @return
     */
    abstract String name();

    abstract void setName(String name);


}
