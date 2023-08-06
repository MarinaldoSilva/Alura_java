package atvd16_17;
import java.util.*;
public class atvd1 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int nota;
		boolean notaValida =false;
		
		System.out.println("Digite uma nota entre zero e dez (0 - 10)");
		
		do {
			nota = scan.nextInt();
			if( nota >= 0 && nota <= 10) {
				System.out.println("Nota valida");
				notaValida = true;
			}else {
				System.out.println("Nota invalida, digite novamente.");
			}
			
		}while(!notaValida);
		
		
	} 
	
		
		
}
