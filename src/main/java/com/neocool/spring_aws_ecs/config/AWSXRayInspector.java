package com.neocool.spring_aws_ecs.config;

import com.amazonaws.xray.spring.aop.AbstractXRayInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AWSXRayInspector extends AbstractXRayInterceptor {
    @Override
    @Pointcut("@within(com.amazonaws.xray.spring.aop.XRayEnabled) && (bean(*Controller) || bean(*Service) || bean(*Client) || bean(*Mapper))")
    public void xrayEnabledClasses() {}

}
