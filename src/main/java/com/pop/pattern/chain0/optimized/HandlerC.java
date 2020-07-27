package com.pop.pattern.chain0.optimized;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description: 处理C的请求
 * @author: Pop
 * @create: 2020-07-27 22:11
 **/
public class HandlerC extends Handler {

    @Override
    public void doHandler(Request request) {
        if("C".equals(request.getType())){
            System.out.println("C请求已经被处理");
            return;
        }
        //否则交给下一个
        System.out.println("请求无法被处理");
    }
}
