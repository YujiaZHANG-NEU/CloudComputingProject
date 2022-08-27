package com.example.cloudComputingProj.service.impl;

import com.example.cloudComputingProj.entity.Response;
import com.example.cloudComputingProj.dao.ResponseDao;
import com.example.cloudComputingProj.service.ResponseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Response)表服务实现类
 *
 * @author makejava
 * @since 2022-04-23 23:57:57
 */
@Service("responseService")
public class ResponseServiceImpl implements ResponseService {
    @Resource
    private ResponseDao responseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param responseid 主键
     * @return 实例对象
     */
    @Override
    public Response queryById(String responseid) {
        return this.responseDao.queryById(responseid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Response> queryAllByLimit(int offset, int limit) {
        return this.responseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param response 实例对象
     * @return 实例对象
     */
    @Override
    public Response insert(Response response) {
        this.responseDao.insert(response);
        return response;
    }

    /**
     * 修改数据
     *
     * @param response 实例对象
     * @return 实例对象
     */
    @Override
    public Response update(Response response) {
        this.responseDao.update(response);
        return this.queryById(response.getResponseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param responseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String responseid) {
        return this.responseDao.deleteById(responseid) > 0;
    }
}