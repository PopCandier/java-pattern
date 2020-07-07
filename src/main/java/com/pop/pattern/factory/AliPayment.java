package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:47
 *
 * 支付宝支付实现逻辑
 */
public class AliPayment implements Payment {
    @Override
    public boolean pay(String account, String password) {
        return false;
    }
}
