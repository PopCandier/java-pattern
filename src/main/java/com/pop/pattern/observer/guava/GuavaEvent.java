package com.pop.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.pop.pattern.observer.jdk.Question;

/**
 * @author Pop
 * @date 2020/8/8 23:08
 */
public class GuavaEvent {

    @Subscribe
    public void observer(Object arg){

        if(arg instanceof Question){
            //可以用责任链做特殊处理
            System.out.println(arg);
        }
    }
}
