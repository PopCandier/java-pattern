package com.pop.pattern.state;

/**
 * @program: java-pattern
 * @description: 用户已经登陆了的行为
 * @author: Pop
 * @create: 2020-07-29 23:50
 **/
public class LoginUserState extends UserState {

    /**
     * 已经登陆的用户可以很流畅的使用
     */
    @Override
    public void favorite() {
        System.out.println(" 给这篇文章一个赞");
    }

    @Override
    public void comment(String comment) {
        System.out.println("给这篇文章一个评论:"+ comment);
    }
}
