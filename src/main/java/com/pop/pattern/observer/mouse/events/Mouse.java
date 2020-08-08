package com.pop.pattern.observer.mouse.events;

import com.pop.pattern.observer.mouse.core.EventObservable;

/**
 * @author Pop
 * @date 2020/8/8 23:55
 *
 *  事件的接受者，也就是被观察者
 */
public class Mouse extends EventObservable {

    public void click(){
        this.trigger(EventListener.ON_CLICK);
    }
}
