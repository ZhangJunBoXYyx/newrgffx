package com.example.anomaly.controller;

import com.example.anomaly.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 用户控制器
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // 获取所有用户
    @GetMapping
    public List<User> getUsers() {
        return userService.findAll();
    }

    // 创建用户
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }
}
