package com.example.cloudComputingProj.controller;

import com.example.cloudComputingProj.entity.Comment;
import com.example.cloudComputingProj.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2022-04-23 23:57:19
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Comment selectOne(String id) {

        return this.commentService.queryById(id);
    }

    /**
     * 插入评论
     * @return 单条数据
     */
    @PostMapping("insertComment")
    public ResponseEntity<Comment> insert(@RequestBody Comment comment) {
        return ResponseEntity.ok(this.commentService.insert(comment));
    }



}