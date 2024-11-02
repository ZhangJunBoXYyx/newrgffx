package com.example.anomaly.service;

import com.example.anomaly.model.Anomaly;
import com.example.anomaly.repository.AnomalyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 异常服务类
@Service
public class AnomalyService {
    @Autowired
    private AnomalyRepository anomalyRepository;

    // 查询所有异常
    public List<Anomaly> findAll() {
        return anomalyRepository.findAll();
    }

    // 保存异常
    public Anomaly save(Anomaly anomaly) {
        return anomalyRepository.save(anomaly);
    }
}
