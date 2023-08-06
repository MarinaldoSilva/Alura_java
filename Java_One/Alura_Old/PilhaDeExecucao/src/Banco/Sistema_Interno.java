package Banco;

public class Sistema_Interno {
		
	LogicaAutenticacao validacao = new LogicaAutenticacao();
		
	public boolean autenticarSenha(FuncionarioAutenticado validarFuncionario) {
		if(validacao.autenticarSenha(validarFuncionario.getSenha())) {
			System.out.println("sistema interno liberado : ok");
			return true;
		} else {
			System.out.println("sistema interno: funcionario não validado");
			return false;
		}
	}
}