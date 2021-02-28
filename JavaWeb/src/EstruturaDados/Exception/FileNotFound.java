package EstruturaDados.Exception;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// erro de arquivo não encontrado

public class FileNotFound {
    public static void main(String[] args) {

        try {

            // instânciando o arquivo "lines.txt"
            File file = new File("lines.txt");

            // lendo o arquivo file
            Scanner scanner = new Scanner(file);

        } catch (FileNotFoundException erro) {
            erro.printStackTrace(); // imprime o erro no console

            JOptionPane.showMessageDialog(null, "Erro: " + erro.getClass().getName());

        }
    }
}
