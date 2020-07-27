package com.pop.pattern.chain0.abstract0;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-07-27 22:04
 *
 * 责任链模式对 请求和处理的解耦
 **/
public abstract class Handler {

    /**
     *  责任链的最高层抽象，用于定义每条链的行为
     */
    protected Handler handler;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    public abstract void doHanlder(Request request);

}
