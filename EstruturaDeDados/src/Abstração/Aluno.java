package abstracao;

public class Aluno {

    private int matricula = 0;
    private String turno = "vazio";
    private int semetre = 1;
    private int faltas = 0;

    public int ProximoSemestre( ){
        return this.semetre + 1;
    }
    public int numerofaltas(){
        return this.faltas;
    }
}

