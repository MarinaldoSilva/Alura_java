package Banco;

public class TesteSi {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Administrador adm = new Administrador();
		Cliente cliente = new Cliente();
		Sistema_Interno si = new Sistema_Interno();	
		
		cliente.setTrocaSenha(2021);
		gerente.setSenha(0);
		adm.setSenha(200);
		
		
		si.autenticarSenha(adm);
		System.out.println("");
		si.autenticarSenha(gerente);
	
		

	}

}
