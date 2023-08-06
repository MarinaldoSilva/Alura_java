package atvd14_15;
import java.util.Scanner;
public class atvd15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			int lado1, lado2, lado3;
			
			int dia;
			dia = 30;
			
			System.out.println("Lado 1:");
			lado1 = scan.nextInt();
			
			System.out.println("Lado 2:");
			lado2 = scan.nextInt();	
		
		System.out.println("Lado 3:");
			lado3 = scan.nextInt();
			
			if(((lado1 + lado2)>lado3) || ((lado1 + lado3) > lado2)
					|| ((lado2 + lado3)>lado1)) {
				
				
				if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
					System.out.println("TRIANGULO EQUILATERO");
				}
				
				else if((lado1 != lado2 && lado1 !=lado3 && lado3 != lado2)) {
					System.out.println("TRIANGULO ESCALENO"); 
				}
				
				else if(lado1 == lado2 || lado1 == lado3 || lado3 == lado2 ) {
					System.out.println("TRIANGULO isósceles");
				}
				
				else {
					System.out.println("Não elegio para ser um triangulo");
				}
				
			}
		
	}
}
