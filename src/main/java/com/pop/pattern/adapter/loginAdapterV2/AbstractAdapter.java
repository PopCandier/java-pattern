package com.pop.pattern.adapter.loginAdapterV2;

import com.pop.pattern.adapter.loginAdapterV2.adapter.ILoginAdapter;

/**
 * @author Pop
 * @date 2020/7/22 0:41
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {

    protected Response login4Register(String username,String password){

        if(password==null){
            password = "THIRD_EMPTY";
        }
        Passport passport = new Passport(username, password);
        super.register(passport);
        return super.login(passport);
    }


}
