package modelo;

public class Conectar implements AutoCloseable {
	
	public Conectar(){
		System.out.println("iniciando conexão");
	}
	
	public void lerDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException("erro de estado, sem conexão com o banco");
	}

	@Override
	public void close() throws Exception {
		System.out.println("fechando com o close.");
	}

	
}
