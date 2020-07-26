package com.pop.pattern.template;

/**
 * @author Pop
 * @date 2020/7/26 16:07
 *
 * 草莓蛋糕
 */
public class StrawberryCake extends AbstractCake{

    private boolean needInvoice = true;

    public void setNeedInvoice(boolean needInvoice) {
        this.needInvoice = needInvoice;
    }

    @Override
    protected void addFruits() {
        System.out.println("添加草莓");
    }

    /**
     * 重写钩子方法
     * @return
     */
    @Override
    protected boolean needInvoice() {
        return needInvoice;
    }
}
