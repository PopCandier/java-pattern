package com.pop.pattern.facade;

import com.sun.prism.impl.BaseMesh;

/**
 * @author Pop
 * @date 2020/7/16 23:07
 */
public class App {

    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();

        Shop shop = new Shop("《Pop 与 Pipi 美》");

        //对于调用者来说，只需要这一步
        facadeService.exchange(shop);


    }

}
