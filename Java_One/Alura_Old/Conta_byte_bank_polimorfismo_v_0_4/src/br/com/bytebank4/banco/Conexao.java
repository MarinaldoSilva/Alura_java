package br.com.bytebank4.banco;
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("iniciando conexao");
		
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
