package com.example.anomaly.service;

import com.example.anomaly.model.User;
import com.example.anomaly.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 用户服务类
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // 查询所有用户
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // 保存用户
    public User save(User user) {
        return userRepository.save(user);
    }
}
