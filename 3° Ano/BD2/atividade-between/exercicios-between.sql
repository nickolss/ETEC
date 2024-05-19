CREATE DATABASE NA;
USE NA;

CREATE TABLE usuarios(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(60),
    `email` VARCHAR(60),
    `salario` FLOAT(10,2),
    `data_nascimento` DATE,
    `cidade` VARCHAR(60),
    `estado` VARCHAR(2),

    PRIMARY KEY(`id`)
);

INSERT INTO `usuarios` (`id`, `nome`, `email`, `salario`, `data_nascimento`, `cidade`, `estado`) VALUES 
('João', 'joao1970@gmail.com', '8000.00', '1970-05-20', 'São Paulo', 'SP'), 
('Camila', 'camila@gmail.com', '3000.00', '1985-07-23', 'São Paulo', 'SP'), 
('Marcio', 'marcio@gmail.com', '900.00', '1982-03-15', 'Campinas', 'SP'), 
('Fernanda', 'fernanda@gmail.com', '3500.00', '1987-08-18', 'Rio de Janeiro', 'RJ'), 
('José', 'jose@gmail.com', '2200.00', '1990-09-18', 'Graxupé', 'MG'), 
('Fabiano', 'fabiano@gmail.com', '6800.00', '1981-01-30', 'Poço de Caldas', 'MG'), 
('Marcos', 'marcos@gmail.com', '3200.00', '1989-02-08', 'Vitória', 'ES');

-- Ex01
CREATE DATABASE NA;

-- Ex02
CREATE TABLE funcionarios(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(60),
    `email` VARCHAR(60),
    `salario` FLOAT(10,2),
    `data_nascimento` DATE,
    `cidade` VARCHAR(60),
    `estado` VARCHAR(2),

    PRIMARY KEY(`id`)
);

-- Ex03
INSERT INTO `funcionarios` (`id`, `nome`, `email`, `salario`, `data_nascimento`, `cidade`, `estado`) VALUES 
('João', 'joao1970@gmail.com', '8000.00', '1970-05-20', 'São Paulo', 'SP'), 
('Camila', 'camila@gmail.com', '3000.00', '1985-07-23', 'São Paulo', 'SP'), 
('Marcio', 'marcio@gmail.com', '900.00', '1982-03-15', 'Campinas', 'SP'), 
('Fernanda', 'fernanda@gmail.com', '3500.00', '1987-08-18', 'Rio de Janeiro', 'RJ'), 
('José', 'jose@gmail.com', '2200.00', '1990-09-18', 'Graxupé', 'MG'), 
('Fabiano', 'fabiano@gmail.com', '6800.00', '1981-01-30', 'Poço de Caldas', 'MG'), 
('Marcos', 'marcos@gmail.com', '3200.00', '1989-02-08', 'Vitória', 'ES');

-- Ex04
SELECT * FROM `usuarios` WHERE usuarios.nome LIKE "a%" OR "e%" OR "i%" OR "u%";

-- Ex05
SELECT nome, salario FROM `usuarios` ORDER BY salario DESC;

-- Ex06
SELECT nome, email FROM `usuarios` ORDER BY nome;

-- Ex07
SELECT MAX(salario) FROM `usuarios`;

-- Ex08
SELECT AVG(salario) FROM `usuarios`;

-- Ex09
SELECT nome, email, salario FROM `usuarios` WHERE id = 3 OR id = 7;