package br.com.classes;

public class Diaristas extends Pessoa{
	
	private String chavePix;
	
	
	public void atender(String nomeCliente) {
		
		System.out.println("Realizando Artendimento para cliente: " + nomeCliente);
	}


	public String getChavePix() {
		return chavePix;
	}


	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}


	@Override
	public void sacar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}


	@Override
	public void depositar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);
		
	}
	



}
