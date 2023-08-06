package atvd16_17;
import java.util.Scanner;
public class atvd7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i=0;
		int maior = Integer.MIN_VALUE;//menor valor possível de um Integer
		int num;
		
		for(i =0; i<5; i++) {
			System.out.println("Digite a posição " + i);
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			
		}
		System.out.println("Maior valor é: " + maior);
		
	}
}
