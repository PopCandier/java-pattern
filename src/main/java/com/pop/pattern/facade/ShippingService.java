package com.pop.pattern.facade;

/**
 * @author Pop
 * @date 2020/7/16 23:03
 *
 * 物流服务
 */
public class ShippingService {

    /**、
     * 走物流，并获得订单号
     * @param shop
     * @return
     */
    public String shipping(Shop shop){

        System.out.println("启动物流流程...");
        return "POP001";
    }

}
