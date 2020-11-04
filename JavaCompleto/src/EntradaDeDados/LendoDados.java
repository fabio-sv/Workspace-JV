package EntradaDeDados;

import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, idade;
		
		System.out.print("Informe o nome: ");
		nome = leia.nextLine();
		System.out.print("Informe a idade: ");
		idade = leia.nextLine();
		System.out.println("***************************");
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		leia.close();
	}

}
	
	
