package com.pop.pattern.interperter;

import java.util.Stack;

/**
 * @program: java-pattern
 * @description: 计算器
 * @author: Pop
 * @create: 2020-08-03 22:39
 **/
public class Calculator {
    public Calculator(String expression) {
        parse(expression);
    }
    //存储运算结果，压栈操作
    private Stack<IArithmeticInterpreter> stack = new Stack<>();
    /**
     * 假设所有表达式的都是用空格间隔开
     * @param expression
     */
    private void parse(String expression) {
        String[] ex = expression.split(" ");
        for(int i=0,len = ex.length;i<len;i++){
            String o = ex[i];
            if(isOperation(ex[i])){
                // 取出前一个内容
                IArithmeticInterpreter left=this.stack.pop();
                //取出后一个
                IArithmeticInterpreter right = new NumInterpreter(Integer.valueOf(ex[++i]));
                //开始计算，获得相应的非终结标识
                this.stack.push(operation(left,right,o));
            }else{
                //压栈存储
                this.stack.push(new NumInterpreter(Integer.valueOf(ex[i])));
            }
        }
    }

    /**
     * 判断是否是一个非终结表达式
     * @param operation
     * @return
     */
    private boolean isOperation(String operation){
        if("+".equals(operation)){
            return true;//这里只做一个简单的处理
        }else
        {
            return false;
        }
    }

    /**
     * 根据 运算符 获得相应的算法，或者是非终结运算符
     * @param operation
     * @return
     */
    private Interpreter operation(IArithmeticInterpreter left,IArithmeticInterpreter right,String operation){
        if("+".equals(operation)){
            return new AddInterpreter(left, right);
        }//更多算法拓展
        return null;
    }

    public int calculate(){
        return this.stack.pop().interpret();
    }
}
