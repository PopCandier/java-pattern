package com.pop.pattern.adapter.loginAdapterV2.adapter;

import com.pop.pattern.adapter.loginAdapterV2.Response;

/**
 * @author Pop
 * @date 2020/7/22 0:28
 *
 * 为了更好的拓展适配器的实现，保证单一指责原则和开闭原则
 */
public interface ILoginAdapter {
    /**
     * 传入一个对象，看是否符合调用这个适配器的规则
     * @param object
     * @return
     */
    boolean support(Object object);

    /**
     * 走这个适配器的登陆逻辑
     * @param id
     * @param object
     * @return
     */
    Response login(String id,Object object);

}
