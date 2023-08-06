package Banco;

public class TesteAdm {

	public static void main(String[] args) {
		Administrador adm = new Administrador();
		Administrador adm1 = new Administrador();
		Sistema_Interno si = new Sistema_Interno();
		
		
		adm.setNome("Marinaldo");
		adm.setMatricula(154729);
		adm.setCpf("70824896302");
		adm.setSalario(2007);
		adm.setSenha(2020);
		
		adm1.setNome("Marinaldo1");
		adm1.setMatricula(1547290);
		adm1.setCpf("708248963020");
		adm1.setSalario(20070);
		adm1.setSenha(2020);
			
		System.out.println(adm.getNome());
		System.out.println(adm.getMatricula());
		System.out.println(adm.getCpf());
		System.out.println(adm.getSalario());
		si.validacao.autenticarSenha(adm.getSenha());
		System.out.println("-----------------------");
		System.out.println(adm1.getNome());
		System.out.println(adm1.getMatricula());
		System.out.println(adm1.getCpf());
		System.out.println(adm1.getSalario());
		si.validacao.autenticarSenha(adm1.getSenha());
		
		
		
		
	}

}
