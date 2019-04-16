package com.example.lucene.controller;

import com.example.lucene.domain.User;
import com.example.lucene.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Greated by Terry on 2019/4/16
 * Time: 10:52
 */
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public  Object login(String username,String password){
        User user=userService.findByUsernameAndPassword(username,password);
        return user;
    }

    @PutMapping()
    public User creat( User user){
        user=userService.registerUser(user);
        return user;
    }
    @GetMapping("/list")
    public List<User> query(){
        List<User> list=userService.findByUser();
        return  list;
    }
    @GetMapping("/{id}")
    public Optional<User> getinfo(@PathVariable Integer id){
        Optional<User> user=userService.getUserById(id);
        return user;
    }
    @DeleteMapping("/{id}")
    public void  delete(@PathVariable Integer id){
        userService.removeUser(id);
    }

}
