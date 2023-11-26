package com.neocool.spring_aws_ecs.controller;

import com.amazonaws.xray.spring.aop.BaseAbstractXRayInterceptor;
import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@XRayEnabled
@RestController
@CrossOrigin(origins = "*")
public class StringController {

    @GetMapping("/")
    public String home() {
        return "Hello World, This is spring boot application.";
    }


}
