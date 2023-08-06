package atvd16_17;
import java.util.Scanner;
public class Atvd17_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroBaseTabuada;
		boolean infoValidas = false;
		
		System.out.println("Digite um numero entre 1 e 10:");	
		
		do {
				numeroBaseTabuada = scan.nextInt();				
				System.out.println("verificando se os numeros estão entre 1 e 10");
				
				if(numeroBaseTabuada<0 || numeroBaseTabuada>10) {
					System.out.println("Numero '" + numeroBaseTabuada + "' invalido");
					System.out.println("Digite novamente um numero entre 1 e 10:");
				}else {
					System.out.println("numero valido");
					System.out.println();
					System.out.println("Gerando Tabuada");
					System.out.println();System.out.println();System.out.println();System.out.println();
					System.out.println();System.out.println();System.out.println();System.out.println();
					infoValidas= true;
				}
				
		}while(!infoValidas);
		
		System.out.println("--------TABUADA DO NUMERO " + numeroBaseTabuada + "------------");
		System.out.println("----------------------------------------");
		
		for(int i = 0; i<=10;i++) {
			System.out.println(i + " X " + numeroBaseTabuada + " = " + (i*numeroBaseTabuada));
		}
	}

}
