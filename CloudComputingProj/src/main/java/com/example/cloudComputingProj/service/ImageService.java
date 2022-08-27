package com.example.cloudComputingProj.service;

import com.example.cloudComputingProj.entity.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Image)表服务接口
 *
 * @author makejava
 * @since 2022-04-26 21:45:19
 */
public interface ImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param imageid 主键
     * @return 实例对象
     */
    Image queryById(String imageid);

    /**
     * 分页查询
     *
     * @param image 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Image> queryByPage(Image image, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    Image insert(Image image);

    /**
     * 修改数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    Image update(Image image);

    /**
     * 通过主键删除数据
     *
     * @param imageid 主键
     * @return 是否成功
     */
    boolean deleteById(String imageid);

    List<Image> queryByCommentId(String imageid);

}
