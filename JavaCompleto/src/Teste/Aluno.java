package Teste;

public class Aluno {
	
	private int semestre = 1;
	private int falta = 0;
	private String turno = "Matutino";
	
	public int informeSemestre() {
		
		return this.semestre;
	}
	public int informeFalta() {
		
		return this.falta;	
	}
	public String informeTurno() {
		
		return this.turno;
	}

}
