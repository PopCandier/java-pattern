package com.pop.pattern.state;

import com.pop.pattern.facade.App;

/**
 * @program: java-pattern
 * @description: 定义一个状态，用于切换
 * @author: Pop
 * @create: 2020-07-29 23:40
 **/
public abstract class UserState {

    protected AppContext context;

    protected void setContext (AppContext context){
        this.context = context;
    }

    /**
     * 用户状态的类，用于定义用户状态会具有什么行为
     *
     * 不同的用户状态具有不同的行为
     */

    /**
     * 不同状态下的 点击喜欢 一片文章的操作
     */
    public abstract void favorite();

    /**
     *  不同状态下 增加评论 增加评论
     * @param comment
     */
    public abstract  void comment(String comment);
}
