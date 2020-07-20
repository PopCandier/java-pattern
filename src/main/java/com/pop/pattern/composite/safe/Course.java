package com.pop.pattern.composite.safe;

/**
 * @author Pop
 * @date 2020/7/21 0:45
 *
 * 子节点 去实现自己需要实现的方法
 */
public class Course extends CurseComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
