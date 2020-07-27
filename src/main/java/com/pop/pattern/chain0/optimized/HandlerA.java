package com.pop.pattern.chain0.optimized;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description: 处理A的请求
 * @author: Pop
 * @create: 2020-07-27 22:10
 **/
public class HandlerA extends Handler {



    @Override
    public void doHandler(Request request) {
        if("A".equals(request.getType())){
            System.out.println("A 请求已经被处理");
            return;
        }
        //否则交给下一个
        this.next.doHandler(request);
    }
}
