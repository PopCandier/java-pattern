package com.pop.pattern.interperter;

/**
 * 解释器模式
 * 组件之一
 * 解释抽象组件，非终结表达式和终结表示都需要实现这个接口
 */
public interface IArithmeticInterpreter {

    int interpret();
}
