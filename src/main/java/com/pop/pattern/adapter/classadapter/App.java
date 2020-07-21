package com.pop.pattern.adapter.classadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:55
 */
public class App {

    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        System.out.println(powerAdapter.output5());
        //这样就实现了接口的适配，但是我们一般都希望面向接口变成，这样直接用适配器也许并不是我们希望的
        //但是这个适配器不仅可以点出5v的还可以点出220v的。有点不符合最少知道原则，因为继承下来了。
    }
}
