package com.pop.pattern.chain0;

/**
 * @program: java-pattern
 * @description: 某个请求
 * @author: Pop
 * @create: 2020-07-27 22:08
 **/
public class Request {

    private String type;
    public Request(String type){
        this.type = type;
    }

    public String getType(){return this.type;}
}
