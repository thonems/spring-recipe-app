CREATE TABLE IF NOT EXISTS recipes (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250) NOT NULL,
   description VARCHAR(250),
   ingredients VARCHAR(250),
   directions TEXT,
   recipe_created TIMESTAMP NOT NULL
);

