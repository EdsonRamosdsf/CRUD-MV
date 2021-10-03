package DesafioMV;

import java.util.Date;

public class Contas {
	private int id;
	private int idPessoa;
	private String DataInicioCliente;
	private int movimentacaoCredito;
	private int movimentacaoDebito;
	private double valorPagoMovimentacao;
	private double SaldoInicial;
	private double SaldoTotal;
	
	public Contas () {}
	
	public Contas (int id, int idPessoa, String DataInicioCliente, int movimentacaoCredito,int movimentacaoDebito, double valorPagoMovimentacao, double SaldoInicial, double SaldoTotal){
		this.id = id;
		this.idPessoa = idPessoa;
		this.DataInicioCliente = DataInicioCliente;
		this.movimentacaoCredito = movimentacaoCredito;
		this.movimentacaoDebito = movimentacaoDebito;
		this.valorPagoMovimentacao = valorPagoMovimentacao;
		this.SaldoInicial = SaldoInicial;
		this.SaldoTotal = SaldoTotal;
	}
	
	
	
	
	
	
	
	//GETS&SETS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getDataInicioCliente() {
		return DataInicioCliente;
	}
	public void setDataInicioCliente(String dataInicioCliente) {
		DataInicioCliente = dataInicioCliente;
	}
	public int getMovimentacaoCredito() {
		return movimentacaoCredito;
	}
	public void setMovimentacaoCredito(int movimentacaoCredito) {
		this.movimentacaoCredito = movimentacaoCredito;
	}
	public int getMovimentacaoDebito() {
		return movimentacaoDebito;
	}
	public void setMovimentacaoDebito(int movimentacaoDebito) {
		this.movimentacaoDebito = movimentacaoDebito;
	}
	public double getValorPagoMovimentacao() {
		return valorPagoMovimentacao;
	}
	public void setValorPagoMovimentacao(double valorPagoMovimentacao) {
		this.valorPagoMovimentacao = valorPagoMovimentacao;
	}
	public double getSaldoInicial() {
		return SaldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		SaldoInicial = saldoInicial;
	}
	public double getSaldoTotal() {
		return SaldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		SaldoTotal = saldoTotal;
	}
	
	
}
