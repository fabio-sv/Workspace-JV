package ExtruturaDeRepeticao;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = leia.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			if(hora < 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
		
		leia.close();
	}

}
