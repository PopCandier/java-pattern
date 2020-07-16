package com.pop.pattern.decorator;

/**
 * @author Pop
 * @date 2020/7/17 0:00
 *
 * 裝飾器模式三件套之三
 *
 * 装饰器的实现，他需要继承之前抽象组件
 */
public class BatterCakeDecorator extends BatterCake {

    /**
     * 同时持有抽象组件的成员
     */
    private BatterCake batterCake;

    /**
     * 必须存在带有抽象组件的参数的构造方法，用于包装
     * @param batterCake
     */
    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    int getPrice() {
        return batterCake.getPrice();
    }
}
