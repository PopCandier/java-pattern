package com.pop.pattern.adapter.loginAdapterV2;

/**
 * @author Pop
 * @date 2020/7/22 0:14
 *
 * 统一通行证
 */
public class Passport {
    private String username;
    private String password;

    public Passport(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
