package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferenciasObjetc {

	public static void main(String[] args) {
		
		GuardadorReferencias gr = new GuardadorReferencias(); 
	
		Conta conta1 =  new Conta(12, 150);
		Conta conta2 =  new Conta(11, 149);
		
		gr.adicionarContas(conta1);
		gr.adicionarContas(conta2);
		
		int qndContasCriadas = gr.quantidadeDeContasCriadas();
		
		 Conta InformacoesDoArrayNoIndice = (Conta) gr.recuperarInformacoesDoArray(0);
		 System.out.println(InformacoesDoArrayNoIndice);
	
		System.out.println("Quantidade de contas criadas : " + qndContasCriadas);
	
	}

}
