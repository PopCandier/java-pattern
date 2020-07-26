package com.pop.pattern.template;

/**
 * @author Pop
 * @date 2020/7/26 16:00
 */
public abstract class AbstractCake {

    /**
     * 做蛋糕的方法
     *
     * 不希望改变流程
     */
    public final void doCake(){

        //做蛋糕的流程是固定的
        bakeCake();
        //添加蛋糕
        addFruits();

        sell();

        if(needInvoice()){//钩子方法，将会改变部分的流程和行为
            setInvoice();
        }
    }

    protected  void setInvoice(){
        System.out.println("发送发票");
    }

    /**
     * 是否需要发票
     * @return
     */
    protected  boolean needInvoice(){
        return true;
    }

    protected  void sell(){
        System.out.println("卖蛋糕");
    }

    /**
     * 交给子类要加什么水果
     */
    protected abstract void addFruits();

    protected void bakeCake(){
        System.out.println("烘焙蛋糕");
    }

}
