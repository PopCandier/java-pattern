package com.pop.pattern.decorator;

/**
 * @author Pop
 * @date 2020/7/17 0:00
 *
 * 火腿的实现
 */
public class SauageDecorator extends BatterCakeDecorator {

    /**
     * 必须存在带有抽象组件的参数的构造方法，用于包装
     * @param batterCake
     */
    public SauageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    String getMsg() {
        return super.getMsg()+" 加一个香肠";
    }

    @Override
    int getPrice() {
        return super.getPrice()+2;
    }
}
