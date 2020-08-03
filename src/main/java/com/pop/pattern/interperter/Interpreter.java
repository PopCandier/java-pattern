package com.pop.pattern.interperter;

/**
 * @program: java-pattern
 * @description: 非终结表达式
 * @author: Pop
 * @create: 2020-08-03 22:34
 **/
public abstract class Interpreter implements IArithmeticInterpreter{

    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;
    //运算每次都需要两个终结符，也就是两个数字

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
