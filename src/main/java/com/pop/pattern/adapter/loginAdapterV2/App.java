package com.pop.pattern.adapter.loginAdapterV2;

/**
 * @author Pop
 * @date 2020/7/22 0:23
 */
public class App {

    public static void main(String[] args) {

        IPassport4Third passport4Third = new DispatchLoginAdapter();

        passport4Third.login4QQ("dfasdfasdfasdfa");

        //但是还是增加方法还是要修改，又没不修改源码就能修改的方式呢

    }

}
