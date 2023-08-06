package br.com.bytebank.banco.teste;

import static java.lang.System.console;

public class TesteString {

	public static void main(String[] args) {
		String nome = "                 mario silva de santana ";	
		String vazio = "";
		char a = 'a';
		char b = 'A';
		
		System.out.println("Pega o caracter de acordo com"
				+ " o valor do index: " + nome.charAt(0));
		
		String newName = nome.replace("ma", "Ma");
		System.out.println("Trocando as letras com o replace: " + newName);

		newName = nome.replace(a, b);
		System.out.println("Trocando a letra 'a' minusculo "
				+ "por maiusculo :" +newName);
	
		int posicao = nome.indexOf(b);
		System.out.println("devolve a posição onde a string passada por "
				+ "parametro esta, no meu caso quero saber qual a posição "
				+ "da string da variavel 'b' = " + b + " : " + posicao);
	
		String sub = nome.substring(1);
		System.out.println("subtring mostra a string a partir de"
				+ " determinado index, neste exemplo a partir"
				+ " do caracter 1 : " + sub);
		int tamanhoString  = nome.length();
		System.out.println("retorna o tamnho da string ou array: " + tamanhoString);
	
		System.out.println("verifica se a string esta vazia e retorna um "
				+ "booleano: " + vazio.isEmpty());
		
		String newTrin = nome.trim();
		System.out.println("remove os espaços do inicio"
				+ " e do fim de uma string: " + newTrin);
		 
		System.out.println("verifica se  na"
				+ " string tem um deterimando caracter"
				+ " ou sequencia  de caracteres com a função 'contains()' e "
				+ "retorna um booleano : "
			 +	vazio.contains("sil") + " - " + vazio.contains(""));
		
		System.out.println();
		System.out.println("concatenar com builder.append() o sistema"
				+ " ganha em otimização veja a frase abaxio e dps o codigo");
		System.out.println();
		
		StringBuilder builder = new StringBuilder("Socorram");
		
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(builder.toString());
		
	}
}
