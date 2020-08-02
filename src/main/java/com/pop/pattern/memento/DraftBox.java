package com.pop.pattern.memento;

import java.util.Stack;

/**
 * @program: java-pattern
 * @description: 垃圾箱，备忘录组件三，对备忘录管理的对象
 * @author: Pop
 * @create: 2020-08-02 21:19
 **/
public class DraftBox {

    private final Stack<Memento> stack = new Stack<Memento>();

    public Memento getMemento(){
        return stack.pop();
    }

    public void addMemento(Memento memento){
        stack.push(memento);
    }
}
