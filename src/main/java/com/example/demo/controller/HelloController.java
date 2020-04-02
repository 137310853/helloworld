package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin
 * @date 2020-04-02 15:16
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

}
