package com.pop.pattern.chain0.optimized;

import com.pop.pattern.chain0.Request;

/**
 * @program: java-pattern
 * @description: 优化版本的责任链
 * @author: Pop
 * @create: 2020-07-27 22:29
 **/
public abstract class Handler<T> {

    protected  Handler pre;
    protected Handler next;

    public void pre(Handler pre){
        this.pre = pre;
    }
    public void next(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Request request);

    /**
     * 使用建造者，在内部就完成链路
     * 设计成双向链表
     */
    public static class Builder<T>{

        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler handler){
            //第一次初始化
//            do{
                if(this.head==null){
                    this.head = this.tail = handler;
                    return this;
                }
                //第二次初始化
                // 添加到链表的后端
                this.tail.next(handler);
                handler.pre(this.tail);
                //接着将尾部引用新添加的对象，这样每次都这样操作，完成链表
                this.tail = handler;
//            }while(false);//由于是双向链表，当头到尾的引用完成后，在尾到头再遍历一次，完成双向
            return  this;
        }

        /**
         * 返回整条调用链的头部
         * @return
         */
        public Handler<T> build(){
            return this.head;
        }

    }

}
