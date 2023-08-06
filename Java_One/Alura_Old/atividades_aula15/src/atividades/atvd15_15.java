package atividades;
import java.util.Scanner;
public class atvd15_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double lado1,lado2,lado3;
		
		System.out.println("Digite o lado 1:");
		lado1 = scan.nextDouble();
		
		System.out.println("Digite o lado 2:");
		lado2 = scan.nextDouble();
		
		System.out.println("Digite o lado 3:");
		lado3 = scan.nextDouble();
			
		//verificar se é um trinagulo => lado1 + lado2 > lado3 || lado1 + lado3 > lado2	|| lado2 + lado3 > lado1
	
		if(lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1 ) {
			do {
			
			System.out.println();
			System.out.println("Para saber qual tipo de triangulo é necessário ter as seguintes caracteristicas:");
			System.out.println("A soma de quaisquer dos lados for maior que o terceiro lado.");
			System.out.println("exemplor: ladoA + ladobB > ladoC - neste caso é um triangulo.");
			
			System.out.println("Digite o lado 1:");
			lado1 = scan.nextDouble();
			
			System.out.println("Digite o lado 2:");
			lado2 = scan.nextDouble();
			
			System.out.println("Digite o lado 3:");
			lado3 = scan.nextDouble();
			
		}while(lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1 );
		
		}else {
			if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1 ) {
				System.out.println("Dados são qualificados para ser um triangulo");
				
				System.out.println("Definindo tipo de triângulo");
				System.out.println();
				
				//equilatero
				if(lado1 == lado2 && lado3 == lado2){
					System.out.println("Equilatero");
				}
				
				//isósceles
				else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1 || lado3 == lado2) {
					System.out.println("Isosceles");
				}
			
				//escaleno
				else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
					System.out.println("Escaleno");
				}
			}
		}
	}
}
