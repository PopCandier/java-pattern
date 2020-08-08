package com.pop.pattern.observer.mouse.core;

import java.rmi.server.ExportException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pop
 * @date 2020/8/8 23:51
 *
 * 事件的被观察者
 *
 * 应该维护被通知的列表
 */
public class EventObservable {

    private Map<String,Event> observers = new HashMap<String,Event>();

    public void addListener(String eventType,Event event){
        //默认取的事件是on开头的
        try {
            event.setCallback(event.getTarget().getClass().getMethod("on"+toUpper(eventType),Event.class));
            this.observers.put(eventType, event);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private String toUpper(String eventType) {
        char [] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    protected void trigger(String eventType){
        if(!this.observers.containsKey(eventType)){return;}
        trigger(this.observers.get(eventType));
    }

    private void trigger(Event event){
        event.setSource(this);//自己就是被观察者，也就是事件源，事件发送者
        try {
            if(event.getCallback()!=null)
            event.getCallback().invoke(event.getTarget(),event);
        }catch (Exception e){
            //如果没有指定目标就不触发
            return;
        }

    }

}
