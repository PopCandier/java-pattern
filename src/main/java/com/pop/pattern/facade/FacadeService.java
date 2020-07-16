package com.pop.pattern.facade;

/**
 * @author Pop
 * @date 2020/7/16 23:07
 */
public class FacadeService {

    private PaymentService paymentService = new PaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    /**
     * 门面的服务，某一个复杂流程的逻辑，聚合在一个类中，对于调用者来说，只要调用这一个就可以了
     * 属于结构型模式
     */

    public void exchange(Shop shop){

        if(qualifyService.check(shop)){
            if(paymentService.pay(shop)){
                String shippingNo=shippingService.shipping(shop);
                //完成
            }
        }

    }

}
