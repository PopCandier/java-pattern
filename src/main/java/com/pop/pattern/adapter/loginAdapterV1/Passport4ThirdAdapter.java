package com.pop.pattern.adapter.loginAdapterV1;

/**
 * @author Pop
 * @date 2020/7/22 0:17
 *
 * 对原有系统提供更多的第三方登陆
 */
public class Passport4ThirdAdapter extends PassportService implements IPassport4Third{


    @Override
    public Response login4QQ(String openid) {

        //通过openid拉取个人信息，进行系统注册，然后登陆

        super.register(null);


        return super.login(null);
    }

    @Override
    public Response login4Wechat(String openid) {

        //通过openid拉取个人信息，进行系统注册，然后登陆

        super.register(null);
        return super.login(null);
    }
}
