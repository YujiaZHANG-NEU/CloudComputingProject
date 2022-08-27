package com.example.cloudComputingProj.controller;

import com.example.cloudComputingProj.entity.Post;
import com.example.cloudComputingProj.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Post)表控制层
 *
 * @author makejava
 * @since 2022-04-23 23:57:48
 */
@RestController
@RequestMapping("post")
public class PostController {
    /**
     * 服务对象
     */
    @Resource
    private PostService postService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Post selectOne(@PathVariable  String id) {
        return this.postService.queryById(id);
    }


    /**
     * 插入帖子
     * @return 单条数据
     */
    @PostMapping("insertPost")
    public ResponseEntity<Post> Insert(@RequestBody Post post){
        return ResponseEntity.ok(this.postService.insert(post));
    }
}