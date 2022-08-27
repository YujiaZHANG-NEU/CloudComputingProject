package com.example.cloudComputingProj.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Response)实体类
 *
 * @author makejava
 * @since 2022-04-23 23:57:57
 */
public class Response implements Serializable {
    private static final long serialVersionUID = -57721007095317146L;
    /**
    * 回复id
    */
    private String responseid;
    /**
    * 用户id
    */
    private String userid;
    /**
    * 回复内容
    */
    private String response;
    /**
    * 回复时间，根据当前时间更新
    */
    private Date responsetime;
    /**
    * 回复的用户id
    */
    private String responseuserid;


    public String getResponseid() {
        return responseid;
    }

    public void setResponseid(String responseid) {
        this.responseid = responseid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    public String getResponseuserid() {
        return responseuserid;
    }

    public void setResponseuserid(String responseuserid) {
        this.responseuserid = responseuserid;
    }

}