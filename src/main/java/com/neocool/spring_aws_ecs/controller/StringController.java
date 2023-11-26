package com.neocool.spring_aws_ecs.controller;

import com.amazonaws.xray.spring.aop.BaseAbstractXRayInterceptor;
import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.neocool.spring_aws_ecs.service.SpringService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@XRayEnabled
@RestController
@CrossOrigin(origins = "*")
public class StringController {

    @Autowired
    SpringService service;

    @GetMapping("/1")
    public String msg1() {
        return service.getMsg1();
    }

    @GetMapping("/2")
    public String msg2() {
        return service.getMsg2();
    }

    @GetMapping("/3")
    public String msg3() {
        return service.getMsg3();
    }

}
