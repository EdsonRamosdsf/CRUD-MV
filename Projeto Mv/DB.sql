create procedure mudarEndereco
@id int,
@endereco varchar (60)
as
	update Cliente
	set endereco = @endereco
	where id = @id


select * from PESSOAS;