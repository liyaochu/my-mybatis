package com.lyc.mybatis.mapping;

/**
 * @program: my-mybatis
 * @description:  这个映射jdbc环境
 * @author: Jhon_Li
 * @create: 2019-06-20 11:17
 **/
public class MyEnvironment {

    private String driver;
    private String url;
    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
