package com.pop.pattern.facade;

/**
 * @author Pop
 * @date 2020/7/16 23:03
 */
public class QualifyService {

    /**
     * 支付前审核
     * @param shop
     * @return
     */
    public boolean check(Shop shop){
        System.out.println("开始校验");
        return true;
    }
}
