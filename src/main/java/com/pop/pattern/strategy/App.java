package com.pop.pattern.strategy;

/**
 * @author Pop
 * @date 2020/7/26 17:20
 */
public class App {

    public static void main(String[] args) {

        //调用
        IStrategy strategy = PromotionStrategyFactory.getStrategy(PromotionStrategyFactory.A);

        strategy.promotion();

    }

}
