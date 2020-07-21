package com.pop.pattern.adapter.loginAdapterV1;

/**
 * @author Pop
 * @date 2020/7/22 0:23
 */
public class App {

    public static void main(String[] args) {

        Passport4ThirdAdapter passport4ThirdAdapter = new Passport4ThirdAdapter();

        passport4ThirdAdapter.login(new Passport("pop","123"));
        passport4ThirdAdapter.login4QQ("dfasdfasdfad");
    /**
     * 但是实际上，一个qq的登录逻辑其实是比较复杂的，所以在一个类里面完成这全部的操作是会很复杂的，而且
     * 我们如果新增了手机号登陆或者邮箱登录的话，又要去改接口，和修改实现
     */
    }

}
