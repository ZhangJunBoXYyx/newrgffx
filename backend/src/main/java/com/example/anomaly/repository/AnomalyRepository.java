package com.example.anomaly.repository;

import com.example.anomaly.model.Anomaly;
import org.springframework.data.jpa.repository.JpaRepository;

// 异常仓库接口
public interface AnomalyRepository extends JpaRepository<Anomaly, Long> {
    Anomaly save(Anomaly anomaly);
}