package com.pop.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-pattern
 * @description: 某个报表，表示某个平台，不同的访问者会得到不同的数据
 * @author: Pop
 * @create: 2020-08-09 22:44
 **/
public class Excel {

    private List<IEmployee> employees = new ArrayList<>();

    {
        employees.add(new Manager("小明"));
        employees.add(new Manager("小明1"));
        employees.add(new Coder("小明2"));
        employees.add(new Coder("小明3"));
        employees.add(new Manager("小明4"));
    }

    public void showData(IVisitor visitor){
        for (IEmployee  e: employees) {
            e.accept(visitor);
        }
    }

}
