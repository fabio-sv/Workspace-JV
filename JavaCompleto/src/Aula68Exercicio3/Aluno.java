package Aula68Exercicio3;

public class Aluno {
	
	protected String nome;
	protected double nota [] = {0, 1, 3};

	public void Status() {
		double i = (nota[0] + nota[1] + nota[2]) / 3;
		if( i >= 60) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota: " + String.format("%.1f", i));
			System.out.println("Status: Aprovado");
		}else {
			System.out.println("Aluno(a): " + nome );
			System.out.println("Nota: " +  String.format("%.1f", i));
			System.out.println("Status: Reprovado");
		}
	}
	

}
