package com.neocool.spring_aws_ecs.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.neocool.spring_aws_ecs.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
@XRayEnabled
public class SpringService {
    public String getMsg1(){
        return "Hello World, This is spring boot application 1.";
    }

    public String getMsg2(){
        return "Hello World, This is spring boot application 2.";
    }

    public String getMsg3(){
        return "Hello World, This is spring boot application 3.";
    }
}
