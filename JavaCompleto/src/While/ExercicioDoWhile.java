package While;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.println("Informe a temperatura em graus Celcius: ");
			double celcius = scan.nextDouble();
			double fahrenhait = celcius * 9 / 5 + 32;
			System.out.println("A temperatra " + celcius + "° Celcius " + "em fahrenhait é " + fahrenhait + "°");
			System.out.println("Deseja repetir? (s/n)");
			resposta = scan.next().charAt(0);
			
			} while(resposta != 'n');
		
		scan.close();
		
	}

}
