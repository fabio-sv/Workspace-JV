package Aula68Exercicio2;

public class funcionario {
	
	protected String nome;
	protected double salario;
	protected double imposto;
	
	public String SalarioLiquido() {
		double x = salario - (imposto / 100 * salario);
		return String.format("%.2f", x);
	}
	public void Dicidio(double dici) {
		double x = salario + (dici / 100 * salario);
		System.out.println("Reajuste salarial: R$ " + x);
	}

}
