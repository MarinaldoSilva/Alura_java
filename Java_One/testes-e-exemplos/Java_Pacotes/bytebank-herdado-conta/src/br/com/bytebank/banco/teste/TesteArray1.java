package br.com.bytebank.banco.teste;

public class TesteArray1 {

	public static void main(String[] args) {
		
		//estrutura de dados simples e basica array
		int [] idades = new int[5];

		idades[0] = 147;
		idades[1] = 136;
		idades[2] = 114;
		idades[3] = 168;
		idades[4] = 157;
		
		try {
			for(int i=0; i <idades.length; i++) {
				System.out.println(idades[i]);
			}
			System.out.println("");
			 for(int i = 0; i < idades.length; i++) {
		            idades[i] = i * i;
		            System.out.println("posição " + i + ":" + idades[i]);
		        }
			
		}catch(RuntimeException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
