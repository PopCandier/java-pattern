package com.pop.pattern.adapter.loginAdapterV2;

import com.pop.pattern.adapter.loginAdapterV2.adapter.ILoginAdapter;
import com.pop.pattern.adapter.loginAdapterV2.adapter.Login4WeChat;
import com.pop.pattern.adapter.loginAdapterV2.adapter.LoginQQAdapter;

/**
 * @author Pop
 * @date 2020/7/22 0:31
 *
 * 这个类现在只起到调度的作用，用来根据具体实现来委派具体的适配器去做登陆的逻辑
 */
public class DispatchLoginAdapter extends PassportService implements IPassport4Third {
    @Override
    public Response login4QQ(String openid) {
        return processLogin(openid, LoginQQAdapter.class);
    }

    @Override
    public Response login4Wechat(String openid) {
        return processLogin(openid, Login4WeChat.class);
    }

    private Response processLogin(String id, Class<? extends ILoginAdapter> clazz){
        try{
            ILoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)) {
                return adapter.login(id,adapter);
            }
        }catch (Exception e){

        }
        return new Response();
    }
}
