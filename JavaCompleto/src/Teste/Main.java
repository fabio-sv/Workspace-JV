package Teste;

public class Main {

	public static void main(String[] args) {
		
		Aluno Maria = new Aluno();
		
		System.out.println("Turno que Maria est� matriculada: " + Maria.informeTurno());
		System.out.println("O semestre que Maria est� �: " + Maria.informeSemestre());
		System.out.println("O n�mero de faltas de Maria � " + Maria.informeFalta());
	}

}
