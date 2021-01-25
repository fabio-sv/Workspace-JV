package EstruturaDados.Exception;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        try{

            Integer x = null; // nullPointerException

            Integer y = 5 + x;

        } catch (Exception erro){

            /*Imprime o erro no console Java*/
            erro.printStackTrace();

            /*Imprimindo no console*/
            System.out.println("Erro: " + erro.getMessage());

            for (int i = 0; i < erro.getStackTrace().length; i ++){
                System.out.println("Classe de erro: " + erro.getStackTrace()[i].getClassName());
                System.out.println("Método de erro: " + erro.getStackTrace()[i].getMethodName());
                System.out.println("Linha de erro: " + erro.getStackTrace()[i].getLineNumber());

            }

            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }

    }
}
