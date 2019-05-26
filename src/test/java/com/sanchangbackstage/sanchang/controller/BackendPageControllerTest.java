package com.sanchangbackstage.sanchang.controller;

import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import static org.junit.Assert.*;

public class BackendPageControllerTest {

    @Test
    public void multipartConfigElement() {
        BackendPageController backendPageController = new BackendPageController();
        backendPageController.multipartConfigElement();
    }

//    @Test
//    public void videoUpload() {
//        BackendPageController backendPageController = new BackendPageController();
//        assertEquals(backendPageController.videoUpload((MultipartFile) new File("D:\\sanchangbackendGit\\src\\main\\java\\com\\sanchangbackstage\\sanchang\\controller\\video.java")),"asd");
//        assertNotEquals();
//
//
//    }
}