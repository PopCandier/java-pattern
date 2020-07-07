package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:40
 *
 * 支付接口
 */
public interface Payment {

    /**
     * 用户名，密码进行支付，最后告知是否支付成功
     * @param account
     * @param password
     * @return
     */
    boolean pay(String account,String password);

}
