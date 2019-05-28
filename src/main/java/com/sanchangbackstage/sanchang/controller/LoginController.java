package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Model.Interface.TBADMINISTRATORSINTERFACE;
import com.sanchangbackstage.sanchang.Model.TBADMINISTRATORS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    public TBADMINISTRATORSINTERFACE tbadministratorsinterface;

    @PostMapping(value = "/login")
    public boolean login(@RequestParam(value = "username")String username, @RequestParam(value = "password") String password){

//        return tbadministratorsinterface.findByNAME(name);
            List list = tbadministratorsinterface.findByName(username);
            TBADMINISTRATORS user;
            user = (TBADMINISTRATORS) list.get(0);
            if(user.getPASSWORD().equals(password)){
                return true;
            }else {
                return false;
            }
    }
}
