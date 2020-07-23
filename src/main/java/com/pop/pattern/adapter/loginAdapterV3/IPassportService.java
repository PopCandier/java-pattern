package com.pop.pattern.adapter.loginAdapterV3;

import com.pop.pattern.adapter.loginAdapterV1.Response;

/**
 * @author Pop
 * @date 2020/7/23 23:55
 */
public interface IPassportService {

    Response login(String username,String password);

    Response register(String username,String password);

}
