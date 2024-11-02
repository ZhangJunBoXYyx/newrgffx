package com.example.anomaly.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;


// 异常实体类
@Entity
public class Anomaly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 异常ID

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product; // 关联商品

    private String anomalyType; // 异常类型
    private LocalDateTime detectedAt; // 检测时间
    private String status; // 异常状态

    // Getter 和 Setter 方法
}
