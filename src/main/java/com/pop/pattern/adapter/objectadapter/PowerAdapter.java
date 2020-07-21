package com.pop.pattern.adapter.objectadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:54
 *
 * 一个用来适配老系统和新需求的对象，他会继承老系统的某个需要适配类，和实现新需求的接口
 */
public class PowerAdapter implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5() {
        return this.ac220.output220()/44;
    }
}
