package com.example.cloudComputingProj.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Post)实体类
 *
 * @author makejava
 * @since 2022-04-23 23:57:48
 */
public class Post implements Serializable {
    private static final long serialVersionUID = 385019515586971878L;
    /**
    * 帖子id
    */
    private String postid;
    /**
    * 帖子的标题最大长度为100
    */
    private String posttitle;
    /**
    * 帖子内容，帖子最长为255
    */
    private String post;
    /**
    * 发帖子的时间，根据当前时间更新
    */
    private Date posttime;
    /**
    * 用户id，发帖人
    */
    private String userid;


    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

}