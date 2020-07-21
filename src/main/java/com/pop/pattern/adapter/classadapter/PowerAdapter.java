package com.pop.pattern.adapter.classadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:54
 *
 * 一个用来适配老系统和新需求的对象，他会继承老系统的某个需要适配类，和实现新需求的接口
 */
public class PowerAdapter extends AC220 implements DC{

    @Override
    public int output5() {
        return super.output220()/44;
    }
}
