package com.moon.demo.controller;

import com.moon.demo.dto.User;
import com.moon.demo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;




@RestController
@RequestMapping( "/demo/v1")
public class DemoController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/users/{userid}")
    public User getUser(@PathVariable("userid") String id){
        return userService.getUser(id);
    }



}
