package com.pop.pattern.adapter.interfaceadapter;

/**
 * @author Pop
 * @date 2020/7/21 23:54
 *
 * 这样也避免了更多的适配器存在
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

    @Override
    public int output12() {
        return 0;
    }

    @Override
    public int output36() {
        return 0;
    }
}
