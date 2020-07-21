package com.pop.pattern.adapter.interfaceadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:55
 */
public class App {

    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        System.out.println(powerAdapter.output5());
        System.out.println(powerAdapter.output12());
        System.out.println(powerAdapter.output36());
        /**
         * 也就是说在接口这一层已经订好行为
         */
    }
}
