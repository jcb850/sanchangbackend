package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Model.*;
import com.sanchangbackstage.sanchang.service.BackendPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BackendPageController {

    //    解除文件大小限制
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小
        factory.setMaxFileSize("102400KB");
        /// 总上传数据大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }

    @Value(value = "${baseUrl}")
    public String baseUrl;

    @Autowired
    public TBVIDEOINFOINTERFACE tbvideoinfointerface;

    @Autowired
    public TBTEXTIMAGEINTERFACE tbtextimageinterface;

    @Autowired
    public TBPEOPLEINFOINTERFACE tbpeopleinfointerface;

//    public BackendPage backendPageService = new BackendPage();
    //      上传视频
//    @PostMapping(value = "/uploadVideo")
//    public String uploadVideo(@RequestParam(value = "file") MultipartFile file){
//        String url = backendPageService.saveVideo(file);
//        return url;
//    }

    @PostMapping(value = "/video")
    public String videoUpload(@RequestParam(value = "file") MultipartFile file){

        if (file.isEmpty()){
            return "上传了空文件";
        }else {
            String path = baseUrl+file.getOriginalFilename();
            File desFile = new File(path);
            if (!desFile.getParentFile().exists()){
                desFile.mkdir();
            }else {
                try {
                    file.transferTo(desFile);
                } catch (IOException e) {
                    return "上传出现错误";
                }
            }
            return path;
        }
    }


//      获得所有视频
    @GetMapping(value = "/getAllVideo")
    public List<TBVIDEOINFO> getAllVideo(){
       return tbvideoinfointerface.findAll();
    }
//      获得指定id的视频
    @GetMapping(value = "/getVideoById/{id}")
    public TBVIDEOINFO getVideoById(@PathVariable(value = "id") Integer id){
        return tbvideoinfointerface.findById(id).get();
    }


//      获得所有文章
    @GetMapping(value = "/getAllText")
    public List<TBTEXTIMAGE> getAllText(){
        return tbtextimageinterface.findAll();
    }
//    获得指定id的文章
    @GetMapping(value = "/getTextAndImgById/{id}")
    public TBTEXTIMAGE getTextAndImgById(@PathVariable(value = "id") int id){
        return tbtextimageinterface.findById(id).get();
    }


    //TODO:模型类应该是有问题，需要去修复
//获得所有人员关系
    @GetMapping(value = "/getAllPeopleInfo")
    public List<TBPEOPLEINFO>getallPeopleInfo(){
        return tbpeopleinfointerface.findAll();
    }
//    根据id获取所有人员关系
    @GetMapping(value = "/getPeoPleById/{id}")
    public TBPEOPLEINFO getPeopleById(@PathVariable(value = "id") int id){
        return tbpeopleinfointerface.findById(id).get();
    }
    //TODO：到此为止
}
