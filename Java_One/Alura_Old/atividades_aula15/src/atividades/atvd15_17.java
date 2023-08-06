package atividades;
import java.util.Scanner;

public class atvd15_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um ano que já passou ou que ainda vai chegar para saber se é bissexto");
		int ano = scan.nextInt();
		
		
		//se ano % 4 ==0 e ano % 100 == 0 ou ano % 100 
		if((ano % 4 ==0) || (ano % 400 == 0)  && (ano % 100 != 0)){
			System.out.println("verdade");
		}else {
			System.out.println("falso");
		}
		
	}

}
