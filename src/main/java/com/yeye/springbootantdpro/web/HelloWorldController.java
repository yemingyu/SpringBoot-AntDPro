package com.yeye.springbootantdpro.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yeye")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello xiaoxiao";
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}