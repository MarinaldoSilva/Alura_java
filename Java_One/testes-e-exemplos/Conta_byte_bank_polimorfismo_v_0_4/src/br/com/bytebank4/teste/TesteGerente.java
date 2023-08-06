package br.com.bytebank4.teste;
import br.com.bytebank4.banco.*;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Autenticavel ac = new Cliente();
		ac.autenticarSenha(15);
		
		gerente.setNome("Mario");
		gerente.setSalario(5368);
		gerente.setSenha(1515);
		
		boolean validaSenha = gerente.autenticarSenha(1515);
		
		
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Bonificação: " + gerente.getBonificacao());
		System.out.println("Salário + bonificação: " + (gerente.getSalario() + gerente.getBonificacao()));
		System.out.println(validaSenha);

	}
}
