package com.pop.pattern.state;

import com.pop.pattern.decorator.homework.User;

/**
 * @program: java-pattern
 * @description: 用户还未登陆的行为
 * @author: Pop
 * @create: 2020-07-29 23:50
 **/
public class UnLoginUserState extends UserState {
    @Override
    public void favorite() {
        switchLogin();
        context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        switchLogin();//如果你没有登录，那么你就无法增加评论或者点赞
        context.getState().comment(comment);
    }

    /**'
     * 切换到登陆的状态
     */
    private void switchLogin(){
        System.out.println("切换到登陆状态");
        context.setState(context.LOGIN_STATE);
    }
}
