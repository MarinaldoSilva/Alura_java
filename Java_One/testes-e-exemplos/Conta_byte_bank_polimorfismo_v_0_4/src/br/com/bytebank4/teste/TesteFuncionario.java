package br.com.bytebank4.teste;

import br.com.bytebank4.banco.*;


public class TesteFuncionario {
	public static void main(String[] args) {
		
		ControleDeBonificacao bn = new ControleDeBonificacao();
		Gerente mario = new Gerente();
		Gerente maria = new Gerente();
		Gerente mariana = new Gerente();
		
		mario.setNome("Marinaldo");
		mario.setCpf("2007");
		mario.setCpf("70080060050");
		mario.setSalario(2600);
		mario.getBonificacao();
		
		
		maria.setSalario(1000);
		maria.getBonificacao();
		
		
		mariana.setSalario(2600);
		mariana.getBonificacao();
		
		bn.bonificacao(mario);
		
		System.out.println(mario.getBonificacao());
		System.out.println(maria.getBonificacao());
		System.out.println(mariana.getBonificacao());
		System.out.println(bn.getSoma());
		System.out.println(mario.getNome());
		System.out.println(mario.getBonificacao());
		System.out.println((bn.getSoma()));
	}
}
