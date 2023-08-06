package atvd16_17;
import java.util.Scanner;
public class atvd10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int num1, num2;
		
		System.out.println("Digite o 1º Nº");
		num1 =scan.nextInt();
		
		System.out.println("Digite o 2º Nº");
		num2 =scan.nextInt();
		
		
			if(num1 < num2) {
				System.out.println("Numeros entre " + num1 +" e " + num2);
				for(i=num1; i<=num2;i++) {
					System.out.println(i);
				}
			}else if(num2<num1) {
				System.out.println("Numeros entre " + num1 +" e " + num2);
				for(i=num2; i<=num1;i++) {
					System.out.println(i);
				}
			}
		
	}

}
