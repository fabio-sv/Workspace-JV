package EstruturaDados.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) throws FileNotFoundException {

        try {

            // instânciando o arquivo "lines.txt"
            File file = new File("lines.txt");

            // lendo o arquivo file
            Scanner scanner = new Scanner(file);

        } catch (Exception erro) {
            erro.printStackTrace(); // imprime o erro no console

        }
    }
}
