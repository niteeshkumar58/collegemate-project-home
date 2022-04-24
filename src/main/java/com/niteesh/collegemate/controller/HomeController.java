package com.niteesh.collegemate.controller;

import com.niteesh.collegemate.dto.UserPublicData;
import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.UserData;
import com.niteesh.collegemate.repository.UserRepository;
import com.niteesh.collegemate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public String home(){
        return "welocome to home page of collegemate application!!!";
    }

//    @PostMapping(value = "/addNewUser")
//    public UserData addNewUser(@RequestBody UserData userData){
//        System.out.println(userData);
//        return userService.addNewUser(userData);
//    }


    @PostMapping(value = "/addNewUser")
    public User addNewUser(@RequestBody User user){
        System.out.println(user);
        return userRepository.save(user);
    }

    @GetMapping(value = "getUserById/{id}")
    public User getUserById(@PathVariable String id){
        System.out.println("id: "+id);
        return userRepository.findByUserId(valueOf(id));
    }

    @GetMapping(value = "getUsersLikedByUserX/xid={id}")
    public List<UserPublicData> getUsersLikedByUserX(@PathVariable String id){
        return userService.getUsersLikedByX(id);
    }

//    @GetMapping(value = "getUsersWhoLikedUserX/xid={id}")
//    public User getUsersWhoLikedUserX(@PathVariable String id){
//        return userRepository.findUsersWhoLikedX(valueOf(id));
//    }



}
