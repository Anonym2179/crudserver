DROP TABLE IF EXISTS 'product';

CREATE TABLE 'product'(
    'product_id' begint NOT NULL AUTO_INCREMENT,
    'product_name' varchar(255) DEFAULT NULL,
    'product_price' varchar(255) NOT NULL,
    PRIMARY KEY (product_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
