package com.pop.pattern.adapter.loginAdapterV3;

/**
 * @author Pop
 * @date 2020/7/24 0:09
 *
 *
 * 装饰器和适配器模式的组合使用，动态扩展
 */
public class App {

    public static void main(String[] args) {

        AbstractLoginAdapter adapterQQ = new AbstractLoginAdapter(new Login4QQ());
        AbstractLoginAdapter adapterWC = new AbstractLoginAdapter(new Login4Wechat());

        adapterQQ.login("sfasdfasdfasd");//用qq的方式登录
        adapterWC.login("sdfsdfasdfsda");
        //且可以动态添加

    }

}
