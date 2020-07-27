package com.pop.pattern.chain0.abstract0;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-07-27 22:14
 **/
public class App {

    public static void main(String[] args) {

        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();
        //初始化处理逻辑

        //增加到链路中，添加的顺序将会决定执行的顺序

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);
        //从头开始调用
        handlerA.doHanlder(new Request("D"));

        /**
         * 这种会让代码的逻辑变得复杂，不推荐使用这种方法
         * 由于new出了过多的处理，在add过多次的，可能会使用者更加混乱
         */

    }

}
