package com.example.cloudComputingProj.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Comment)实体类
 *
 * @author makejava
 * @since 2022-04-23 23:57:19
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 131128878857633639L;
    /**
    * 评论id
    */
    private String comentid;
    /**
    * 帖子id
    */
    private String postid;
    /**
    * 用户id
    */
    private String userid;
    /**
    * 评论内容,255为最长评论长度
    */
    private String comment;
    /**
    * 评论时间，设置为根据当前时间更新
    */
    private Date commenttime;


    public String getComentid() {
        return comentid;
    }

    public void setComentid(String comentid) {
        this.comentid = comentid;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

}