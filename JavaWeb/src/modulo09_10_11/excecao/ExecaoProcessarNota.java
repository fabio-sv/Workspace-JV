package modulo09_10_11.excecao;

public class ExecaoProcessarNota extends Exception{

    public ExecaoProcessarNota(String erro) {
        super("Vixxi um erro no processamento das notas do aluno " + erro);
    }
}
