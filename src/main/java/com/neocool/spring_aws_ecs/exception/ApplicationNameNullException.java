package com.neocool.spring_aws_ecs.exception;

import java.io.Serial;

public class ApplicationNameNullException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 4116705716089556302L;

    public ApplicationNameNullException() {
        super("spring.application.name is required for spring boot configuration in application.properties or application.yml");
    }
}
