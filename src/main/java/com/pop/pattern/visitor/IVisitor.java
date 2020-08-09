package com.pop.pattern.visitor;

/**
 * @author Pop
 * @date 2020/8/9 17:51
 *
 * 访问者
 *
 * 访问者需要定义具体的实现
 */
public interface IVisitor {

   void visitor(Coder coder);

   void visitor(Manager manager);

}
