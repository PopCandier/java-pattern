package com.pop.pattern.visitor;

/**
 * @program: java-pattern
 * @description: 被观察者 管理者
 * @author: Pop
 * @create: 2020-08-09 22:39
 **/
public class Manager extends IEmployee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitor(this);
    }

    /**
     * 例如，是每年研发了10个产品之类的成绩
     * @return
     */
    public int getProduct(){
        return 10;
    }
}
