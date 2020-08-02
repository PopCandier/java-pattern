package com.pop.pattern.mediator;

/**
 * @program: java-pattern
 * @description: 聊天室
 * @author: Pop
 * @create: 2020-08-02 22:50
 **/
public class ChatRoom {


    public void showMessage(User user,String message){
        System.out.println("["+user.getName()+"]:"+message);
    }

}
