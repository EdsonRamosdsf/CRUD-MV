package DesafioMV;

import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	public static String cliente, x1data, y1data, z1data, dataInicioX, dataInicioY, dataInicioZ;
	public static double totalMov, totalContaX, totalContaY, totalContaZ;
	public static int selecao, totalMovimentacaoX;
	public static float vmovimentacao;
	
	public static void testandoConexao () {
		String query = "select * from contas;";
		try {
			ResultSet rs = CNXJDBC.stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		
		// Sets manual , Não consegui conectar o db
		
		
		Cliente y = new Cliente(null, 0, 0, null, null, 0, 0);
		y.setNome("y");
		y.setCep(1111);
		y.setCpf(111111111);
		y.setEndereco("primeiroEndereco");
		y.setRg(1101);
		y.setTelefone(1212);

		Cliente x = new Cliente(null, 0, 0, null, null, 0, 0);
		x.setNome("x");
		x.setCep(2222);
		x.setCpf(222222222);
		x.setEndereco("segundoEndereco");
		x.setRg(2202);
		x.setTelefone(0012);

		Cliente z = new Cliente(null, 0, 0, null, null, 0, 0);
		z.setNome("z");
		z.setCep(3333);
		z.setCpf(0);
		z.setEndereco("TerceiroEndereco");
		z.setRg(0);
		z.setTelefone(0013);
		z.setCnpj("00001111");
		
		Contas x1 =new Contas ();
		x1.setId(1);
		x1.setIdPessoa(1);
		x1.setDataInicioCliente("20/12/2000");
		x1data = x1.getDataInicioCliente();
		dataInicioX = x1.getDataInicioCliente();
		x1.setMovimentacaoCredito(20);
		x1.setMovimentacaoDebito(10);
		calcularMovimentacao (x1.getMovimentacaoCredito(),x1.getMovimentacaoDebito());
		x1.setValorPagoMovimentacao(vmovimentacao);
		x1.setSaldoInicial(200.00);
		x1.setSaldoTotal(x1.getSaldoInicial()-totalMov);
		
		Contas x2 =new Contas ();
		x2.setId(2);
		x2.setIdPessoa(1);
		x2.setDataInicioCliente("10/11/2010");
		x2.setMovimentacaoCredito(2);
		x2.setMovimentacaoDebito(0);
		calcularMovimentacao (x2.getMovimentacaoCredito(),x2.getMovimentacaoDebito());
		x2.setValorPagoMovimentacao(vmovimentacao);
		x2.setSaldoInicial(100.00);
		x2.setSaldoTotal(x2.getSaldoInicial()-totalMov);
		
		Contas x3 =new Contas ();
		x3.setId(3);
		x3.setIdPessoa(1);
		x3.setDataInicioCliente("09/09/2001");
		x3.setMovimentacaoCredito(5);
		x3.setMovimentacaoDebito(2);
		calcularMovimentacao (x3.getMovimentacaoCredito(),x3.getMovimentacaoDebito());
		x3.setValorPagoMovimentacao(vmovimentacao);
		x3.setSaldoInicial(150.00);
		x3.setSaldoTotal(x3.getSaldoInicial()-totalMov);
		
		totalContaX = x1.getSaldoTotal()+x2.getSaldoTotal()+x1.getSaldoTotal(); 
	

		
		Contas y1 =new Contas ();
		y1.setId(4);
		y1.setIdPessoa(2);
		y1.setDataInicioCliente("09/09/2001");
		y1data = y1.getDataInicioCliente();
		dataInicioY = y1.getDataInicioCliente();
		y1.setMovimentacaoCredito(5);
		y1.setMovimentacaoDebito(2);
		calcularMovimentacao (y1.getMovimentacaoCredito(),y1.getMovimentacaoDebito());
		y1.setValorPagoMovimentacao(vmovimentacao);
		y1.setSaldoInicial(150.00);
		y1.setSaldoTotal(y1.getSaldoInicial()-totalMov);
		
		totalContaY = y1.getSaldoTotal();
		
		Contas z1 =new Contas ();
		z1.setId(5);
		z1.setIdPessoa(3);
		z1.setDataInicioCliente("03/03/2001");
		dataInicioZ = z1.getDataInicioCliente();
		z1.setMovimentacaoCredito(3);
		z1.setMovimentacaoDebito(1);
		calcularMovimentacao (z1.getMovimentacaoCredito(),z1.getMovimentacaoDebito());
		z1.setValorPagoMovimentacao(vmovimentacao);
		z1.setSaldoInicial(150.00);
		z1.setSaldoTotal(z1.getSaldoInicial()-totalMov);
		
		Contas z2 =new Contas ();
		z2.setId(6);
		z2.setIdPessoa(3);
		z2.setDataInicioCliente("02/02/2002");
		z1data = z1.getDataInicioCliente();
		z2.setMovimentacaoCredito(0);
		z2.setMovimentacaoDebito(3);
		calcularMovimentacao (z2.getMovimentacaoCredito(),z2.getMovimentacaoDebito());
		z2.setValorPagoMovimentacao(vmovimentacao);
		z2.setSaldoInicial(200.00);
		z2.setSaldoTotal(z2.getSaldoInicial()-totalMov);
		
		double totalContaZ = z1.getSaldoTotal()+z2.getSaldoTotal(); 
		
		Date dataAtual = new Date ();
		
		
		
		String mensagem = "\nSelecione uma opção:";
		boolean periodo;
		
		telaInicial();
		System.out.println(mensagem);
		selecao = sc.nextInt();
		if (selecao == 5) {
		
			testandoConexao ();
		}
		if (selecao == 1) {
			telaC();
			System.out.println(mensagem);
			selecao = sc.nextInt();
			if (selecao == 1) {
				relSaldoTodosClientes();
			} else {
				telaClienteE();
				System.out.println(mensagem);
				selecao = 0;
				selecao = sc.nextInt();
				if (selecao == 1) {
					periodo = true;
				} else {
					periodo = false;
				}
				telaClienteEspecifico();
				System.out.println(mensagem);
				selecao = sc.nextInt();
				if (selecao == 1) {
					cliente = x1data;
				} else if (selecao == 2) {
					cliente = y1data;
				} else if (selecao == 3) {
					cliente = z1data;
				}
				if (periodo) {
					relSaldoClientePeriodo();
				} else {
					relSaldoCliente();
				}
			}
		} else if (selecao == 2) {
			relReceitaEmpresa();
		}
		
		
	}
	public static void calcularMovimentacao (int valor1, int valor2) {
		double valorSoma = 0;
	 		vmovimentacao = 0;
	 		valorSoma = valor1 + valor2;
			if (valorSoma <= 10 ) {
				vmovimentacao = 1.00f;
			} else 
				if (valorSoma > 10 && valorSoma <= 20 ) {
					vmovimentacao = 0.75f;
				} else
					if (valorSoma > 20) {
						vmovimentacao = 0.50f;
					}
			
			 	totalMov = valorSoma*vmovimentacao;
			 	
	}

	// TELAS
	public static void telaC() {
		System.out.println("---------- tipo de Cliente ----------");
		System.out.println("--------------------------------------");
		System.out.println("-1. Todos os Clientes ----------------");
		System.out.println("-2. Cliente Específico ---------------");
		System.out.println("-0. voltar ---------------------------");
		System.out.println("--------------------------------------");
	}

	public static void telaClienteE() {
		System.out.println("---------- tipo de Cliente ----------");
		System.out.println("--------------------------------------");
		System.out.println("-1. com período ----------------------");
		System.out.println("-2. Sem período -----------------------");
		System.out.println("--------------------------------------");
		System.out.println(" ---------------------------------------");
		System.out.println("--------------------------------------");
	}

	public static void telaClienteEspecifico() {
		System.out.println("---------- tipo de Cliente ----------");
		System.out.println("--------------------------------------");
		System.out.println("-1. x --------------------------------");
		System.out.println("-2. y ---------------------------------");
		System.out.println("-3. z ---------------------------------");
		System.out.println("-0. voltar ---------------------------");
		System.out.println("--------------------------------------");
	}

	public static void relSaldoClientePeriodo() {

		System.out.println("-- Relatório Saldo Cliente e período ----");
		System.out.println("------------------------------------------");
		System.out.println("Período:"+cliente+" a DD/MM/YYYY --------");
		System.out.println("Cliente: X - Cliente desde: "+cliente+"-");
		System.out.println("Endereço: Rua, número, complemento, bairro, cidade, UF, CEP");
		System.out.println("Cliente: X - Cliente desde: DD/MM/YYYY");
		System.out.println("Movimentações de crédito: 00 ------------");
		System.out.println("Movimentações de débito: 0 --------------");
		System.out.println("Total de movimentações: 00 ---------------");
		System.out.println("Valor pago pelas movimentações: 00,00 ----");
		System.out.println("Saldo inicial: 0.000,00 -----------------");
		System.out.println("Saldo atual: 00.000,00 -------------------");
		System.out.println("------------------------------------------");
		System.out.println("-0. voltar -------------------------------");
	}

	public static void relSaldoCliente() {

		System.out.println("------ Relatório Saldo Cliente --------");
		System.out.println("-----------------------------------------");
		System.out.println("Cliente: X - Cliente desde: DD/MM/YYYY-");
		System.out.println("Endereço: Rua, número, complemento, bairro, cidade, UF, CEP");
		System.out.println("Cliente: X - Cliente desde: DD/MM/YYYY");
		System.out.println("Movimentações de crédito: 00 ------------");
		System.out.println("Movimentações de débito: 0 --------------");
		System.out.println("Total de movimentações: 00 ---------------");
		System.out.println("Valor pago pelas movimentações: 00,00 ----");
		System.out.println("Saldo inicial: 0.000,00 -----------------");
		System.out.println("Saldo atual: 00.000,00 -------------------");
		System.out.println("------------------------------------------");
		System.out.println("-0. voltar -------------------------------");
	}

	public static void relReceitaEmpresa() {
		System.out.println("Período: DD/MM/YYYY a DD/MM/YYYY");
		System.out.println("Cliente X - Quantidade de movimentações: - Valor das movimentações: R$ 0.000,00");
		System.out.println("Cliente Y - Quantidade de movimentações: 120 - Valor das movimentações: R$ 00.000,00");
		System.out.println("Cliente z - Quantidade de movimentações: 100 - Valor das movimentações: R$ 00.000,00");
		System.out.println("Total de receitas: R$ 00.000,00");
		System.out.println("--------------------------------------");
	
	}

	public static void relSaldoTodosClientes() {
		System.out.println("Cliente: X - Cliente desde:" + dataInicioX + " – Saldo em DD/MM/YYYY: " + totalContaX);
		System.out.println("Cliente: Y - Cliente desde: " + dataInicioY + " - Saldo em DD/MM/YYYY:" + totalContaY);
		System.out.println("Cliente: Z - Cliente desde: " + dataInicioZ + " - Saldo em DD/MM/YYYY:" + totalContaZ);
		System.out.println("-------------------------------------------------------------------");

	}

	public static void telaInicial() {
		System.out.println("---------- Empresa XPTO --------------");
		System.out.println("--------------------------------------");
		System.out.println("-1. Relatorio Cliente ----------------");
		System.out.println("-2. Relatório de receita da empresa --");
		System.out.println("--------------------------------------");

	}

}
