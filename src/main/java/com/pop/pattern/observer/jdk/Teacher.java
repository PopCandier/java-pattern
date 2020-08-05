package com.pop.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: java-pattern
 * @description: 教师，观察者
 * @author: Pop
 * @create: 2020-08-05 22:40
 **/
public class Teacher implements Observer {

    private String name;
    public  Teacher(String name){
        this.name=name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Community community = (Community) o;
        Question question = (Question) arg;
        System.out.println(this.name+" 获得问题 :"+question);
    }
}
