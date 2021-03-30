package modulo09e10.excecao;

public class ExecaoProcessarNota extends Exception{

    public ExecaoProcessarNota(String erro) {
        super("Vixxi um erro no processamento das notas do aluno " + erro);
    }
}
