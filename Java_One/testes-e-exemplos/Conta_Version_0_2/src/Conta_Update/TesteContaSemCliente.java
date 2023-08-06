package Conta_Update;

public class TesteContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		System.out.println(contaDaMarcela.getSaldo());
		
		//podemos inicializar um novo cliente dessa forma, pois o atributo titular é do tipo cliente
		//então não é necessário criar uma variavel para inicializar 
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "marcela";
		
		System.out.println(contaDaMarcela.titular.nome); 
		System.out.println(contaDaMarcela.titular); 
		
	}
}
