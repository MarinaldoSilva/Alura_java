package atvd16_17;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Atvd17_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();

		double PopulacaoBrasil,PopulacaoRussia,taxaDeCrescimentoBrasil,taxaDeCrescimentoRussia;		
		int anos = 0;
		
		String ResultadoBrsil;
		String ResultadoRussia;
		
		
		System.out.println("Digite a população do Brasil: ");
		PopulacaoBrasil = scan.nextDouble();
		
		System.out.println("Digite a população da Russia: ");
		PopulacaoRussia = scan.nextDouble();
		
		System.out.println("Taxa de crecimento do Brasil");
		taxaDeCrescimentoBrasil = scan.nextDouble();
		System.out.println("Taxa de crescimeno da Russia");
		taxaDeCrescimentoRussia = scan.nextDouble();
		
		//se brasil menor
		if(PopulacaoBrasil<PopulacaoRussia) {
			
			while(PopulacaoBrasil<PopulacaoRussia) {
				
				PopulacaoBrasil += PopulacaoBrasil *taxaDeCrescimentoBrasil /(100);
				PopulacaoRussia += PopulacaoRussia * taxaDeCrescimentoRussia /(100);
				anos++;
			
			}
			
			System.out.println("anos: " + anos);
			ResultadoBrsil = String.format("%.0f",PopulacaoBrasil);
			ResultadoRussia = String.format("%.0f",PopulacaoRussia);
			
			System.out.println("Barsil: " + ResultadoBrsil);
			System.out.println("Russia: " + ResultadoRussia);
			System.out.println("Vai demorar " + anos + " anos Para o Brasil superar a população da Russia");
		
			//se russia menor
		}else {
			while(PopulacaoRussia<PopulacaoBrasil) {
				
				PopulacaoBrasil += PopulacaoBrasil * taxaDeCrescimentoBrasil /(100);
				PopulacaoRussia += PopulacaoRussia * taxaDeCrescimentoRussia /(100);
				anos++;
			
			}
			
			System.out.println("anos: " + anos);
			ResultadoBrsil = String.format("%.0f",PopulacaoBrasil);
			ResultadoRussia = String.format("%.0f",PopulacaoRussia);
			
			System.out.println("Barsil: " + ResultadoBrsil);
			System.out.println("Russia: " + ResultadoRussia);
			System.out.println("Vai demorar " + anos + " anos Para a Russia superar a população do Brasil");
		}
		
		
		
		
			
	}

}
