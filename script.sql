-- Brena dos Santos Freitas / RA: 2465710
-- Maria Gabriella Victor Gomes da Silva / RA: 2143364
-- Micael Ribeiro Rocha / RA: 2454424

-- 2.Implementação no PostGreSQL (3,5 pontos):

-- Geração e execução do código SQL para criação das tabelas e inserção de pelo menos 5 linhas de dados por tabela (0,5):

CREATE TABLE servico(
	id_servico SERIAL,
	tipo varchar(100),
	valor numeric(9, 2),
	primary key(id_servico)
);

CREATE TABLE produto(
	id_produto SERIAL,
	nome_produto varchar(100),
	valor numeric(9, 2),
    quantidade int,
	primary key(id_produto)
)

CREATE TABLE funcionario(
	id_funcionario SERIAL,
	id_servico int, 
	idade INTEGER,
	nome VARCHAR(100),
	cpf INTEGER,
	rg INTEGER,
	funcao CHAR(100),
	primary key(id_funcionario),
	FOREIGN KEY (id_servico) REFERENCES servico (id_servico)
);

CREATE TYPE tipo_motor AS ENUM('E', 'C', 'H');
CREATE TABLE veiculo (
	 id_veiculo SERIAL,
	 ano 		INTEGER,
     placa     	VARCHAR(100),
     marca		VARCHAR(100),
     modelo    	VARCHAR(100),
     cor      	VARCHAR(100),
	 motor		tipo_motor,
	 id_cliente INTEGER,
	primary key (id_veiculo),
	FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente)
);

CREATE TABLE cliente(
	id_cliente SERIAL,
	nome_cliente varchar(100),
	idade INTEGER,
	id_servico INTEGER,
	id_produto integer,
	cpf BIGINT,
	rg BIGINT,
	telefone varchar(100),
	data_de_registro TIMESTAMP,
	primary key(id_cliente),
	FOREIGN KEY (id_servico) REFERENCES servico (id_servico),
	FOREIGN KEY (id_produto) REFERENCES produto (id_produto)
);

insert into cliente(nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_de_registro) 
values ( 'Marcelo Fernandes', 27, 3,2,2569836547,32653652235, 65987898985, CURRENT_TIMESTAMP);

insert into cliente(nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_de_registro) 
values ( 'Marissa Chaves', 48, 1,3,25325657,3265335, 65987895, CURRENT_TIMESTAMP);

insert into cliente(nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_de_registro) 
values ( 'Neide Alves', 77, 2,2,2569326547,3265368235, 65988985, CURRENT_TIMESTAMP);

insert into cliente(nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_de_registro) 
values ( 'Jose de Souza', 78, 2,6,25698336, 32653652235, 659878985, CURRENT_TIMESTAMP);

insert into cliente(nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_de_registro) 
values ( 'Fernando de Cunha',45 , 3,2,25698116, 32622652235, 657778985, CURRENT_TIMESTAMP);


insert into servico (tipo, valor)
values ('Nenhum', 0);

insert into servico (tipo, valor)
values ('Troca de óleo', 200.00);

insert into servico (tipo, valor)
values ('Revisão detalhada do sistema de arrefecimento', 120.00);

insert into servico (tipo, valor)
values ('Troca do filtro do ar', 230.00);

insert into servico (tipo, valor)
values ('Manutenção de embreagem', 300.00);

insert into servico (tipo, valor)
values ('Revisão dos componentes do freio', 300.00);


insert into produto (nome_produto,valor,quantidade) 
values ('nenhum', 0, 0);

insert into produto (nome_produto,valor,quantidade) 
values ('Óleo de carro semissintético', 30.00, 10);

insert into produto (nome_produto,valor,quantidade) 
values ('Roda  Aro 15 4 x100', 590.50, 10);

insert into produto (nome_produto,valor,quantidade) 
values ('Motor', 2439.95, 6);

insert into produto (nome_produto,valor,quantidade) 
values ('Disco de freio dianteiro', 381, 12);

insert into produto (nome_produto,valor,quantidade) 
values ('Lubrificante 0W20 honda sintético', 90.25, 15);


insert into funcionario (id_servico, idade, nome, cpf, rg, funcao)
values (3, 42, 'Jorse Santos Pratos', 234242423, 34555, 'Mecanico');

insert into funcionario (id_servico, idade, nome, cpf, rg, funcao)
values (2, 26, 'Jessica Passos Braga', 234242424, 34595, 'Instrutor');

insert into funcionario (id_servico, idade, nome, cpf, rg, funcao)
values (3, 27, 'Maria Cecília', 235678902, 34545, 'Atendente');

insert into funcionario (id_servico, idade, nome, cpf, rg, funcao)
values (3, 26, 'Ricardo Menezes', 234242423, 34585, 'Mecanico');

