package atvd16_17;
import java.util.Scanner;
public class Atvd17_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroInicial, numeroFinal;
		
		System.out.println("Digite o numero para inicial:");
		numeroInicial = scan.nextInt();
		
		System.out.println("Digite o numero para Final:");
		numeroFinal= scan.nextInt();
		
		System.out.println("Números presentes entre " +  numeroInicial + " e " + numeroFinal + " são:");
		for(int i = numeroInicial; i<= numeroFinal;i++) {
			System.out.println(i);
		}

	}

}
