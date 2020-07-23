package com.pop.pattern.delegate;

/**
 * @author Pop
 * @date 2020/7/23 23:50
 */
public class App {


    public static void main(String[] args) {

        new Boss().doSomething("软件架构",new Leader());
        new Boss().doSomething("底层涉及",new Leader());
        new Boss().doSomething("销售",new Leader());//超出领域范围，将无法操作
    }
}
