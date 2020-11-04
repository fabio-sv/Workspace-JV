package Teste;

public class Main {

	public static void main(String[] args) {
		
		Aluno Maria = new Aluno();
		
		System.out.println("Turno que Maria está matriculada: " + Maria.informeTurno());
		System.out.println("O semestre que Maria está é: " + Maria.informeSemestre());
		System.out.println("O número de faltas de Maria é " + Maria.informeFalta());
	}

}
