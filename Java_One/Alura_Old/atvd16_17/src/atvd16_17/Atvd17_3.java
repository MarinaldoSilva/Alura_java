package atvd16_17;
import java.util.Scanner;
public class Atvd17_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		double salario;
		int idade;
		boolean informacoesValidas= false;
			
		//nome
		do {
			System.out.println("Digite seu nome - tem que ser maior que 3 caracteres");
			nome = scan.nextLine();
		
			if(nome.length()<3) {
				System.out.println("O nome tem qe ter no minimo 3 letras");
				nome = scan.nextLine();
			}
			
			else {
				informacoesValidas= true;
			}
			
		}while(!informacoesValidas);
		
		//sexo
		
		informacoesValidas= false;
		do {
			System.out.println("Digite seu sexo - M ou F");
			sexo = scan.nextLine();
			
			if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				informacoesValidas = true;
			}
			else {
				System.out.println("Valores aceitos são somente M ou F");
			}
			
		}while(!informacoesValidas);
		
		
		//estado civil
		informacoesValidas= false;
		do {
			System.out.println("Digite seu estado Civil - Casado(a), solteiro(a), divorciado(a), viUva(a):");
			System.out.println();
			System.out.println("CASADO(A) = C");
			System.out.println("SOLTEIRO(A) = S");
			System.out.println("DIVORCIADO(A) = D");
			System.out.println("VIUVA(A) = V");
			estadoCivil = scan.nextLine();
			
			
			
			if(estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") ||
					estadoCivil.equalsIgnoreCase("D") || estadoCivil.equalsIgnoreCase("V")) {
				
				informacoesValidas = true;
				
			}
			else {
				System.out.println("Valores aceitos são somente C, S, D ou V");
			}
			
		}while(!informacoesValidas);
		
		
		//salario
		
		informacoesValidas= false;
		do {
			
			System.out.println("Digite sua idade - tem que ser maior que 5 anos");
			idade = scan.nextInt();
		
			if(idade > 5) {
				informacoesValidas= true;
			}
			
			else {
				System.out.println("A idade tem que ser no minimo 5 anos");
			}
			
		}while(!informacoesValidas);
		
		//idade
		informacoesValidas= false;
		do {
			
			System.out.println("Digite seu salario- tem que ser maior que 0 reais");
			salario = scan.nextDouble();
		
			if(salario > 0) {
				informacoesValidas= true;
			}
			
			else {
				System.out.println("O salario tem que ser maior que zero");
			}
			
		}while(!informacoesValidas);
		
		System.out.println();
		System.out.println("----------------DADOS DIGITADOS------------------");
		System.out.println("NOME:" + nome);
		System.out.println("SEXO: " + sexo);
		System.out.println("ESTADO CIVIL: " + estadoCivil);
		System.out.println("IDADE: " + idade);
		System.out.println("SALARIO: R$ " + salario);
		System.out.println("--------------------------------------------------");
	}

}
