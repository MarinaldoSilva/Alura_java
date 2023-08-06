package atividades;
import java.util.Scanner;
public class atvd15_14 {
	public static void main(String []agrs) {
		Scanner scan =  new Scanner(System.in);
		
		double nota1, nota2;
		
		System.out.println("Digite a sua primeira nota:");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a sua segunda nota:");
		nota2 = scan.nextDouble();
		
		double media = ((nota1 + nota2)/2);
		
		String conceito = "";
		
		//obtenção do conceito
		if(media >= 9 && media == 10) {
				conceito = "A";
		}else if(media >= 7.5 && media <= 9) {
			conceito = "B";
		}else if(media >= 6 && media <= 7.5 ) {
			conceito = "C";
		}else if(media >= 4 && media <= 6) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		//fim
		
		//De acordo com o conceito saber se foi aprovado
		switch(conceito) {
			
		case "A":
		case "B":
		case "C": System.out.println("APROVADO");break;
		case "D":
		case "E":System.out.println("REPROVADO");break;
		
		}
		
		//fim
		System.out.println();
		System.out.println("NOTA 1: " + nota1);
		System.out.println("NOTA 2: " + nota2);
		System.out.println("MEDIA: " + media);
		System.out.println("CONCEITO: " + conceito);
		
	}
}
