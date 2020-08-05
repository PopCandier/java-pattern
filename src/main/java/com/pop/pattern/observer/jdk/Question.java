package com.pop.pattern.observer.jdk;

/**
 * @program: java-pattern
 * @description: 问题
 * @author: Pop
 * @create: 2020-08-05 22:36
 **/
public class Question {
    private String name;
    private String content;

    public Question(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
