CREATE DATABASE `atividadeDQL`;
USE `atividadeDQL`;

CREATE TABLE `categoria` (
  `cod_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome_categoria` varchar(80) NOT NULL,
  `descricao` text NOT NULL,

  PRIMARY KEY(`cod_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `categoria` (`nome_categoria`, `descricao`) VALUES
('Cereal', 'Cereais gostosos'),
('Limpeza', 'Produtos de limpeza'),
('Utensílios', 'Utensílios de cozinha'),
('Bebidas', 'Bebidas '),
('Massas', 'Massas de culinárias'),
('Aperitivos', 'Aperitivos para se deliciar');



CREATE TABLE `regiao` (
  `cod_regiao` int(11) NOT NULL AUTO_INCREMENT,
  `nome_regiao` varchar(80) NOT NULL,

  PRIMARY KEY(`cod_regiao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `regiao` (`nome_regiao`) VALUES
('Sudeste'),
('Sul'),
('Norte'),
('Nordeste'),
('Oeste'),
('Centro-oeste');



CREATE TABLE `territorio` (
  `cod_territorio` int(11) NOT NULL AUTO_INCREMENT,
  `fk_cod_regiao` int(11) NOT NULL,
  `nome_territorio` varchar(80) NOT NULL,

  PRIMARY KEY(`cod_territorio`),
  FOREIGN KEY(`fk_cod_regiao`) REFERENCES `regiao`(`cod_regiao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `territorio` (`fk_cod_regiao`, `nome_territorio`) VALUES
(3, 'Brazil'),
(2, 'Germany'),
(3, 'Algeria'),
(1, 'Argentina'),
(3, 'Bolivia'),
(3, 'China'),
(1, 'Chile'),
(4, 'Suica');



CREATE TABLE `envio` (
  `cod_envio` int(11) NOT NULL AUTO_INCREMENT,
  `fk_cod_territorio` int(11) NOT NULL,
  `frete` float NOT NULL,
  `nome_navio` varchar(50) NOT NULL,
  `cidade_navio` varchar(80) NOT NULL,
  `data_envio` date NOT NULL,

  PRIMARY KEY(`cod_envio`),
  FOREIGN KEY(`fk_cod_territorio`) REFERENCES `territorio`(`cod_territorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `envio` (`fk_cod_territorio`, `frete`, `nome_navio`, `cidade_navio`, `data_envio`) VALUES
(1, 60, 'Navio legal', 'Resende', '2024-03-01'),
(2, 45, 'Navio rapido', 'Lyon', '1996-08-08'),
(2, 99, 'Navio rapido', 'Lyon', '1996-12-02'),
(7, 84, 'Navio divertido', 'Resende', '2024-03-01');


-- Exercício 1
SELECT * FROM territorio ORDER BY territorio.cod_territorio DESC;

-- Exercício 2
SELECT * FROM envio ORDER BY envio.frete;

-- Exercício 3
SELECT envio.nome_navio, envio.cidade_navio, regiao.nome_regiao FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio INNER JOIN regiao ON territorio.fk_cod_regiao = regiao.cod_regiao;

-- Exercício 4
SELECT nome_categoria, descricao FROM categoria;

-- Exercício 5
SELECT SUM(cod_categoria) FROM categoria;

-- Exercício 6
SELECT SUM(cod_envio) FROM envio;

-- Exercício 7
SELECT SUM(frete) FROM envio;

-- Exercício 8
SELECT SUM(cod_regiao) FROM regiao;

-- Exercício 9
SELECT MAX(frete) FROM envio;

-- Exercício 10
SELECT MIN(frete) FROM envio;

-- Exercício 11
SELECT MAX(cod_categoria) FROM categoria;

-- Exercício 12
SELECT MIN(cod_categoria) FROM categoria;

-- Exercício 13
SELECT MAX(cod_envio) FROM envio;

-- Exercício 14
SELECT MIN(cod_envio) FROM envio;
 
-- Exercício 15
SELECT MAX(cod_regiao) FROM regiao;

-- Exercício 16
SELECT MIN(cod_regiao) FROM regiao;
 
-- Exercício 17
SELECT AVG(frete) FROM envio;
 
-- Exercício 18
SELECT AVG(cod_categoria) FROM categoria;
 
-- Exercício 19
SELECT AVG(cod_envio) FROM envio;
 
-- Exercício 20
SELECT AVG(cod_regiao) FROM regiao;
 
-- Exercício 21
SELECT * FROM territorio WHERE territorio.fk_cod_regiao = 2;
 
-- Exercício 22
SELECT * FROM territorio WHERE fk_cod_regiao = 2 or fk_cod_regiao = 3;
 
-- Exercício 23
SELECT * FROM territorio WHERE nome_territorio LIKE "S%";
 
-- Exercício 24
SELECT * FROM territorio WHERE cod_territorio LIKE "7%";
 
-- Exercício 25
SELECT * FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio WHERE territorio.nome_territorio = "Brazil";
 
-- Exercício 26
SELECT * FROM envio WHERE frete > 50;
 
-- Exercício 27
SELECT * FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio INNER JOIN regiao ON territorio.fk_cod_regiao = regiao.cod_regiao WHERE regiao.cod_regiao is null;
 
-- Exercício 28
SELECT * FROM envio WHERE EXTRACT(MONTH from envio.data_envio) = 8;
 
-- Exercício 29
SELECT * FROM envio WHERE cod_envio > 10250 and cod_envio < 10256;
 
-- Exercício 30
SELECT * FROM envio WHERE envio.cidade_navio like "R%";
 
-- Exercício 31
SELECT * FROM categoria WHERE nome_categoria not like "%cereal%";
 
-- Exercício 32
SELECT * FROM envio WHERE cod_envio < 5;
 
-- Exercício 33 
 SELECT COUNT(envio.cod_envio) FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio WHERE territorio.nome_territorio = "Germany";

-- Exercício 34 
SELECT COUNT(envio.cod_envio) FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio WHERE territorio.nome_territorio = "Rio de Janeiro";
 
-- Exercício 35 
SELECT COUNT(envio.frete) FROM envio;
 
-- Exercício 36 
 SELECT COUNT(envio.cod_envio) FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio INNER JOIN regiao ON territorio.fk_cod_regiao = regiao.cod_regiao WHERE regiao.nome_regiao = "Sudeste";

-- Exercício 37 
SELECT COUNT(envio.cod_envio) FROM envio;
 
-- Exercício 38 
SELECT * FROM envio INNER JOIN territorio ON envio.fk_cod_territorio = territorio.cod_territorio INNER JOIN regiao ON territorio.fk_cod_regiao = regiao.cod_regiao WHERE regiao.cod_regiao is NOT null;
 
-- Exercício 39 
SELECT COUNT(territorio.cod_territorio)FROM territorio WHERE territorio.fk_cod_regiao = 2;

-- Exercício 40 
SELECT COUNT(territorio.cod_territorio)FROM territorio WHERE territorio.fk_cod_regiao = 4;

-- Exercício 41
SELECT * FROM territorio WHERE territorio.fk_cod_regiao = 2 and territorio.nome_territorio LIKE "s%";

-- Exercício 42 
SELECT * FROM envio WHERE envio.cidade_navio = "Bern" or envio.cidade_navio = "Lyon" or envio.cidade_navio = "Resende";

-- Exercício 43 
SELECT * FROM envio WHERE not envio.cidade_navio = "Bern" and not envio.cidade_navio = "Lyon" and not envio.cidade_navio = "Resende";

-- Exercício 44 
SELECT DISTINCT(territorio.fk_cod_regiao) FROM territorio;

-- Exercício 45 
SELECT * FROM envio WHERE EXTRACT(MONTH from envio.data_envio) = 7;

-- Exercício 46
SELECT * FROM envio WHERE envio.data_envio = '1996-08-08';

-- Exercício 47 
SELECT * FROM envio WHERE YEAR(envio.data_envio) = 1996 AND MONTH(envio.data_envio) >= 11 AND MONTH(envio.data_envio) <= 12;
