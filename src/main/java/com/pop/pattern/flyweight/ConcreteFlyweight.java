package com.pop.pattern.flyweight;

/**
 * @author Pop
 * @date 2020/7/18 22:44
 *
 * 享元三套件之二，一个具体的实现，这个实现是要在系统中经常使用的一个对象
 */
public class ConcreteFlyweight implements IFlyweight {

    private String inState;

    public ConcreteFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println(this.inState);
        System.out.println(state);
    }
}
