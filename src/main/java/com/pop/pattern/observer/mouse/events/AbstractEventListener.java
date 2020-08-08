package com.pop.pattern.observer.mouse.events;

import com.pop.pattern.observer.mouse.core.Event;

/**
 * @author Pop
 * @date 2020/8/8 23:54
 */
public abstract class AbstractEventListener implements EventListener{

    @Override
    public void onClick(Event event) {
        System.out.println("点击事件的默认实现");
    }

    @Override
    public void onMove(Event event) {
        System.out.println("移动事件的默认实现");
    }
}
