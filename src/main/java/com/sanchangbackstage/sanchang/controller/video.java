package com.sanchangbackstage.sanchang.controller;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.IOException;

@RestController
public class video {


//    @PostMapping(value = "/video")
//    public String videoUpload(@RequestParam(value = "file") MultipartFile file){
//
//        if (file.isEmpty()){
//            return "上传了空文件";
//        }else {
//            String path = "D:\\FileOutputDir\\"+file.getOriginalFilename();
//            File desFile = new File(path);
//            if (!desFile.getParentFile().exists()){
//                desFile.mkdir();
//            }else {
//                try {
//                    file.transferTo(desFile);
//                } catch (IOException e) {
//                    return "上传出现错误";
//                }
//            }
//            return path;
//        }
//    }
}