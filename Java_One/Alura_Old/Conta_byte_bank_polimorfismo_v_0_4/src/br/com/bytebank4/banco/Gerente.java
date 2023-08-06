package br.com.bytebank4.banco;

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {		
		return super.getSalario();
	}
	
	public int getSenha() {
		return senha;
	}

	@Override
	public boolean setSenha(int senha) {
		return this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autenticarSenha(int senha) {
		return this.autenticador.autenticarSenha(senha);
	}
}

//1-reescrita do metodo bonificação em comparação do mesmo metodo da classe Funcionario
//2-qnd dizemos que é super.salario significa("salario vem da classe acima no caso funcionario")
//pois gerente extends de funcionario e esse super diz isso que a variavel vem da classe pai
//do mesmo modo o super.getBonificacao() pois se a classe funcionario é a classe padrão e bonificação tbm é padrã
//o gerente tem que receber a bonificação padrão + salario então semppre que vamos modificar algo na classe pai
//qnd invocamos super.metodoDaClassePai estamos explicitando que estamos pegando o valor/metodo da classe pai
//return super.getBonificacao() + (super.getSalario());