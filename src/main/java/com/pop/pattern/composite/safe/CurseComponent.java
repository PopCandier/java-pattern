package com.pop.pattern.composite.safe;

/**
 * @author Pop
 * @date 2020/7/21 0:42
 * 安全写法
 *
 * 只写共同的方法，行为，不违反迪米特法则，最少知道
 *
 * 课件的 组合抽象组件
 */
public abstract class CurseComponent {


    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
