package com.pop.pattern.decorator;

/**
 * @author Pop
 * @date 2020/7/17 0:00
 *
 * 鸡蛋的实现
 */
public class EggDecorator extends BatterCakeDecorator {

    /**
     * 必须存在带有抽象组件的参数的构造方法，用于包装
     * @param batterCake
     */
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    String getMsg() {
        return super.getMsg()+" 加一个鸡蛋";
    }

    @Override
    int getPrice() {
        return super.getPrice()+1;
    }
}
