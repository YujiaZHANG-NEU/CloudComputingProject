package com.example.cloudComputingProj.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-04-22 23:00:01
 */
public class User implements Serializable {
    private static final long serialVersionUID = 730322981728123572L;
    /**
    * 用户账号，可以是手机号，微信
    */
    private String userid;
    /**
    * 密码用户自己输入
    */
    private String password;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}