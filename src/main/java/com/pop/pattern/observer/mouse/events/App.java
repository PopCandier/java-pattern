package com.pop.pattern.observer.mouse.events;

import com.pop.pattern.observer.mouse.core.Event;

/**
 * @author Pop
 * @date 2020/8/9 0:13
 */
public class App {

    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();
        mouse.addListener(EventListener.ON_CLICK,new Event(callback));

        mouse.click();
    }

}
