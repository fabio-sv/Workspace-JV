package OperadorBitBit;

import java.util.Scanner;

public class MascaraDeRede {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mask = 32;
		char resp;
		
		do {
		
			System.out.println("Informe a mascara para compara��o: ");
			int n = scan.nextInt();
		
		
			if((mask & n) != 0 ) {
				System.out.println("6th bit � true");
			
			} else {
				System.out.println("6th bit � false");
			}
			System.out.println("Deseja sair? (s/n)");
			resp = scan.next().charAt(0);
	
		} while(resp != 'n');
		
		
		scan.close();

	}

}
