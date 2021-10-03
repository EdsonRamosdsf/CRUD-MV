package DesafioMV;

public class Cliente {
	
	private String nome;
	private int rg;
	private int cpf;
	private String endereco;
	private String cnpj;
	private int telefone;
	private int cep;
	
	public Cliente (){
		
	}
	
	public Cliente (String nome, int rg, int cpf, String endereco,String cnpj, int telefone, int cep){
		this.nome=nome;
		this.rg=rg;
		this.cpf=cpf;
		this.endereco=endereco;
		this.cnpj=cnpj;
		this.telefone=telefone;
		this.cep=cep;
		
	}
	
	




	//GETS&SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
}
