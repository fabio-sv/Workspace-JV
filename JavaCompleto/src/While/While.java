package While;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastre uma senha: ");
		int senhaCadastrada = sc.nextInt();
		
		System.out.println("Informe a senha cadastrada: ");
		int senha = sc.nextInt();
		
		while(senhaCadastrada != senha) {
			System.out.println("Senha Inválida! Informe a senha cadastrada: ");
			senha = sc.nextInt();
		}
		sc.close();
	
	}

}