insert into funcionario (id_servico, idade, nome, cpf, rg, funcao)
values (5, 50, 'Jorge Santos', 234240987, 34575, 'Gerente');



insert into veiculo (ano,placa, marca, modelo, cor, motor,id_cliente) 
values (2021, 'SDC-1584', 'Honda', 'Civic', 'preto','H',76);

insert into veiculo (ano, placa, marca, modelo, cor, motor,id_cliente) 
values (2010, 'XCR-2165', 'Volkswagen', 'Gol','Vermelho','C',77);

insert into veiculo (ano, placa, marca, modelo, cor, motor,id_cliente) 
values (2020, 'RHY-3265', 'Ford', 'Fusion','Cinza','H',78);

insert into veiculo (ano, placa, marca, modelo, cor, motor,id_cliente) 
values (2022, 'KLC-0376', 'Tesla','Branco', 'ModelS','E',79);

insert into veiculo (ano, placa, marca, modelo, cor, motor,id_cliente) 
values (1994, 'LIU-9875', 'Volkswagen', 'Fusca','Verde','C',80);


-- Criação de trigger/função de backup de dados excluídos de uma tabela, registrando os dados da linha apagada (sem restrições de chave), com usuário e data (0,5):

CREATE TABLE backup_cliente(
    id_backup SERIAL,
    id_cliente SERIAL,
    nome_cliente varchar(100),
    idade INTEGER,
    id_servico INTEGER,
    id_produto integer,
    cpf BIGINT,
    rg BIGINT,
    telefone varchar(100),
    data_exclusao TIMESTAMP,
    usuario varchar(100), -- Novo atributo para informar o usuário que apagou o cliente
    primary key(id_backup)
);

CREATE OR REPLACE FUNCTION backup()
RETURNS TRIGGER
AS
$$
BEGIN
    INSERT INTO backup_cliente(id_cliente, nome_cliente, idade, id_servico, id_produto, cpf, rg, telefone, data_exclusao, usuario)
    VALUES(OLD.id_cliente, OLD.nome_cliente, OLD.idade, OLD.id_servico, OLD.id_produto, OLD.cpf, OLD.rg, OLD.telefone, current_TIMESTAMP , current_user); -- Utiliza a função current_user para obter o nome do usuário atual
    RETURN OLD;
END;
$$
LANGUAGE plpgsql;

CREATE TRIGGER backup AFTER DELETE ON cliente
FOR EACH ROW EXECUTE PROCEDURE backup();

DELETE FROM veiculo WHERE id_cliente = 24;
DELETE FROM cliente WHERE id_cliente = 24;


-- Criação de pelo menos 4 índices (1 índice por tabela no máximo) (0,5):

CREATE INDEX indice_veiculo ON veiculo(id_veiculo);
CREATE INDEX indice_produto ON produto(id_produto);
CREATE INDEX indice_servico ON servico(id_servico);
CREATE INDEX indice_cliente ON cliente(id_cliente);
CREATE INDEX indice_funcionario ON funcionario(id_funcionario);

-- Criação de usuário e atribuição de privilégio somente de leitura das tabelas para o usuário criado (0,5):

CREATE ROLE usuario WITH
LOGIN
PASSWORD 'usuario';

GRANT SELECT, INSERT ON cliente_veiculo TO
usuario;

GRANT SELECT ON backup_cliente, cliente, funcionario, veiculo, produto, servico TO
usuario;

-- Criação de no mínimo uma visão (view) a partir de duas ou mais tabelas (0,5):

CREATE VIEW cliente_veiculo as 
SELECT nome_cliente,placa, marca, modelo FROM cliente cli, veiculo veic
WHERE cli.id_cliente = veic.id_cliente;

-- Criação de trigger que permita inserção de dados na view, e atribuição de privilégio ao usuário criado anteriormente para ver e inserir usando a view (1,0):

CREATE OR REPLACE FUNCTION cliente_veiculo() RETURNS TRIGGER
AS $$
DECLARE
id_cli integer;
BEGIN
	
	insert into cliente (nome_cliente, data_de_registro)
	values (NEW.nome_cliente, CURRENT_TIMESTAMP);
	id_cli := (SELECT MAX(id_cliente) FROM cliente);
	insert into veiculo (placa,marca, modelo, id_cliente) 
	values (NEW.placa,NEW.marca, NEW.modelo, id_cli);			
	RETURN NEW;							
END;
$$ LANGUAGE plpgsql SECURITY DEFINER;
					  
CREATE TRIGGER cliente_veiculo INSTEAD OF
INSERT ON cliente_veiculo FOR EACH ROW EXECUTE
PROCEDURE cliente_veiculo();

--  Consulta  SQL  que  envolva no mínimo uma operação JOIN  (0,5):

select id_cliente, nome_cliente from cliente cli NATURAL JOIN servico ser where ser.id_servico != 1; -- Clientes que compraram algum produto

