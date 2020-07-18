package com.pop.pattern.decorator.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pop
 * @date 2020/7/18 21:16
 *
 * 用户的权限
 *
 */
public class Role {

    private List<String> roles = null;

    public Role() {
        roles = new ArrayList<>();
    }

    public List<String> getRoles(){return this.roles;}

    public void setRoles(String ...roles){
        this.roles.addAll(Arrays.asList(roles));
    }

}
