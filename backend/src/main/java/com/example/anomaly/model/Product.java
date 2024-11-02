package com.example.anomaly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



// 商品实体类
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 商品ID

    private String name; // 商品名称
    private Double price; // 商品价格
    private Integer stock; // 商品库存
    private Integer sales; // 商品销量

    // Getter 和 Setter 方法
}
