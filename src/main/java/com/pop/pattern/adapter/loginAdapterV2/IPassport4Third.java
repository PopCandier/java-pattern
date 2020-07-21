package com.pop.pattern.adapter.loginAdapterV2;

import com.pop.pattern.adapter.loginAdapterV2.Response;

/**
 * @author Pop
 * @date 2020/7/22 0:19
 *
 * 新的需求登陆方式
 */
public interface IPassport4Third {

    /**
     * qq的登录方式
     * @param openid
     * @return
     */
    Response login4QQ(String openid);

    /**
     * 微信的登录方式
     * @param openid
     * @return
     */
    Response login4Wechat(String openid);

}
