package atvd14_15;
import java.util.Scanner;
public class atvd14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double nota1, nota2, media;
		String conceito = "";
				
		System.out.println("Digite a primeira nota:");
		nota1 = scan.nextDouble();
		System.out.println("Digite a primeira nota:");
		nota2 = scan.nextDouble();
		
		media = ((nota1 + nota2)/2);
		
		if(media >= 9 && media <=10) {
			conceito = "A";
		}
		else if(media >= 7.5 && media <=9) {
			conceito = "B";
		}
		else if(media >= 6 && media <=7.5) {
			conceito = "C";
		}
		else if(media >= 4 && media <=6) {
			conceito = "D";
		}
		else if(media >= 4 && media <=0) {
			conceito = "E";
		}
		
		System.out.println("MÉDIA DE APROVEITAMENTO - CONCEITO");
		System.out.println("Notas:" + nota1 + " + " + nota2 +" = " + "media" + media);
		System.out.println("Classificação de Conceito: " + conceito);	
		
		switch(conceito) {
			case "A":
			case "B":
			case "C":System.out.println("APROVADO");break;
			case "D":
			case "E":System.out.println("REPROVADO");break;	
		}
	}
}
