package atvd14_15;
import java.util.Scanner;
public class atvd16 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int a, b, c;
			double delta, x1, x2;
			
			System.out.println("Entre com o valor de A:");
			a = scan.nextInt();
						
			if(a ==0) {
				System.out.println("A equação não é do segundo grau.");
			} 
			else {
				System.out.println("Entre com o valor de B:");
				b = scan.nextInt();
				System.out.println("Entre com o valor de C:");
				c = scan.nextInt();
				
				delta = (b*b) -( 4 *a *c );
				if(delta < 0) {
					System.out.println("A equação não possui raizes reais, programa encerrado.");
				}
				else {
					x1 = ((-b) + Math.sqrt(delta) / (2*a));
					x2 = ((-b) - Math.sqrt(delta) / (2*a));
					
					System.out.println("Delta: " + delta);
					System.out.println("X1= " + x1);
					System.out.println("X2= " + x2);
				}
			}
			
		}
	}

}
