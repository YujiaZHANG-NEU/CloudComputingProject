package com.example.cloudComputingProj.controller;


import com.example.cloudComputingProj.service.ImageService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.*;

@RestController
@RequestMapping("download")
public class DownloadController {

    @Resource
    private ImageService imageService;
    /**
     * @Title:
     * @Description: 下载图片
     * @param
     * @return
     * @throws
     */
    @RequestMapping(value = { "/image" }, method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadImage(@RequestParam("filename") String fileName) throws IOException {
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/image";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());
        String filePath =path+"/"+fileName;
        //获得图片地址
        @SuppressWarnings("resource")
        InputStream in = new FileInputStream(new File(filePath));
        // 将该文件加入到输入流之中
        byte[] body = null;
        body = new byte[in.available()];
        // 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
        in.read(body);
        // 读入到输入流里面

        fileName = new String(fileName.getBytes("gbk"), "iso8859-1");
        // 防止中文乱码
        HttpHeaders headers = new HttpHeaders();
        // 设置响应头
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        // 设置响应吗
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;
    }

    /**
     * @Title:
     * @Description: 下载视频
     * @param
     * @return
     * @throws
     */
    @RequestMapping(value = { "/video" }, method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadVideo(@RequestParam("filename") String fileName) throws IOException {
        String realPath = ResourceUtils.getURL("classpath:").getPath()+"static/video";
        String path = realPath.replace('/', '\\').substring(1,realPath.length());
        String filePath =path+"/"+fileName;
        //获得图片地址
        @SuppressWarnings("resource")
        InputStream in = new FileInputStream(new File(filePath));
        // 将该文件加入到输入流之中
        byte[] body = null;
        body = new byte[in.available()];
        // 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
        in.read(body);
        // 读入到输入流里面

        fileName = new String(fileName.getBytes("gbk"), "iso8859-1");
        // 防止中文乱码
        HttpHeaders headers = new HttpHeaders();
        // 设置响应头
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        // 设置响应吗
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;
    }


}
