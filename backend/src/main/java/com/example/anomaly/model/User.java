package com.example.anomaly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// 用户实体类
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 用户ID

    private String username; // 用户名
    private String password; // 密码
    private String role; // 用户角色

    // Getter 和 Setter 方法
}
