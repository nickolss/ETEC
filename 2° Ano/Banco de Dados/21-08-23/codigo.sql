create database sistema_matricula;

create table alunos(
	matricula int not null,
    nome varchar(140) not null,
    endereco varchar(120) not null
);

alter table alunos
add primary key(matricula);

INSERT INTO `sistema_matricula`.`alunos` (`matricula`, `nome`, `endereco`) VALUES ('1', 'Nickolas', 'Rua 123'), ('2', 'Rafael', 'Rua 321') ,('3', 'João', 'Rua central') ,('4', 'Pedro', 'Rua lateral') , ('5', 'Revellin', 'Rua direita');

select * from alunos where matricula=1;

delete from alunos where matricula=2;

INSERT INTO `sistema_matricula`.`alunos` (`matricula`, `nome`, `endereco`) VALUES ('2', 'Rafael', 'Rua 321');

select * from alunos;