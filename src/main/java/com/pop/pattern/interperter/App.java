package com.pop.pattern.interperter;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-03 22:41
 **/
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("10 + 30");
        System.out.println(calculator.calculate());//正常输出 40 就正确
    }
}
