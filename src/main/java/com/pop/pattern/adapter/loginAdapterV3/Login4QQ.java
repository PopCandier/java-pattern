package com.pop.pattern.adapter.loginAdapterV3;

import com.pop.pattern.adapter.loginAdapterV1.Response;

/**
 * @author Pop
 * @date 2020/7/23 23:58
 */
public class Login4QQ implements IPassword4Third {

    @Override
    public String login(String openid) {
        //qq复杂的登录逻辑，交互完成后，假设返回一串密文。用于解析成系统可以理解的账户
        return "";
    }
}
