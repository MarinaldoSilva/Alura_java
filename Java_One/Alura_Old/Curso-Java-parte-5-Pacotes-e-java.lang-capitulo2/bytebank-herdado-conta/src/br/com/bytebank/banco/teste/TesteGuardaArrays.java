package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardaArrays {
	
	public static void main(String[] args) {
		
		GuardaContas guardador = new GuardaContas();
	
		Conta conta1 = new ContaCorrente(247, 15488);
		Conta conta2 = new ContaCorrente(247, 25486);
		
		guardador.adicionar(conta1);
		guardador.adicionar(conta2);
		
		Conta verificarConteudoDoArrayNaPosicao = guardador.getReferecia(1);
		
		System.out.println(verificarConteudoDoArrayNaPosicao);
		
		System.out.println(verificarConteudoDoArrayNaPosicao.getNumero());
		
		int qntContasCriadas = guardador.qntdContasCriadas();
		System.out.println("qnd de contas criadas : " + qntContasCriadas);
		

		
		
	
		
		
	}
	
}
