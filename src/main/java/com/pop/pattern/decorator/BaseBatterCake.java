package com.pop.pattern.decorator;

/**
 * @author Pop
 * @date 2020/7/16 23:59
 *
 * 装饰器模式三件套之二
 *
 * 一个默认的实现
 */
public class BaseBatterCake extends BatterCake {
    @Override
    String getMsg() {
        return "基础面皮";
    }

    @Override
    int getPrice() {
        return 2;//一张面皮两块
    }
}
