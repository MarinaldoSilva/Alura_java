package br.com.pacotes.teste.classes;

public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("iniciando conexao teste");
	}

	public static void lerDados() {
		System.out.println("recebendo dados");
		throw new IllegalStateException("erro em ler dados");
	}

	@Override
	public void close() {
		System.out.println("autoclose");
	}
}
