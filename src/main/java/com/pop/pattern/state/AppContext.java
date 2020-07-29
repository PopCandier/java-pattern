package com.pop.pattern.state;

/**
 * @program: java-pattern
 * @description: 状态的上下文切换
 * @author: Pop
 * @create: 2020-07-29 23:42
 **/
public class AppContext {

    //持有所有状态
    public static final UserState LOGIN_STATE = new LoginUserState();
    public static final UserState UNLOGIN_STATE = new UnLoginUserState();

    {
        //持有上下文
        LOGIN_STATE.setContext(this);
        UNLOGIN_STATE.setContext(this);
    }

    private UserState userState = UNLOGIN_STATE;//内部持有一个状态，用户切换

    public void setState(UserState state){
        this.userState = state;
    }
    public UserState getState(){
        return userState;
    }
    public void favorite(){
        userState.favorite();
    }

    public void comment(String comment){
        userState.comment(comment);
    }

}
