CREATE DATABASE ProjetoMV;

CREATE TABLE Cliente(
	id int primary key identity,
	nome varchar (50),
	rg int,
	endereco varchar (60),
	cnpj varchar (50),
	telefone int,
	cep int
);

insert into Cliente values
('x',1111,'primeiroEndereco','',1100110,511111,10101010),
('y',2222,'segundoEndereco','',2200220,512222, 20202020),
('z',0,'terceiroEndereco','00001111',3300330,512222, 0)

alter table Cliente add cpf int;

select * from Cliente;

delete  from Cliente where id = 6;

CREATE TABLE Contas(
	id int primary key identity not null,
	idPessoa int foreign key REFERENCES Cliente(id),
	DataInicioCliente date,
	movimentacaoCredito int,
	movimentacaoDebito int,
	ValorPagoMovimentacao money,
	SaldoInicial money,
	SaldoTotal money
);
ALTER TABLE Contas ALTER COLUMN DataInicioCliente date


select * from Contas;

insert into Contas values
(2,'2001/09/09',5,2,0,15.00,5.00),
(3,'2004/03/03',3,1,0,15.00,5.00),
(3,'2002/02/02',0,3,0,20.00,10.00)


create procedure mudarEndereco
@id int,
@endereco varchar (60)
as
	update Cliente
	set endereco = @endereco
	where id = @id

execute mudarEndereco
 1,novoEndereco
 