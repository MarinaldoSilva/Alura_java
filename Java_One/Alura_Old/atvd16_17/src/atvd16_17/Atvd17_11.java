package atvd16_17;
import java.util.Scanner;
public class Atvd17_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroInicial, numeroFinal, somaDosTermos = 0;
		
		System.out.println("Digite o numero para inicial:");
		numeroInicial = scan.nextInt();
		
		System.out.println("Digite o numero para Final:");
		numeroFinal= scan.nextInt();
		
		System.out.println("Números presentes entre " +  numeroInicial + " e " + numeroFinal + " são:");
		for(int i = numeroInicial; i<= numeroFinal;i++) {
			somaDosTermos += i;
		}
		
		System.out.println(somaDosTermos);
	}

}
