package com.pop.pattern.chain0.optimized;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-07-27 22:44
 **/
public class App {

    public static void main(String[] args) {

        Handler.Builder builder  = new Handler.Builder();

        builder.addHandler(new HandlerA())
                .addHandler(new HandlerB())
                .addHandler(new HandlerC());

        Handler handler = builder.build();

        handler.doHandler(new Request("C"));

    }
}
