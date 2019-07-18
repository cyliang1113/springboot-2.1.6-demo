package com.leo.springboot216demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties("xxoo")
@Data
@Validated
public class XxooProperty {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;
}
