package com.pop.pattern.adapter.loginAdapterV3;

import com.pop.pattern.adapter.loginAdapterV1.Response;

/**
 * @author Pop
 * @date 2020/7/23 23:56]
 *
 * 第三方组件接口
 */
public interface IPassword4Third {

    /**
     * 第三方的登陆组件要求，基于唯一的id标志
     * 然后返回一串能够解密成功的标识，用于系统的注册
     * @param openid
     */
    String login(String openid);

}
