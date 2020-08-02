package com.pop.pattern.mediator;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-02 22:50
 **/
public class User extends Humen{

    private String name;
    public String getName(){
        return name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message,ChatRoom chatRoom){
        chatRoom.showMessage(this,message);
    }
}
