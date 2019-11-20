package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void getAll(){
    userService.getAll();
    }
    public void getAllById(int id){
    userService.getById(id);
    }
    public void deleteById(int id){
    userService.deleteById(id);
    }
    public void updateById(int id){
    userService.updayeById(id);
    }
}
