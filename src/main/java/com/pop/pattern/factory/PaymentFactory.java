package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:41
 *
 * 支付工厂
 */
public interface PaymentFactory {

    /**
     * 支付类型将会创建不同的支付实例
     *
     * @return
     */
    Payment create();

}
