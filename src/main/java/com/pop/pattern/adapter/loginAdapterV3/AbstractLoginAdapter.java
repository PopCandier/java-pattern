package com.pop.pattern.adapter.loginAdapterV3;

import com.pop.pattern.adapter.loginAdapterV1.Response;

/**
 * @author Pop
 * @date 2020/7/24 0:01
 *
 * 登录组件适配器
 * 将第三方组件适配老登录系统
 */
public class AbstractLoginAdapter extends PassportService{

    private IPassword4Third password4Third;

    public AbstractLoginAdapter(IPassword4Third password4Third) {
        this.password4Third = password4Third;
    }

    public Response login(String openid){

        String result = password4Third.login(openid);//第三方的授权完成，得到解析码

        //如果是第一次登陆，那么就需要注册，那么第三方的登录是没有密码的，我们可以设置默认值
        String username = parseUsername(result);
        String password = "EMPTY_PASS";
        super.register(username,password);//以后密码是这种，就是第三方登陆的账号，当然如果有用户注册时候，使用了这个账号，要记得提醒不合法
        return super.login(username,password);//调用原来的系统登录方法登录
    }

    /**
     * 假设通过返回的信息，可以得到password，和username等信息
     * @param result
     * @return
     */
    private String parseUsername(String result){
        return "";
    }

}
