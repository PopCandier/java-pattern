package com.pop.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pop
 * @date 2020/7/26 17:16
 *
 * 策略模版必备一个类
 * 是用于通过key，或某个标识来决定使用哪个策略进行调用的工厂
 * 用来屏蔽if else 或者 switch的关键
 *
 * 这其实也算是桥接的一种体现
 *
 * 也是上下文的一種
 */
public class PromotionStrategyFactory {

    public static final String A = "A";
    public static final String B = "B";
    //默认策略
    public static final String DEFAULT = A;

    public static Map<String,IStrategy> strategies = new HashMap<>();

    static {
        //也可以在数据库做
        strategies.put(A,new StrategyA());
        strategies.put(B,new StrategyB());
    }

    public static IStrategy getStrategy(String strategyKey){
        if(!strategies.containsKey(strategyKey)){
            return strategies.get(DEFAULT);
        }
        return strategies.get(strategyKey);
    }

}
