package com.pop.pattern.memento;

/**
 * @program: java-pattern
 * @description: 用于传输备忘录的实体
 * 备忘录模式组件之二 ，快照实体
 * @author: Pop
 * @create: 2020-08-02 21:05
 **/
public class Memento {

    public Memento(String title,String content){
        this.title = title;
        this.content = content;
    }

    private String title;
    private String content;

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }
}
