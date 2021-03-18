package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx02 {
    public static void main(String[] args) {

        try { //Criando um arquivo

            File file = new File("C:\\Workspaces\\Intellij\\filename.txt");
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("Alquivo não existe.\n");
            }

            //Escrevendo no arquivo filename
            FileWriter escrever = new FileWriter("C:\\Workspaces\\Intellij\\filename.txt");
            escrever.write("Arquivo escrito através de uma aplicação Java.\n");
            escrever.close();
            System.out.println("Escrito com sucesso.\n");

            //Lendo o conteudo de filename
            Scanner reader = new Scanner(file);

            while (reader.hasNext()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
