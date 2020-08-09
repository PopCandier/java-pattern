package com.pop.pattern.visitor;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-09 22:42
 *
 * 这个访问者更加关注其他方面的东西
 *
 * 例如编码者的代码量，和管理者所产出的产品
 **/
public class CTO implements IVisitor {
    @Override
    public void visitor(Coder coder) {
        System.out.println(coder.getCodeLine());
    }

    @Override
    public void visitor(Manager manager) {
        System.out.println(manager.getProduct());
    }
}
