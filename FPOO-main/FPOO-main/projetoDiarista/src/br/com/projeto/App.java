package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diaristas;

public class App {

	public static void main(String[] args) {
		
		Diaristas diarista = new Diaristas();
		
		
		diarista.setNome("Cauã");
		diarista.setTelefone("(11)9998-7609");
		diarista.setEndereco("Av Cajamar N 111");
		diarista.setChavePix("123");
		
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereco());
		System.out.println("Chave Pix Diarista: " + diarista.getChavePix());
		diarista.atender("Maria");
		System.out.println("Saldo Cliente: " + diarista.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo Saldo: " + diarista.getSaldo());
		diarista.sacar(20);
		System.out.println("Saque: " + diarista.getSaldo());
		
		
		System.out.println("===========================");
		Cliente cliente = new Cliente();
		
		cliente.setNome("Maria");
		cliente.setTelefone("(11)9008-7609");
		cliente.setEndereco("Av Getulio Vargas");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereco());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo Saldo: " + cliente.getSaldo());
		cliente.sacar(20);
		System.out.println("Saque: " + cliente.getSaldo());
		
		System.out.println("===========================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(0);
		System.out.println(atendimento.getHoras());

	}

}
