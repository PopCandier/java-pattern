package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:51
 */
public class FactoryApp {

    public static void main(String[] args) {

        AbstractPaymentFactory ali = new AliPaymentFactory();

        ali.check().check("002");
        ali.create().pay("pop","123");
        //支付的支付前验证，和正在输入

    }

}
