package com.pop.pattern.strategy;

/**
 * @author Pop
 * @date 2020/7/26 17:14
 *
 * 促销手段A
 */
public class StrategyA implements IStrategy{
    @Override
    public void promotion() {
        System.out.println("促销手段A");
    }
}
