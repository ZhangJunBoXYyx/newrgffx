package com.example.anomaly.repository;

import com.example.anomaly.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// 商品仓库接口
public interface ProductRepository extends JpaRepository<Product, Long> {
}
