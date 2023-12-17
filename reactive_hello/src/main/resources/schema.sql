

CREATE TABLE Ingredient (
 id INT AUTO_INCREMENT PRIMARY KEY,
 slug VARCHAR(4) NOT NULL,
 name VARCHAR(25) NOT NULL,
 type VARCHAR(10) NOT NULL
);


CREATE TABLE Taco (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    ingredient_ids INTEGER ARRAY[100] NOT NULL
);

CREATE TABLE TacoOrder (
    id INT AUTO_INCREMENT PRIMARY KEY,
    delivery_name VARCHAR(50) NOT NULL,
    delivery_street VARCHAR(50) NOT NULL,
    delivery_city VARCHAR(50) NOT NULL,
    delivery_state VARCHAR(2) NOT NULL,
    delivery_zip VARCHAR(10) NOT NULL,
    cc_number VARCHAR(16) NOT NULL,
    cc_expiration VARCHAR(5) NOT NULL,
    cc_cvv VARCHAR(3) NOT NULL,
    taco_ids INTEGER ARRAY[100] NOT NULL
);