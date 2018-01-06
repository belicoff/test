package com.zoro.main.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhaoguangfu on 2017/12/30.
 */
@ConfigurationProperties(prefix = "my")
public class UserInfo {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
