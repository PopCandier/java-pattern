package com.pop.pattern.adapter.loginAdapterV2.adapter;

import com.pop.pattern.adapter.loginAdapterV2.AbstractAdapter;
import com.pop.pattern.adapter.loginAdapterV2.Response;

/**
 * @author Pop
 * @date 2020/7/22 0:37
 */
public class LoginQQAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginQQAdapter;
    }

    @Override
    public Response login(String id, Object object) {
        return null;
    }
}
