CREATE TABLE order (
    id BIGINT PRIMARY KEY,
    date DATE NOT NULL,
    cost DECIMAL(10, 2) NOT NULL
);
CREATE TABLE product (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    cost DECIMAL(10, 2) NOT NULL
);
