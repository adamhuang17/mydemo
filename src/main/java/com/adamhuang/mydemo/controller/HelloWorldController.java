package com.adamhuang.mydemo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World！我是黄嘉骏";
    }
}
