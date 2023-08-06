package atividades;
import java.util.Scanner;
public class atvd15_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos Calcular raiz quadrada; Informe os dados solicitados");
		
		double a, b, c, delta;
		
		System.out.println("valor de A");
		a = scan.nextDouble();
		
		System.out.println("Valor de B");
		b = scan.nextDouble();
		
		System.out.println("Valor de C");
		c = scan.nextDouble();
				
		delta = b*b * (-4*-c);
		System.out.println(delta );
		//delta = b^2 - 4*a*(-c)
		
		System.out.println(delta);
		
		
		
		double divisao = 3.14;
		
		System.out.println(divisao/2);
		
	}

}
