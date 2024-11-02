-- 创建商品表
CREATE TABLE IF NOT EXISTS products (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(100),
    price DECIMAL(10, 2),
    stock INT,
    sales INT
    );

-- 创建异常表
CREATE TABLE IF NOT EXISTS anomalies (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         product_id INT,
                                         anomaly_type VARCHAR(50),
    detected_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20),
    FOREIGN KEY (product_id) REFERENCES products(id)
    );

-- 创建用户表
CREATE TABLE IF NOT EXISTS users (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     username VARCHAR(50),
    password VARCHAR(50),
    role VARCHAR(20)
    );
