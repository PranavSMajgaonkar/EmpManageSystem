package com.ssm.contoller;

import com.ssm.model.LogInDetails;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;


@RestController
public class LogIn {

    @PostMapping("/user")
    public String  msg(@RequestBody LogInDetails logInDetails){
        System.out.println("method call");
        return "Hello employee "+logInDetails.getUserName() + " " +Response.SC_OK;
    }
}
