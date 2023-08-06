package atvd16_17;
import java.util.Scanner;

public class Atvd17_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroScanner;
		int acumulador = 0;
		int media;
		
		for(int i =0; i< 5; i++) {
			
			System.out.println("Digite um numero: ");
			numeroScanner = scan.nextInt();
			
			acumulador += numeroScanner;
			
		}
		
		System.out.println("Soma dos termos: " +  acumulador);
		media = acumulador/5;
		System.out.println("Media dos termos: " + media);
		
		

	}

}
