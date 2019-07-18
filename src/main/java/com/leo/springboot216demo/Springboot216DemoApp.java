package com.leo.springboot216demo;

import com.leo.springboot216demo.config.XxooProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Springboot216DemoApp {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @Autowired
    private XxooProperty xxooProperty;

    public static void main(String[] args) {
        SpringApplication.run(Springboot216DemoApp.class);
    }
}
