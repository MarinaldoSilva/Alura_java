package atvd16_17;
import java.util.*;
public class atvd3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	String nome;
	String estadoCivil;
	String sexo;
	String validacao;
	
	int idade;
	double salario;
	boolean infoValida = false;
	
	//validação nome > 3 caracteres
		do {		
			System.out.println("NOME:");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
				validacao = "Valor aceito";
				
				System.out.println(validacao);
			}else {
				System.out.println("Nome de usuário tem que ter mais que 3 letras.");
			}
		}while(!infoValida);
				
		//validação idade !=0
		
		
		infoValida = false;
		do {		
			System.out.println("IDADE:");
			idade = scan.nextInt();
			
			if(idade >0) {
				infoValida = true;
				validacao = "Valor aceito";
				
				System.out.println(validacao);
			}else {
				System.out.println("Nome de idade tem que ser maior que 0.");
			}
		}while(!infoValida);
		
		//validação sexo
				
		infoValida = false;
		do {		
			System.out.println("SEXO 'F/f ou M/m");
			sexo = scan.next(); 
					
			if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
				infoValida = true;
				validacao = "Valor aceito";
				System.out.println(validacao);
			}else {
				System.out.println("Valores aceitos somente entre F e M (não case sensitve).");
			}
		}while(!infoValida);
		
		//validação estado civil
		
				infoValida = false;
				do {		
					System.out.println("Esta civil : entre com valores de C-> casado, S-> solteiro, D-Divorciado");
					estadoCivil = scan.next(); 
							
					if(estadoCivil.equalsIgnoreCase("C") || 
						estadoCivil.equalsIgnoreCase("S") ||
							estadoCivil.equalsIgnoreCase("D")) {
					
						
					infoValida = true;
					validacao = "Valor aceito";
					System.out.println(validacao);
					
				}else {
						System.out.println("Valores aceitos somente entre C, S, D (não case sensitve) conforme descrição.");
					}
				}while(!infoValida);
				
		//salario
		infoValida = false;
		do {		
			System.out.println("salario bruto");
			salario = scan.nextDouble(); 
					
			if(salario > 0) {
				infoValida = true;
				validacao = "Valor aceito";
				System.out.println(validacao);
			}else {
				System.out.println("Valores aceitos somente maior que zero");
			}
		}while(!infoValida);	
		
		System.out.println("Nome: " + nome + " Idade: " + idade 
				+ " Salario: " + salario + " sexo: " + sexo + " Estado Civíl: " + estadoCivil
				
				);
				
	}
}
