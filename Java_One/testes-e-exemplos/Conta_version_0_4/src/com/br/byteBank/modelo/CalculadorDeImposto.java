package com.br.byteBank.modelo;

public class CalculadorDeImposto {
	
	private double somaTotalImposto;//um acumulador
	
	public double registaImpostos(Tributavel tributos){
		return somaTotalImposto += tributos.getValorImposto();
	}
	//recebe um obj do tipo tributavel e esse obj acessa o metodo getValorImposto() de quem o invoca;
	//esse metodo esta presente tbm em segurodevida e contaCorrente. Quando acessa esse obj de tributo ele recebe um parametro(esta em TesteCalcImposto.java
	//do tipo que assinou o contrato com a interface, e quando se assina um contrato com uma interface a parte contratante é obrigada a reescrever todos
	//os metodos presentes na interface. Então quando fazemos "calc.registaImpostos(sv);" estamos dizendo que calc vai acessar seu metodo registraImposto
	//e recebe um tributavel ou alguém que assinou o contrato e esse alguém é obgrigado a reescrever seus metodos e com isso o atributo recebido por parametro 
	//acesso o seu metodo reescrito e retorna o valor
	
	public double getTotalImposto() {
		//System.out.println(somaTotalImposto);
		return somaTotalImposto;
	}
	
}
