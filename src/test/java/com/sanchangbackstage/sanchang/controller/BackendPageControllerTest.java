package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Model.TBPEOPLEINFO;
import org.junit.Test;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.lang.reflect.Field;
import java.util.UUID;

import static org.junit.Assert.*;

public class BackendPageControllerTest {

    @Test
    public void multipartConfigElement() {

        TBPEOPLEINFO tbpeopleinfo = new TBPEOPLEINFO();
        for (Field i :tbpeopleinfo.getClass().getDeclaredFields()){
            System.out.println(i.getName());

        }
    }

}