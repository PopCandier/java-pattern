package com.pop.pattern.visitor;

import java.util.Random;

/**
 * @author Pop
 * @date 2020/8/9 17:51
 *
 * 被访问的对象
 */
public abstract class IEmployee {

    public String name;
    public int kpi;

    public IEmployee(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract  void accept(IVisitor visitor);

}
