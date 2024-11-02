package com.example.anomaly.service;

import com.example.anomaly.model.Product;
import com.example.anomaly.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 商品服务类
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // 查询所有商品
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // 保存商品
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
