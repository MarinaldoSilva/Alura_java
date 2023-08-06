package atvd16_17;

import java.util.Scanner;

public class Atvd17_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro Nº");
		numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo Nº");
		numero2 = scan.nextInt();
		
		for(int i =numero1; i<=numero1;i++) {
			if(numero1 % 2 ==0) {
				System.out.println(numero1);
			}
		}
		
		for(int i = 0; i<=numero1;i++) {
			if(numero1%2 !=0) {
				System.out.println(numero1);
			}
		}
	}

}
