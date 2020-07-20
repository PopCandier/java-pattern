package com.pop.pattern.composite.transparent;

/**
 * @author Pop
 * @date 2020/7/21 0:42
 * 透明写法
 * 课件的 组合抽象组件
 * 可能含有不共同的行为，违反迪米特法则
 */
public abstract class CurseComponent {

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名字操作");
    }

    public double getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void addChild(CurseComponent curseComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CurseComponent curseComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
