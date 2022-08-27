package com.example.cloudComputingProj.service.impl;

import com.example.cloudComputingProj.entity.Image;
import com.example.cloudComputingProj.dao.ImageDao;
import com.example.cloudComputingProj.service.ImageService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Image)表服务实现类
 *
 * @author makejava
 * @since 2022-04-26 21:45:19
 */
@Service("imageService")
public class ImageServiceImpl implements ImageService {
    @Resource
    private ImageDao imageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param imageid 主键
     * @return 实例对象
     */
    @Override
    public Image queryById(String imageid) {
        return this.imageDao.queryById(imageid);
    }

    /**
     * 分页查询
     *
     * @param image 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Image> queryByPage(Image image, PageRequest pageRequest) {
        long total = this.imageDao.count(image);
        return new PageImpl<>(this.imageDao.queryAllByLimit(image, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    @Override
    public Image insert(Image image) {
        this.imageDao.insert(image);
        return image;
    }

    /**
     * 修改数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    @Override
    public Image update(Image image) {
        this.imageDao.update(image);
        return this.queryById(image.getImageid());
    }

    /**
     * 通过主键删除数据
     *
     * @param imageid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String imageid) {
        return this.imageDao.deleteById(imageid) > 0;
    }

    @Override
    public List<Image> queryByCommentId(String imageid){
        return this.imageDao.queryByCommentId(imageid);
    }
}
