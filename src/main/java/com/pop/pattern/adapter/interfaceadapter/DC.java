package com.pop.pattern.adapter.interfaceadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:53
 *
 * 接口适配器主要是为了避免写过多的适配器类来去实现不同的需求
 * 例如，如果为了适配5v的电压去写一个，12v的又去写一个，这样就会显得比较臃肿
 * 所以我们其实可以把所有AC转DC的方法全部写在这里，交给一个适配器来实现
 */
public interface DC {

    int output5();

    int output12();

    int output36();
}
