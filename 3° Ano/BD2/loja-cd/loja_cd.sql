create database loja_cd;
use loja_cd;
-- Criar tabela cd
create table if not exists cd(
	cod_cd int not null auto_increment,
	nome_cd varchar(120) not null,
    data_compra date not null,
    valor_pago float not null,
    local_compra varchar(150) not null,
    album enum("sim","nao") not null,
    
    primary key(cod_cd)
);

-- Criar tabela musica
create table if not exists musica(
	cod_cd int not null,
	numero_musica int not null,
    nome_musica varchar(120) not null,
    artista varchar(100) not null,
    tempo timestamp
);

-- Inserir CDs
INSERT INTO cd (nome_cd, data_compra, valor_pago, local_compra, album) VALUES 
('Thriller', '2023-05-15', 20.99, 'Amazon', 'sim'),
('Abbey Road', '2022-09-10', 18.50, 'eBay', 'sim'),
('Dark Side of the Moon', '2024-01-20', 25.00, 'Loja de Discos', 'sim'),
('Back in Black', '2023-11-05', 22.75, 'Fnac', 'nao'),
('The Wall', '2024-02-28', 30.00, 'Loja de CDs', 'sim');

-- Inserir músicas
INSERT INTO musica (cod_cd, numero_musica, nome_musica, artista, tempo) VALUES 
(1, 1, 'Wanna Be Startin', 'Michael Jackson', '00:06:03'),
(1, 2, 'Baby Be Mine', 'Michael Jackson', '00:04:20'),
(1, 3, 'The Girl Is Mine', 'Michael Jackson', '00:03:41'),
(1, 4, 'Thriller', 'Michael Jackson', '00:05:57'),
(2, 1, 'Come Together', 'The Beatles', '00:04:20'),
(2, 2, 'Something', 'The Beatles', '00:03:03'),
(2, 3, 'Maxwell''s Silver Hammer', 'The Beatles', '00:03:27'),
(2, 4, 'Oh! Darling', 'The Beatles', '00:03:26'),
(3, 1, 'Speak to Me', 'Pink Floyd', '00:01:30'),
(3, 2, 'Breathe (In the Air)', 'Pink Floyd', '00:02:43'),
(3, 3, 'On the Run', 'Pink Floyd', '00:03:36'),
(3, 4, 'Time', 'Pink Floyd', '00:06:53'),
(4, 1, 'Hells Bells', 'AC/DC', '00:05:12'),
(4, 2, 'Shoot to Thrill', 'AC/DC', '00:05:17'),
(5, 1, 'In the Flesh?', 'Pink Floyd', '00:03:19'),
(5, 2, 'The Thin Ice', 'Pink Floyd', '00:02:26'),
(5, 3, 'Another Brick in the Wall (Part I)', 'Pink Floyd', '00:03:11');


-- Ex01 
SELECT * FROM cd;

-- Ex02
SELECT cd.nome_cd , cd.data_compra FROM cd ORDER BY cd.nome_cd;

-- Ex03
SELECT cd.nome_cd , cd.data_compra FROM cd ORDER BY cd.data_compra DESC;

-- Ex04
SELECT cd.nome_cd , cd.data_compra, cd.valor_pago FROM cd ORDER BY cd.valor_pago DESC;

-- Ex05
SELECT SUM(cd.valor_pago) FROM cd;

-- Ex06
SELECT * FROM musica WHERE musica.cod_cd = 1;

-- Ex07
SELECT musica.nome_musica, musica.artista FROM musica;

-- Ex08
SELECT musica.numero_musica, musica.nome_musica, musica.tempo FROM musica WHERE musica.cod_cd = 5 ORDER BY musica.numero_musica;

-- Ex09
SELECT COUNT(musica.numero_musica) FROM musica;

-- Ex10
SELECT musica.nome_musica FROM musica WHERE musica.artista = "José Pedro";

-- Ex11
SELECT cd.nome_cd FROM cd WHERE cd.local_compra = "Submarino";

-- Ex12
SELECT * FROM musica ORDER BY musica.nome_musica;

-- Ex13
SELECT * FROM cd WHERE cd.album = "sim";

-- Ex14
SELECT AVG(cd.valor_pago) FROM cd;