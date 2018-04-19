package com.zhangs.collector.controller;

import com.zhangs.collector.entities.User;
import com.zhangs.collector.repository.UserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
public class UserController extends BaseController<User,UserRepo>{
    @GetMapping("/get")
    public User getUser(long id){
        return new User();
    }
    @GetMapping("/put")
    public User setUser(User user){
        System.out.println("hi:"+user.toString());
        return user;
    }
}
