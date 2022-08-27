package com.example.cloudComputingProj.controller;

import com.example.cloudComputingProj.entity.Image;
import com.example.cloudComputingProj.service.ImageService;
import com.example.cloudComputingProj.util.*;

import org.apache.commons.io.FileUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@Async("taskExecutor")
public class UploadController {
    @Resource
    private ImageService imageService;
    /**
     * 文件上传
     * @param picture
     * @param request
     * @return
     */


    @RequestMapping("/upload/commentImage/{id}")
    public void uploadCommentImage(@RequestParam(value = "file") List<MultipartFile> pictures, @PathVariable String id, HttpServletRequest request) throws FileNotFoundException {
        Image image = new Image();
        //数据库存用户id+评论id+视频id
        System.out.println("您已进入图片上传服务");
        //获取文件在服务器的储存位置,此种方式直接存入了真实文件夹
        //String path = "C:\Users\11783\Desktop\LoginAndRegist\target\classes\static\image";
        //文件上传的地址，此种方式直接存入了target
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/image";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());


        File filePath = new File(path);
        System.out.println("文件的保存路径：" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        for(MultipartFile picture:pictures){
            //获取原始文件名称(包含格式)
            String originalFileName = picture.getOriginalFilename();
            System.out.println("原始文件名称：" + originalFileName);

            //获取文件类型，以最后一个`.`为标识
            String type = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
            System.out.println("文件类型：" + type);
            //获取文件名称（不包含格式）
            String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));

            String fileName = UUIDUtils.getUuid() + name + "." + type;
            System.out.println("新文件名称：" + fileName);

            //在指定路径下创建一个文件
            File targetFile = new File(filePath.getAbsoluteFile(), fileName);
            System.out.println("图片地址："+path+"/"+fileName);
            //将文件保存到服务器指定位置，这个地方的文件名地址会存储到数据库里
            try {
                image.setImageid(fileName);
                image.setCommentid(id);
                this.imageService.insert(image);
                //这里设置这些image的id
                FileUtils.copyInputStreamToFile(picture.getInputStream(),targetFile);

                System.out.println("上传成功");
                //将文件在服务器的存储路径返回
            } catch (IOException e) {
                System.out.println("上传失败");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/upload/PostImage/{id}")
    public void uploadPostImage(@RequestParam(value = "file") List<MultipartFile> pictures, @PathVariable String id, HttpServletRequest request) throws FileNotFoundException {
        Image image = new Image();
        //数据库存用户id+评论id+视频id
        System.out.println("您已进入图片上传服务");
        //获取文件在服务器的储存位置,此种方式直接存入了真实文件夹
        //String path = "C:\Users\11783\Desktop\LoginAndRegist\target\classes\static\image";
        //文件上传的地址，此种方式直接存入了target
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/image";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());


        File filePath = new File(path);
        System.out.println("文件的保存路径：" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        for(MultipartFile picture:pictures){
            //获取原始文件名称(包含格式)
            String originalFileName = picture.getOriginalFilename();
            System.out.println("原始文件名称：" + originalFileName);

            //获取文件类型，以最后一个`.`为标识
            String type = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
            System.out.println("文件类型：" + type);
            //获取文件名称（不包含格式）
            String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));

            String fileName = UUIDUtils.getUuid() + name + "." + type;
            System.out.println("新文件名称：" + fileName);

            //在指定路径下创建一个文件
            File targetFile = new File(filePath.getAbsoluteFile(), fileName);
            System.out.println("图片地址："+path+"/"+fileName);
            //将文件保存到服务器指定位置，这个地方的文件名地址会存储到数据库里
            try {
                image.setImageid(fileName);
                image.setPostid(id);
                this.imageService.insert(image);
                //这里设置这些image的id
                FileUtils.copyInputStreamToFile(picture.getInputStream(),targetFile);
                System.out.println("上传成功");
                //将文件在服务器的存储路径返回
            } catch (IOException e) {
                System.out.println("上传失败");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/upload/ResponseImage/{id}")
    public void uploadResponseImage(@RequestParam(value = "file") List<MultipartFile> pictures, @PathVariable String id, HttpServletRequest request) throws FileNotFoundException {
        Image image = new Image();
        //数据库存用户id+评论id+视频id
        System.out.println("您已进入图片上传服务");
        //获取文件在服务器的储存位置,此种方式直接存入了真实文件夹
        //String path = "C:\Users\11783\Desktop\LoginAndRegist\target\classes\static\image";
        //文件上传的地址，此种方式直接存入了target
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/image";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());


        File filePath = new File(path);
        System.out.println("文件的保存路径：" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        for(MultipartFile picture:pictures){
            //获取原始文件名称(包含格式)
            String originalFileName = picture.getOriginalFilename();
            System.out.println("原始文件名称：" + originalFileName);

            //获取文件类型，以最后一个`.`为标识
            String type = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
            System.out.println("文件类型：" + type);
            //获取文件名称（不包含格式）
            String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));

            String fileName = UUIDUtils.getUuid() + name + "." + type;
            System.out.println("新文件名称：" + fileName);

            //在指定路径下创建一个文件
            File targetFile = new File(filePath.getAbsoluteFile(), fileName);
            System.out.println("图片地址："+path+"/"+fileName);
            //将文件保存到服务器指定位置，这个地方的文件名地址会存储到数据库里
            try {
                image.setImageid(fileName);
                image.setResponseid(id);
                this.imageService.insert(image);
                //这里设置这些image的id
                FileUtils.copyInputStreamToFile(picture.getInputStream(),targetFile);
                System.out.println("上传成功");
                //将文件在服务器的存储路径返回
            } catch (IOException e) {
                System.out.println("上传失败");
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/upload/video")
    public FileResult uploadVideo(@RequestParam(value = "file") MultipartFile video, HttpServletRequest request) throws FileNotFoundException {

        System.out.println("您已进入视频上传服务");
        //获取文件在服务器的储存位置,此种方式直接存入了真实文件夹
        //String path = "C:\Users\11783\Desktop\LoginAndRegist\target\classes\static\video";
        //文件上传的地址，此种方式直接存入了target
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/video";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());


        File filePath = new File(path);
        System.out.println("文件的保存路径：" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        //获取原始文件名称(包含格式)
        String originalFileName = video.getOriginalFilename();
        System.out.println("原始文件名称：" + originalFileName);

        //获取文件类型，以最后一个`.`为标识
        String type = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        System.out.println("文件类型：" + type);
        //获取文件名称（不包含格式）
        String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));

        String fileName = UUIDUtils.getUuid() + name + "." + type;
        System.out.println("新文件名称：" + fileName);

        //在指定路径下创建一个文件
        File targetFile = new File(path, fileName);
        System.out.println("视频地址："+path+"/"+fileName);
        //将文件保存到服务器指定位置，这个地方的文件名地址会存储到数据库里
        try {
            video.transferTo(targetFile);
            System.out.println("上传成功");
            //将文件在服务器的存储路径返回
            return new FileResult(true,"http://127.0.0.1:8082/video/"+fileName,path+"/"+fileName);
        } catch (IOException e) {
            System.out.println("上传失败");
            e.printStackTrace();
            return new FileResult(false, "上传失败","");
        }
    }
}

