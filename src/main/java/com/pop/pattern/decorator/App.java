package com.pop.pattern.decorator;

/**
 * @author Pop
 * @date 2020/7/17 0:06
 */
public class App {

    public static void main(String[] args) {

        BatterCake batterCake;

        batterCake = new BaseBatterCake();

        batterCake = new EggDecorator(batterCake);

        batterCake = new EggDecorator(batterCake);

        batterCake = new SauageDecorator(batterCake);

        System.out.println(batterCake.getMsg()+" "+batterCake.getPrice());
    }
}
