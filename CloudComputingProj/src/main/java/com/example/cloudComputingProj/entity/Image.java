package com.example.cloudComputingProj.entity;

import java.io.Serializable;

/**
 * (Image)实体类
 *
 * @author makejava
 * @since 2022-04-26 21:45:18
 */
public class Image implements Serializable {
    private static final long serialVersionUID = 333243038858053703L;
    /**
     * 图片id
     */
    private String imageid;
    /**
     * 评论id
     */
    private String commentid;
    /**
     * 帖子id
     */
    private String postid;
    /**
     * 回复id
     */
    private String responseid;


    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getResponseid() {
        return responseid;
    }

    public void setResponseid(String responseid) {
        this.responseid = responseid;
    }

}

