package com.example.demo1.controller;

import com.example.demo1.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class mycontroller {

    @Autowired
    private MyService myService;

   @RequestMapping("/hello")
   @ResponseBody
   public int text(){

    int i = myService.add("小花",66);

        return i;
    }
}
