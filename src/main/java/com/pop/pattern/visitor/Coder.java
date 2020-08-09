package com.pop.pattern.visitor;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-09 22:21
 **/
public class Coder extends IEmployee {
    public Coder(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        //将自己传进去
        visitor.visitor(this);
    }

    /**
     *
     * 某个考核指标 写了多少代码
     * @return
     */
    public int getCodeLine(){
        return 10_000;
    }
}
