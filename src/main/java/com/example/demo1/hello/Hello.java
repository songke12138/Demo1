package com.example.demo1.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo1")
public class Hello {


    @RequestMapping("/")
    @ResponseBody
    public String Hello(){
        return "hello";
    }

}
