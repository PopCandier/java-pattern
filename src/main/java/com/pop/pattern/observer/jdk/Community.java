package com.pop.pattern.observer.jdk;

import java.util.Observable;

/**
 * @program: java-pattern
 * @description: 被观察者：社区
 * @author: Pop
 * @create: 2020-08-05 22:34
 **/
public class Community extends Observable {

    private String  name = "某个社区";
    private static final Community community = new Community();
    private Community(){}
    public static Community getInstance(){
        return community;
    }

    public void publishQuestion(Question question){
        System.out.println(name+" 得到问题："+question);
        setChanged();//更改状态
        notifyObservers(question);
    }
}
