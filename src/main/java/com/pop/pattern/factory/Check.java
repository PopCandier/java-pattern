package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:44
 *
 * 是否支付合法的借口
 */
public interface Check {

    boolean check(String code);
}
