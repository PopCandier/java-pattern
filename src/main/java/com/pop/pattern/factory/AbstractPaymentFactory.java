package com.pop.pattern.factory;

/**
 * @author Pop
 * @date 2020/7/8 0:43
 */
public  abstract class AbstractPaymentFactory implements PaymentFactory{

    //这个抽象工厂中已经存在了create的方法，这个交给子类去具体实现

    //在聚合检查是否合法逻辑交给子类实现

    public  void init(){
        System.out.println("初始化一些基础数据");
    }

    public abstract Check check();

}
