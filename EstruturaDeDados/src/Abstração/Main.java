package abstracao;

public class Main {
    public static void main(String[] args) {

        Aluno joao = new Aluno();
        System.out.println("Proximo Semestre: " + joao.ProximoSemestre());
        System.out.println("Número de faltas: " + joao.numerofaltas());

    }
}
