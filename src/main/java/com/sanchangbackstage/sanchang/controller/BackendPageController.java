package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Model.TBVIDEOINFO;
import com.sanchangbackstage.sanchang.Model.TBVIDEOINFOINTERFACE;
import com.sanchangbackstage.sanchang.service.BackendPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
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

    @Autowired
    public TBVIDEOINFOINTERFACE tbvideoinfointerface;

    public BackendPage backendPageService = new BackendPage();

    @PostMapping(value = "/uploadVideo")
    public String uploadVideo(@RequestParam(value = "file") MultipartFile file){
        String url = backendPageService.saveVideo(file);
        return url;
    }

    @GetMapping(value = "/getAllVideo")
    public List<TBVIDEOINFO> getAllVideo(){
       return tbvideoinfointerface.findAll();
    }
}
