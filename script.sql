DROP DATABASE IF EXISTS microtopicos;
CREATE DATABASE microtopicos;
USE microtopicos;

CREATE TABLE produto (
	id int not null AUTO_INCREMENT PRIMARY KEY,
    nome varchar(100) not null,
    descricao varchar(500) not null,
    quantidade int not null,
    ativo boolean not null,
    data_criacao datetime not null,
    data_atualizacao datetime not null
);

CREATE TABLE estoque (
	id int not null AUTO_INCREMENT PRIMARY KEY,
    produto_id int not null,
    label varchar(3),
    quantidade int not null,
    data_criacao datetime not null,
    data_atualizacao datetime not null,
    foreign key (produto_id) references produto(id)
);

INSERT into produto values (1, "Bicicleta Ergonômica", "Para realizar exercícios com a postura correta.", 12, 1, "2022-08-22 22:12:02", "2022-08-22 22:12:02");
INSERT into produto values (2, "Ar com dicionário", "Para se refrescar com palavras.", 5, 1, "2022-08-22 22:12:02", "2022-08-22 22:12:02");
INSERT into produto values (3, "Ar com dinossauro", "Para se refrescar no cretáceo.", 8, 1, "2022-08-22 22:12:02", "2022-08-22 22:12:02");

INSERT into estoque values (1, 1, "ENT", 12, "2022-08-22 22:12:02", "2022-08-22 22:12:02");
INSERT into estoque values (2, 2, "ENT", 5, "2022-08-22 22:12:02", "2022-08-22 22:12:02");
INSERT into estoque values (3, 3, "ENT", 8, "2022-08-22 22:12:02", "2022-08-22 22:12:02");