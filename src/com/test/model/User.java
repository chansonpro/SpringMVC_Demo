package com.test.model;

/**
 * Created by: zhangsong09@baidu.com
 * Date-Time: 2017/8/10 17:07
 */
public class User {

    private String username;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
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

