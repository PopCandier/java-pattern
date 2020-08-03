package com.pop.pattern.interperter;

/**
 * @program: java-pattern
 * @description: 非终结表达式，用于加法的运算
 * @author: Pop
 * @create: 2020-08-03 22:37
 **/
public class AddInterpreter extends Interpreter {

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret()+right.interpret();
    }
}
