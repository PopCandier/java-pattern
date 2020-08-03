package com.pop.pattern.interperter;

/**
 * @program: java-pattern
 * @description: 用于解析数字的 解释器实现，
 * 解释套间之2，终结表达式，用于表示这个表达式的结束位置
 * @author: Pop
 * @create: 2020-08-03 22:31
 **/
public class NumInterpreter implements IArithmeticInterpreter{

    private int value;

    public NumInterpreter(int value){
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
