package atvd16_17;
import java.util.Scanner;
public class atvd12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i =0;
		int num;
		
		System.out.println("Entre com o Nº para gerar a tabuada:");
		num = scan.nextInt();
		
		System.out.println("Grenado tabuada do nº " + num);
		for(i=0;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		
	}

}
