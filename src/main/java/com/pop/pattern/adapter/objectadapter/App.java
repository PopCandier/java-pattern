package com.pop.pattern.adapter.objectadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:55
 */
public class App {

    public static void main(String[] args) {
        DC powerAdapter = new PowerAdapter(new AC220());
        System.out.println(powerAdapter.output5());
       //这样的话，就只知道output5的方法了，而且看上去就是AC220拿进去适配的，看起来也比较直观
    }
}
