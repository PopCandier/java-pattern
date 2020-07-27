package com.pop.pattern.chain0.abstract0;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description: 处理C的请求
 * @author: Pop
 * @create: 2020-07-27 22:11
 **/
public class HandlerC extends Handler {
    @Override
    public void doHanlder(Request request) {
        if("C".equals(request.getType())){
            System.out.println("C 请求已经被处理");
            return;
        }
        //否则交给下一个 这里我们规定，C已经是最后一个请求了，所以这里不就接着往下调用了，不然会空指针
//        this.handler.doHanlder(request);
        System.out.println("该请求无法被处理");
    }
}
