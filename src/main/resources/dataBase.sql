CREATE DATABASE coder_sale;

USE coder_sale;

CREATE TABLE coder_clients(
id_client INT PRIMARY KEY AUTO_INCREMENT,
name_client VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
identity_document VARCHAR(30) NOT NULL UNIQUE,
address VARCHAR(60),
date_birth DATE,
state ENUM ('V','N') DEFAULT 'N'
);

CREATE TABLE coder_products_suppliers(
id_products_suppliers INT PRIMARY KEY AUTO_INCREMENT,
id_product INT NOT NULL,
id_supplier INT NOT NULL
);

CREATE TABLE coder_heading(
id_heading INT PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(45)
);

CREATE TABLE coder_bills(
id_bills INT PRIMARY KEY AUTO_INCREMENT,
date date,
total date,
client_id INT NOT NULL,
CONSTRAINT FK_bill_id FOREIGN KEY (client_id) references coder_clients(id_client)
);

CREATE TABLE coder_products(
id_product INT PRIMARY KEY AUTO_INCREMENT,
name_product VARCHAR(30) NOT NULL,
purchase_price DECIMAL(19, 4) NOT NULL,
sale_price DECIMAL(19, 4) NOT NULL,
stock INT DEFAULT 0,
description VARCHAR(45),
state ENUM ('V','N') DEFAULT 'N',
product_supplier_id INT NOT NULL,
heading_id INT NOT NULL,
CONSTRAINT FK_products_suppliers_id FOREIGN KEY (product_supplier_id)
REFERENCES coder_products_suppliers(id_products_suppliers),
CONSTRAINT FK_heading_id FOREIGN KEY (heading_id)
REFERENCES coder_heading(id_heading)
);

CREATE TABLE coder_suppliers(
id_supplier INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(45),
product_supplier_id INT NOT NULL,
CONSTRAINT FK_product_supplier_id FOREIGN KEY (product_supplier_id)
REFERENCES coder_products_suppliers(id_products_suppliers)
);

CREATE TABLE coder_detail_bill(
id_detail_bill INT PRIMARY KEY AUTO_INCREMENT,
stock INT NOT NULL,
bill_id INT NOT NULL,
product_id INT NOT NULL,
CONSTRAINT FK_bills_id FOREIGN KEY (bill_id) references coder_bills(id_bills),
CONSTRAINT FK_product_id FOREIGN KEY (product_id) references coder_products(id_product)
);

CREATE TABLE coder_user(
id_user INT PRIMARY KEY AUTO_INCREMENT,
user_name VARCHAR(45),
password VARCHAR(45)
);