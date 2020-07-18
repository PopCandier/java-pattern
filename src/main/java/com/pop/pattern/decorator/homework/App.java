package com.pop.pattern.decorator.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pop
 * @date 2020/7/18 21:28
 */
public class App {

    /**
     * 根据用户的权限，来决定是否要显示那些菜单
     * @param args
     */
    public static void main(String[] args) {

        //https://gper.club/homework/tasks/7e7e7f7ff7g5egc4g6agf0

        User xiaoming  = new User("xiaoming","普通用户","用户管理","权限管理");
        User xiaowang  = new User("xiaowang","普通用户","权限管理");
        Menu menu = null;
        menu = new BaseMenu();
        List<Menu> menus = new ArrayList<>();
        menus.addAll(Arrays.asList(new RoleMenu(menu),new UserMenu(menu)));

        StringBuilder finalMenu = new StringBuilder(menu.name());
        for (Menu m : menus){
            if (m.support(xiaoming.getRole())){
                finalMenu.append(m.name());
            }
        }
        System.out.println(finalMenu.toString());

        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "h";
        String s4 = "ello";
        String s5 = s3+s4;
        String s6 = "hello";
        System.out.println(s1==s2);
        System.out.println(s1.intern()==s2.intern());
        System.out.println(s6==s5);
    }

}
