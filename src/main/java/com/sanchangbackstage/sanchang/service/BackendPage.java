package com.sanchangbackstage.sanchang.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


public class BackendPage {


//    @Value("baseUrl")
//    public String baseUrl;
//
//    public String saveVideo(MultipartFile file){
//        if (file.isEmpty()){
//            return "上传了空文件";
//        }else {
//            String path = baseUrl+file.getOriginalFilename();
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
