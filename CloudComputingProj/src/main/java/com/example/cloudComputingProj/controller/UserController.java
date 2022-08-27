package com.example.cloudComputingProj.controller;

import com.example.cloudComputingProj.entity.User;
import com.example.cloudComputingProj.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-04-22 23:00:04
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public User selectOne(@PathVariable String id) {
        return this.userService.queryById(id);
    }

    /**
     * 登录
     * @User
     * 前端判断是否合法
     */
    @PostMapping("login")
    public ResponseEntity<Boolean> loginUser(@RequestBody User user) {
        User testUser=this.userService.queryById(user.getUserid());
        if(user.getUserid().equals(testUser.getUserid())&&user.getPassword().equals(testUser.getPassword()) ) {
            return ResponseEntity.ok(Boolean.TRUE);
        }
        return ResponseEntity.ok(Boolean.FALSE);
    }

    /**
     * 注册
     * @User
     * 前端判断是否合法
     */
    @PostMapping("register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }
}


