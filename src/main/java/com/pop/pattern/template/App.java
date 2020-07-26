package com.pop.pattern.template;

/**
 * @author Pop
 * @date 2020/7/26 16:08
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=====巧克力蛋糕=======");
        ChocolatesCake chocolatesCake = new ChocolatesCake();
        chocolatesCake.doCake();

        System.out.println("=====草莓蛋糕=======");
        StrawberryCake strawberryCake = new StrawberryCake();
        strawberryCake.setNeedInvoice(false);//不希望发送发票
        strawberryCake.doCake();
    }
}
