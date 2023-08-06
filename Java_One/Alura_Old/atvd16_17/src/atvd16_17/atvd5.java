package atvd16_17;
import java.util.Scanner;
public class atvd5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a;
		double b;
		double taxa1;
		double taxa2;
		boolean valido = false;	
		int count = 0;
			
//população A validação se acima de 0
		do {
			System.out.println("População A:");
			a= scan.nextDouble();
			
			if(a >0) {
				valido = true;
			}else {
				System.out.println("Valor da população tem que ser maior que 0");
			}
			
		}while(!valido);
		
//população B validação se acima de zero
		
		valido = false;
		
		do {
			System.out.println("População B:");
			b= scan.nextDouble();
			
			if(b >0) {
				valido = true;
			}else {
				System.out.println("Valor da população tem que ser maior que 0");
			}
		}while(!valido);	
		
		//validando a taxa de crescimento de A
		
		do {
			System.out.println("Taxa de crescimento da população A:");
			taxa1= scan.nextDouble();
			
			if(taxa1 >0) {
				valido = true;
			}else {
				System.out.println("Valor da taxa tem que ser maior que 0");
			}
		}while(!valido);	
		
		//validando a taxa de crescimento de B
		
		
		do {
			System.out.println("Taxa de crescimento da população B:");
			taxa2= scan.nextDouble();
			
			if(taxa2 >0) {
				valido = true;
			}else {
				System.out.println("Valor da taxa tem que ser maior que 0");
			}
		}while(!valido);	
		
		//realizando o calculo
		
		while(a<b) {
			a += (a/100)*taxa1;
			b += (b/100)*taxa2;
			count ++;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(count);
		
	}
}
