
CREATE DATABASE IF NOT EXISTS anomaly_detection;
USE anomaly_detection;

-- 创建 User 表
CREATE TABLE IF NOT EXISTS User (
    id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    created_at DATETIME NOT NULL
);

-- 创建 Product 表
CREATE TABLE IF NOT EXISTS Product (
    id INT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    product_type VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    created_at DATETIME NOT NULL
);

-- 创建 Anomaly 表
CREATE TABLE IF NOT EXISTS Anomaly (
    id INT PRIMARY KEY,
    product_id INT,
    detected_at DATETIME NOT NULL,
    severity VARCHAR(10) NOT NULL,
    description TEXT,
    FOREIGN KEY (product_id) REFERENCES Product(id)
);

-- 插入测试数据

-- 插入 User 表数据
INSERT INTO User (id, username, email, created_at) VALUES 
    (1, 'alice', 'alice@example.com', '2023-01-01 10:00:00'),
    (2, 'bob', 'bob@example.com', '2023-01-02 11:00:00'),
    (3, 'charlie', 'charlie@example.com', '2023-01-03 12:00:00');

-- 插入 Product 表数据
INSERT INTO Product (id, product_name, product_type, price, created_at) VALUES 
    (1, 'Widget A', 'Type 1', 10.99, '2023-01-01 10:00:00'),
    (2, 'Widget B', 'Type 2', 15.49, '2023-01-02 11:00:00'),
    (3, 'Widget C', 'Type 1', 8.75, '2023-01-03 12:00:00');

-- 插入 Anomaly 表数据
INSERT INTO Anomaly (id, product_id, detected_at, severity, description) VALUES 
    (1, 1, '2023-01-04 14:00:00', 'High', 'Mislabelled packaging'),
    (2, 2, '2023-01-05 15:30:00', 'Medium', 'Incorrect weight'),
    (3, 3, '2023-01-06 16:45:00', 'Low', 'Minor discoloration');
