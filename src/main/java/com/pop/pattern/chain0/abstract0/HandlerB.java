package com.pop.pattern.chain0.abstract0;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description: 处理B类型的请求
 * @author: Pop
 * @create: 2020-07-27 22:10
 **/
public class HandlerB extends Handler {

    @Override
    public void doHanlder(Request request) {
        if("B".equals(request.getType())){
            System.out.println("B 请求已经被处理");
            return;
        }
        //否则交给下一个
        this.handler.doHanlder(request);
    }
}
