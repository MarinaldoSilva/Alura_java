package atvd16_17;
import java.util.Scanner;
public class atvd8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i;
		double acumulador = 0;
		int num;
		
		for(i=0;i<5;i++) {
			System.out.println("Digite o número da posição " +i);
			num = scan.nextInt();
			acumulador += + num;
		}
		
		num = (int) (acumulador/5);
		System.out.println("A soma dos termos é: " + acumulador);
		System.out.println("A média dos números digitados é: " +num);
	}

}
