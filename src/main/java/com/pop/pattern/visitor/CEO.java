package com.pop.pattern.visitor;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-09 22:22
 *
 * CEO 更关注kpi，所以相关实现都是和kpi有关
 **/
public class CEO implements IVisitor {

    @Override
    public void visitor(Coder coder) {
        System.out.println(coder.name+ " "+ coder.kpi);
    }

    @Override
    public void visitor(Manager manager) {
        System.out.println(manager.name+ " "+ manager.kpi);
    }
}
