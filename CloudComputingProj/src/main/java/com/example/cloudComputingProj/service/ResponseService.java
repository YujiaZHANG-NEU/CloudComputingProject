package com.example.cloudComputingProj.service;

import com.example.cloudComputingProj.entity.Response;
import java.util.List;

/**
 * (Response)表服务接口
 *
 * @author makejava
 * @since 2022-04-23 23:57:57
 */
public interface ResponseService {

    /**
     * 通过ID查询单条数据
     *
     * @param responseid 主键
     * @return 实例对象
     */
    Response queryById(String responseid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Response> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param response 实例对象
     * @return 实例对象
     */
    Response insert(Response response);

    /**
     * 修改数据
     *
     * @param response 实例对象
     * @return 实例对象
     */
    Response update(Response response);

    /**
     * 通过主键删除数据
     *
     * @param responseid 主键
     * @return 是否成功
     */
    boolean deleteById(String responseid);

}