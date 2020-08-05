package com.pop.pattern.observer.jdk;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-05 22:43
 **/
public class App {

    public static void main(String[] args) {

        Community community = Community.getInstance();
        Teacher pop = new Teacher("pop");
        Teacher pipi = new Teacher("pipi");
        Question question = new Question("小明","有个问题请教");

        community.addObserver(pop);
        community.addObserver(pipi);

        community.publishQuestion(question);//发布问题
    }
}
