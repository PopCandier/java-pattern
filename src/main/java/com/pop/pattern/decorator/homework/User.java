package com.pop.pattern.decorator.homework;

/**
 * @author Pop
 * @date 2020/7/18 21:20
 *
 * 用户
 */
public class User {

    private String name;

    private Role role;

    public User(String name, String ...roles) {
        this.name = name;
        this.role = new Role();
        this.role.setRoles(roles);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
