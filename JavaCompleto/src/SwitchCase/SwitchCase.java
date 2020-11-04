package SwitchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day;
		
		System.out.println("****DIAS DA SEMANA****\n");
		
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado\n");
		
		System.out.println("Informe o dia da semana: ");
		day = sc.nextInt();
		
		
		switch(day){
			case 1:
				System.out.println("\nO dia escolhido foi DOMINGO");
				break;
			case 2:
				System.out.println("\nO dia escolhido foi SEGUNDA");
				break;
			case 3: 
				System.out.println("\nO dia escolhido foi TERÇA");
				break;
			case 4:
				System.out.println("\nO dia escolhido foi QUARTA");
				break;
			case 5:
				System.out.println("O dia escolhido foi QUINTA");
				break;
			case 6:
				System.out.println("O dia escolhido foi SEXTA");
				break;
			case 7:
				System.out.println("O dia escolhido foi SÁBADO");
				break;
			default:
				System.out.println("Valor inválido!");
		}
			
		sc.close();

	}

}
