package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//crinado 5 refencias na memoria, porém não inicializada com valores padrões 
		//do tipo ContaCorrente que tem o valor padrão de 'null', pois não apontam para nenhum objt
		Object [] referencia = new Conta[5];
		
		//criando um obj do tipo ContaCorrente
		Conta cc1 = new ContaCorrente(10,30);
		ContaCorrente cc2 = new ContaCorrente(223, 2871);
		Conta cc3 = new ContaPoupanca(257, 698);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marinaldo");
		
		
		try{
			referencia[2] = cliente;
		}catch(Exception e) {
			System.out.println("erro: " + e.getMessage());
		}
		//vinculando esse obj a essa posição de memoria
		
		referencia[0] = cc1;;
		referencia[1] = cc2;
		referencia[2] = cc3;
		
		Object referenciaGenerica = referencia[2];
		System.out.println( ((Conta)referenciaGenerica).getNumero() );
		
		
		cc1.deposita(187);
		System.out.println( cc1.getSaldo() );
		System.out.println( referencia[1]);
		
		
		Conta ref = (ContaCorrente) referencia[0];//converte um tipo conta que é mais generico
		//em um objeto do tipo conta poupançam que é mais especifico, metodo conhecido com CASTING 
		
		//System.out.println("ref: " + ref);
		
	}

}
