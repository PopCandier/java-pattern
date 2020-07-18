package com.pop.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pop
 * @date 2020/7/18 22:46
 *
 * 享元模式的最后一个组件，用于管理复数个某个对象的工厂
 * 也不一定就是工厂，就是个管理者
 */
public class FlyweightFactory {

    private static Map<String,IFlyweight> pool = new HashMap<String,IFlyweight>();

    /**
     * 获取缓存的管理对象，也可以是创建对象的地方
     * @param inState
     * @return
     */
    public static IFlyweight getFlyweight(String inState){
        if(!pool.containsKey(inState)){
            IFlyweight flyweight = new ConcreteFlyweight(inState);
            pool.put(inState,flyweight);
        }
        return pool.get(inState);
    }

}
