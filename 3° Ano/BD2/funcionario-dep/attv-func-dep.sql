CREATE DATABASE atv_funcionario;
USE atv_funcionario;

create table departamentos(
	codigo_depto int not null auto_increment,
    nomeDepto varchar(100) not null,
    primary key(codigo_depto)
);
create table funcionarios(
	codigo_func int not null auto_increment,
    nomeFunc varchar(100) not null,
    sobrenome varchar(150) not null,
    dataNasci date not null,
    cpf int(11) not null,
    rg varchar(9) not null,
    endereco varchar(200) not null,
    cep int(8) not null,
    cidade varchar(100) not null,
    fone varchar(15) not null,
    funcao varchar(50) not null,
    salario decimal not null,
    fk_codigo_depto int not null,
    primary key(codigo_func),
    foreign key (fk_codigo_depto) references departamentos(codigo_depto)
);
insert into departamentos (nomeDepto) values
('Departamento A'),
('Departamento B'),
('Departamento C');
 
insert into funcionarios (nomeFunc, sobrenome, dataNasci, cpf, rg, endereco, cep, cidade, fone, funcao, salario, fk_codigo_depto) values 
('Ana', 'Barreto', '1990-05-15', '123.456.789-01', '12.345.678-9', 'Rua das Flores, 123', '12345-678', 'São Paulo', '(11) 98765-4321', 'Analista de Marketing', 1950.00, 1),
('Ana', 'Santos', '1985-08-20', '987.654.321-01', '98.765.432-1', 'Av. Paulista, 456', '98765-432', 'Rio de Janeiro', '(21) 98765-4321', 'Supervisor', 5200.00, 2),
('Pedro', 'Oliveira', '1992-03-10', '234.567.890-12', '23.456.789-0', 'Rua da Praia, 789', '23456-789', 'Porto Alegre', '(51) 98765-4321', 'Gerente de Projetos', 600.00, 1),
('Mariana', 'Ferreira', '1988-11-25', '876.543.210-98', '87.654.321-0', 'Rua das Palmeiras, 101', '87654-321', 'Salvador', '(71) 98765-4321', 'Analista de Recursos Humanos', 4800.00, 3),
('Fernando', 'Martins', '1995-02-03', '345.678.901-23', '34.567.890-1', 'Av. Beira Mar, 1213', '34567-890', 'Fortaleza', '(85) 98765-4321', 'Supervisor', 750.00, 2),
('Juliana', 'Pereira', '1980-09-12', '765.432.109-87', '76.543.210-9', 'Rua dos Coqueiros, 1415', '76543-210', 'Recife', '(81) 98765-4321', 'Telefonista', 5200.00, 1),
('Rodrigo', 'Rodrigues', '1998-07-07', '456.789.012-34', '45.678.901-2', 'Av. Atlântica, 1617', '45678-901', 'Natal', '(84) 98765-4321', 'Analista de Sistemas', 600.00, 3),
('Patricia', 'Costa', '1983-04-30', '654.321.098-76', '65.432.109-8', 'Rua das Dunas, 1819', '65432-109', 'Florianópolis', '(48) 98765-4321', 'Analista Financeiro', 5300.00, 2),
('Lucas', 'Gomes', '1993-12-05', '567.890.123-45', '56.789.012-3', 'Rua dos Ipês, 2021', '56789-012', 'Curitiba', '(41) 98765-4321', 'Designer Gráfico', 470.00, 1),
('Camila', 'Martinez', '1987-01-18', '543.210.987-65', '54.321.098-7', 'Rua das Flores, 2223', '54321-098', 'Brasília', '(61) 98765-4321', 'Telefonista', 5100.00, 3);


-- Ex01
SELECT nomeFunc, sobrenome FROM funcionarios ORDER BY sobrenome;

-- Ex02
SELECT * FROM funcionarios ORDER BY cidade;

-- Ex03
SELECT * FROM funcionarios WHERE salario > 1000 ORDER BY nomeFunc, sobrenome;

-- Ex04
SELECT dataNasci, nomeFunc FROM funcionarios ORDER BY dataNasci DESC;

-- Ex05
SELECT sobrenome, nomeFunc, cidade, endereco, fone FROM funcionarios;

-- Ex06
SELECT SUM(salario) FROM funcionarios;

-- Ex07
SELECT nomeFunc, sobrenome, salario, funcao FROM funcionarios ORDER BY funcao;

-- Ex08 
SELECT * FROM funcionarios WHERE funcao LIKE "supervisor";

-- Ex09
SELECT COUNT(codigo_func) FROM funcionarios;

-- Ex10
SELECT AVG(salario) FROM funcionarios;

-- Ex11
SELECT nomeFunc FROM funcionarios WHERE cidade = "Recife" and funcao = "Telefonista";