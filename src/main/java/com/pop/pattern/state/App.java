package com.pop.pattern.state;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-07-30 00:04
 **/
public class App {

    public static void main(String[] args) {

        AppContext appContext = new AppContext();
        appContext.favorite();//状态会在内部自动切换，用户只需要交互上下文即可。又或者只需要调用一个方法
        //剩下的程序会自己调度
        appContext.comment("评论");

    }
}
