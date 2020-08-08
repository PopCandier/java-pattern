package com.pop.pattern.observer.mouse.events;

import com.pop.pattern.observer.mouse.core.Event;

/**
 * @author Pop
 * @date 2020/8/8 23:54
 */
public interface EventListener {

    String ON_CLICK = "click";
    String ON_MOVE = "move";

    /**
     * 点击事件
     * @param event
     */
    void onClick(Event event);

    /**
     * 移动事件
     * @param event
     */
    void onMove(Event event);
}
