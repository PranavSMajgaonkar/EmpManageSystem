package com.ssm.EmpManageSystem.contoller;

import org.springframework.web.bind.annotation.*;


@RestController
public class LogIn {

    @GetMapping("printMessage")
    public String  print(){
        return "This is login controller";
    }
}
