package Conta_v3_get_set_e_construtores;

public class TestaValores {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(2399, 227587);
		Cliente cliente = new Cliente();
		
		cliente.setNome("Mario");
		cliente.setProfissao("dev");
		conta.setTitular(cliente);
		conta.getTitular().getNome();
		
		Cliente clienteM = new Cliente(); 
		conta.setTitular(clienteM);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getConta());
		System.out.println();
		System.out.println(cliente.getNome());
		
		cliente.setNome("Joana");
		System.out.println(cliente.getNome());
		cliente.setNome("Mario2");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getProfissao());
		
	}

}
