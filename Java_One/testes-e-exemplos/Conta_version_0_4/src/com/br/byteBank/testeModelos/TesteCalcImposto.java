package com.br.byteBank.testeModelos;

import com.br.byteBank.modelo.*;

//ctrl + shift + o importa todos os imports
public class TesteCalcImposto {

	public static void main(String[] args) throws AgenciaEcontaInvalidaException, SaldoInsuficienteException{
		SeguroDeVida sv = new SeguroDeVida();
		ContaCorrente cc = new ContaCorrente(2399, 227587);
		CalculadorDeImposto calc = new CalculadorDeImposto();
		seguroProtecaoVeicular seguroVeicular = new seguroProtecaoVeicular();
		
		cc.depositar(2548);
		sv.pagaMes(0);
		
		seguroVeicular.setValorDoSeguro(3546);
		calc.registaImpostos(seguroVeicular);
//		calc.registaImpostos(sv);
//		//calc.registraImposto(cc);
//		calc.registaImpostos(sv);
		System.out.printf("Valor pago de imposto: " + "%.2f ",  calc.getTotalImposto());
		System.out.println();
//		System.out.println("");

		System.out.println("veicular:" + calc.registaImpostos(seguroVeicular));
		
		//recebe um obj do tipo tributavel e esse obj acessa o metodo getValorImposto() de quem o invoca;
		//esse metodo esta presente tbm em segurodevida e contaCorrente. Quando acessa esse obj tributo ele recebe um parametro(esta em TesteCalcImposto.java
		//do tipo que assinou o contrato com a interface(Tributacao), e quando se assina um contrato com uma interface a parte contratante
		//é obrigada a reescrever todos os metodos presentes na interface.
		// Então quando fazemos "calc.registaImpostos(sv);" estamos dizendo que calc vai acessar seu metodo registraImposto e recebe um tributavel
		// Como ContaCorrente e seguroDeVida também assinou o contrato e eles são  obrigados a reescrever seus metodos
		//e com isso o atributo recebido por parametro acesso o seu metodo reescrito e retorna o valor
	}

}
