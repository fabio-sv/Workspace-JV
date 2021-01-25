package EstruturaDados.Exception.StringBuilder;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        try{

            Integer x = null; // nullPointerException

            Integer y = 5 + x;

        } catch (Exception erro){

            StringBuilder saida = new StringBuilder();

            /*Imprime o erro no console Java*/
            erro.printStackTrace();

            /*Imprimindo no console*/
            System.out.println("Erro: " + erro.getMessage());

            for (int i = 0; i < erro.getStackTrace().length; i ++){
                saida.append("\n Classe de erro: " + erro.getStackTrace()[i].getClassName());
                saida.append("\n Método de erro: " + erro.getStackTrace()[i].getMethodName());
                saida.append("\n Linha de erro: " + erro.getStackTrace()[i].getLineNumber());

            }

            JOptionPane.showMessageDialog(null, "Mensagem: " + saida.toString());
        }

    }
}
