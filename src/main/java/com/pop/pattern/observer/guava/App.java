package com.pop.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import com.pop.pattern.observer.jdk.Question;

/**
 * @author Pop
 * @date 2020/8/8 23:09
 */
public class App {


    public static void main(String[] args) {

        EventBus bus = new EventBus();

        //要被注册的对象
        GuavaEvent event  = new GuavaEvent();
        bus.register(event);
        // 触发
        bus.post(new Question("111","22"));

    }

}
