package com.example.anomaly.repository;

import com.example.anomaly.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 用户仓库接口
public interface UserRepository extends JpaRepository<User, Long> {
}
