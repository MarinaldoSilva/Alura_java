package atvd16_17;
import java.util.*;
public class atvd2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infoValidas=false;
		
		String nome;
		String senha;
		
		do {
			System.out.println("Usuário: ");
			nome = scan.next();
			System.out.println("Senha: ");
			senha= scan.next();
			
		if(nome.equalsIgnoreCase(senha)) {
			System.out.println("senha igual a nome de ususário, erro. Digite novamente.");
		}else {
			infoValidas = true; 
			System.out.println("Senha alterada com sucesso, anote sua senha: " + senha);
		}
		
		}while(!infoValidas);
	}	
}
