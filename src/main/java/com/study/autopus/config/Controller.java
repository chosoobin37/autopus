package com.study.autopus.config;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class Controller {

    @GetMapping
    public String healthcheck() {
        return "healthcheck";
    }

}
