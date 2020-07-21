package com.pop.pattern.adapter.loginAdapterV1;

/**
 * @author Pop
 * @date 2020/7/22 0:12
 *
 * 统一的登录方法借口
 */
public interface IPassportService {

    Response login(Passport passport);

    Response register(Passport passport);

}
