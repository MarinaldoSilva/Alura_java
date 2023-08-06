package testeExcecao;

public class Teste2 {
	
	public static void main(String[] args) throws MinhaExcecao {
		System.out.println("inicio main");
		
		try {
			metodo1();
		}
		
		catch(MinhaExcecao e) {
			System.out.println("e.getMessage() - mostra o erro, que neste caso é personalizado por nós-> " + e);
			System.out.println("e.printStackTrace() - mostra o caminho da pilha logo abaixo");
			e.printStackTrace();
		}
	}
	
	private static void metodo1() throws MinhaExcecao{
		System.out.println("inicio metodo 1");
		metodo2();
		System.out.println("fim metodo 1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("inicio metodo 2");
//		for(int i =0; i< 10; i++) {
//			System.out.println("valor de i = " + i);
//			int a  = i/0;		
//		}
		MinhaExcecao e =  new MinhaExcecao("divisão por zero");
		throw e;
		//criando um obj da classe ArithmeticException
		//pegando o obg tipo ArithmeticException (excecao) e diz que a a exception 
		//vai cair em cima da pilha, não somente em cima do metodo chamado;
		
		
		//throw new MinhaExcecao("sua mensagem aqui");
		//tbm pode ser escrito assim, na hora da instacialização com o new, pegamos a referencia do obj criado na memoria e jogamos
		//na pilha, criando uma bomba e fazendo a aplicação parar de maneira abrupta até achar um local no cod onde se tem o tratamento 
		// que neste caso é o try{}catch(){}
		
	}
	
	
}
//
//try {
//	int a = 10/0 *0;
//}catch(MinhaExcecao e) {
//System.out.println(e);
//}
//