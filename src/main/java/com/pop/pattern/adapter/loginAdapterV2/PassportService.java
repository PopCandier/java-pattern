package com.pop.pattern.adapter.loginAdapterV2;

/**
 * @author Pop
 * @date 2020/7/22 0:15
 *
 * 假设，这是一个我们已经实现好的使用用户名密码登录的登录服务，已经使用的很好
 */
public class PassportService implements IPassportService {


    @Override
    public Response login(Passport passport) {

        String username = passport.getUsername();
        String password = passport.getPassword();

        // 一个系统的登录逻辑，包括检验是否合法之类的最后登录成功

        return new Response();
    }

    @Override
    public Response register(Passport passport) {
        //注册操作
        return new Response();
    }

}
