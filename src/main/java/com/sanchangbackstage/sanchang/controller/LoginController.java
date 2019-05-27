package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Model.Interface.TBADMINISTRATORSINTERFACE;
import com.sanchangbackstage.sanchang.Model.TBADMINISTRATORS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    public TBADMINISTRATORSINTERFACE tbadministratorsinterface;

    @PostMapping(value = "/login")
    public List<TBADMINISTRATORS> login(@RequestParam(value = "name")String name){
//        return tbadministratorsinterface.findByNAME(name);
        return null;
    }
}
