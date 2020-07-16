package com.pop.pattern.facade;

/**
 * @author Pop
 * @date 2020/7/16 23:03
 */
public class PaymentService {

    /**
     * 支付接口
     * @param shop
     * @return
     */
    public boolean pay(Shop shop){

        System.out.println("支付成功...");
        return true;

    }

}
