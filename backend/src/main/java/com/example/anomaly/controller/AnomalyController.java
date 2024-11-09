package com.example.anomaly.controller;

import com.example.anomaly.model.Anomaly;
import com.example.service.AnomalyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 异常控制器
@RestController
@RequestMapping("/anomalies")
public class AnomalyController {
    @Autowired
    private AnomalyService anomalyService;

    // 获取所有异常
    @GetMapping
    public List<Anomaly> getAnomalies() {
        return anomalyService.findAll();
    }

    // 创建异常
    @PostMapping
    public ResponseEntity<Anomaly> createAnomaly(@RequestBody Anomaly anomaly) {
        return ResponseEntity.ok(anomalyService.save(anomaly));
    }
}