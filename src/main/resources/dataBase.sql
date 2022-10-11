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

CREATE TABLE coder_purchases(
id_purchase INT PRIMARY KEY AUTO_INCREMENT,
price DECIMAL(19, 4) NOT NULL,
date_purchase DATE NOT NULL,
id_client INT NOT NULL, 
CONSTRAINT FK_clients  FOREIGN KEY (id_client) REFERENCES coder_clients(id_client)
);

CREATE TABLE coder_products(
id_product INT PRIMARY KEY AUTO_INCREMENT,
name_product VARCHAR(30) NOT NULL,
price DECIMAL(19, 4) NOT NULL,
stock INT DEFAULT 0,
article VARCHAR(30),
state ENUM ('V','N') DEFAULT 'N',
id_purchase INT NOT NULL,
CONSTRAINT FK_purchases FOREIGN KEY (id_purchase) REFERENCES coder_purchases(id_purchase));


