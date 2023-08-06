package Conta_Update;

public class TestaBank {

	public static void main(String[] args) {
		
		//criando um cliente e definindo seus atributos
		Cliente mario = new Cliente();
		Cliente joana = new Cliente();
		Endereco enderecoPessoaFisica = new Endereco();
		Renda rendaPessoaFisica = new Renda();
		
		joana.nome = "Joana";
		
		
		mario.nome = "Marinaldo Silva de Santana";
		mario.cpf = "70099007444";
		mario.profissao = "Programador";
		mario.estadoCivil = "Casado";
		//neste caso, inicializamos um novo endereço dentro da classe cliente, então, toda vez que criarmos um cliente novo, ele automaticamento tera um
		//endereço, e seus atributos associados a classe Endereco();
		mario.endereco.bairro = "CRUZ";
		enderecoPessoaFisica.estado = "pernambuco";
		enderecoPessoaFisica.cidade = "igarassu";
		enderecoPessoaFisica.cep = 53625448;
		enderecoPessoaFisica.bairro = "Rua Maria Regina";
		enderecoPessoaFisica.numeroCasa = 69;
		enderecoPessoaFisica.rua = "pernambuco";
		rendaPessoaFisica.rendaFixa = 2007;
		rendaPessoaFisica.rendaVariavel = 250; 
		
		//Criando uma nova conta para vincular o cliente a conta.
		Conta conta = new Conta();
		Conta contaJoana = new Conta();
		
		conta.depositar(100);
		
		conta.transferir(15, contaJoana);
		
		//link da nossa conta acessando o objto do tipo 'titular' que é um objeto do tipo cliente
		//o tipo cliente tem aceso a nome, cpf, profissão e etc...
		//e qnd conta acessa titular o titular tem os atributos do tipo cliente
		//inicializamos um objt do tipo cliente 'mario' e definimos os dados como nome, cpf e etc..
		//para linkar é só vincular 'conta.titular = mario;' ja que mario como visto acima já tem todos os atributos definidos.
		
		conta.titular = mario;
		System.out.println("Saldo de : " + conta.titular.nome + " é R$ " + conta.getSaldo());
		//conta.titular = joana;
		
		System.out.println("Nome: " + conta.titular.nome);
		System.out.println("CPF: " + conta.titular.cpf);
		System.out.println("Profissão: " + conta.titular.profissao);
		System.out.println("Estado Civil: " + conta.titular.estadoCivil);
		System.out.println("Estado : " + enderecoPessoaFisica.estado);
		System.out.println("Cidade : " + enderecoPessoaFisica.cidade);
		System.out.println("Bairro : " + enderecoPessoaFisica.bairro);
		System.out.println("Rua : " + enderecoPessoaFisica.rua);
		System.out.println("Número casa : " + enderecoPessoaFisica.numeroCasa);
		System.out.println("CEP : " + enderecoPessoaFisica.cep);
		
		System.out.println("ESSA É UMA SEGUNDA FORMA DE CRIAR UM ENDEREÇO INICIALIZANDO UM NOVO ENDEREÇO NA CLASSE CLIENTE"
				+ "" + mario.endereco.bairro);
		
		
		
	}

}
