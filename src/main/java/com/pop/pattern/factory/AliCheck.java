package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:48
 *
 * 支付宝的支付检查
 */
public class AliCheck implements Check {
    @Override
    public boolean check(String code) {
        return false;
    }
}
