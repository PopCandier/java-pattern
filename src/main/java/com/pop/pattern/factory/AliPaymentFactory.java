package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:47
 *
 * 假设支付宝的实现逻辑
 */
public class AliPaymentFactory extends AbstractPaymentFactory{

    //这里就是工程的具体实现了

    @Override
    public Check check() {
        super.init();
        return new AliCheck();
    }

    @Override
    public Payment create() {
        return new AliPayment();
    }
}
