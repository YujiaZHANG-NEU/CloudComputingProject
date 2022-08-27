package com.example.cloudComputingProj.controller;

import com.example.cloudComputingProj.entity.Response;
import com.example.cloudComputingProj.service.ResponseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Response)表控制层
 *
 * @author makejava
 * @since 2022-04-23 23:57:57
 */
@RestController
@RequestMapping("response")
public class ResponseController {
    /**
     * 服务对象
     */
    @Resource
    private ResponseService responseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Response selectOne(String id) {
        return this.responseService.queryById(id);
    }

}