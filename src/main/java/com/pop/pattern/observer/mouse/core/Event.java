package com.pop.pattern.observer.mouse.core;

import java.lang.reflect.Method;

/**
 * @author Pop
 * @date 2020/8/8 23:51
 *
 * 事件
 */
public class Event {

    public Event(Object target) {
        this.target = target;
    }

    public Object getSource() {
        return source;
    }

    public Method getCallback() {
        return callback;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    /**
     * 事件源，事件的发起者
     */
    private Object source;
    /**
     * 事件的接受者
     */
    private Object target;

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    /**
     * 具体要触发的方法
     */
    private Method callback;

    public Object getTarget() {
        return target;
    }
}
