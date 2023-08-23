package br.com.alura.conversor.moedas.modelo;
import java.util.*;

public class Conversor {
	
	public static void ExibirMenu() {
		
		System.out.println("***********************");
		System.out.println("* Conversor de moedas *");
		System.out.println("* 1 - Real para Dolar *");
		System.out.println("* 2 - Real para Euro  *");
		System.out.println("* 0 - Para sair       *");
		System.out.println("***********************");
	}
	
	public static void CalcCotacao(double cotacao, double real) {
		double moedaEstrangeira = real / cotacao;
		System.out.printf("%.2f", moedaEstrangeira );
	}
	
	public static void EscolherOpcoes() {
		 
		 Scanner scan = new Scanner(System.in);
		 int opcao;
		 double real, cotacao;
		 boolean valorVailido = false;
		 
		 System.out.println("Digite a opção desejada");
		 
		 do{
			 
			 opcao = scan.nextInt();
			 switch(opcao) {
				
			 case 0: 
				 
				 System.out.println("Que pena que você quer sair, até breve!");
				 valorVailido = true;
				 System.exit(0);
				 break;
				 
			case 1: 
				System.out.println("Conversor de Real para dolar Eua");
				
				System.out.println("Digite o valor em reais");
				real = scan.nextDouble();
				
				System.out.println("Digite o valor em dolar ");
				cotacao = scan.nextDouble();
				
				System.out.print("Dolar: " );
				Conversor.CalcCotacao(cotacao,real);
				break;
			
			case 2: 
				
				System.out.println("Conversor de Real para Euro");
				System.out.println("Digite o valor em reais");
				real = scan.nextDouble();
				System.out.println("Digite o valor em Euro");
				cotacao = scan.nextDouble();
				System.out.print("Euros: " );
				Conversor.CalcCotacao(cotacao,real);
				break;
				 
			default : System.out.println("Escolher uma opção valida");break;
				
				}
			 System.out.println(); 
			 	Conversor.ExibirMenu();
			 System.out.println(); 
			 
			}while(!valorVailido);
		 
		 scan.close();
	 }
}
