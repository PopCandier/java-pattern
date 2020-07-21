package com.pop.pattern.adapter.loginAdapterV2.adapter;

import com.pop.pattern.adapter.loginAdapterV2.AbstractAdapter;
import com.pop.pattern.adapter.loginAdapterV2.Response;


/**
 * @author Pop
 * @date 2020/7/22 0:37
 */
public class Login4WeChat extends AbstractAdapter {

    @Override
    public boolean support(Object object) {
        return object instanceof Login4WeChat;
    }

    @Override
    public Response login(String id, Object object) {
        //这个object穿进来的，其实就是符合support的Login4Wechat的具体实现
        //这里有独有的逻辑
        super.register(null);
        return login4Register(null,null);
    }


}
