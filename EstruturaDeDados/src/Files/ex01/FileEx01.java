package Files.ex01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx01 {
    public static void main(String[] args) {

        try { //Criando um arquivo

            File file = new File("C:\\Workspaces\\Intellij\\filename.txt");
            if (file.exists()) {
                System.out.println("Arquivo criado: " + file.getName() + "\n");
            } else {
                System.out.println("Alquivo não existe.\n");
            }

            //Escrevendo no arquivo filename
            FileWriter escrever = new FileWriter("C:\\Workspaces\\Intellij\\filename.txt");
            escrever.write("Arquivo escrito através de uma aplicação Java.\n");
            escrever.close();

            //Lendo o conteudo de filename
            Scanner reader = new Scanner(file);

            while (reader.hasNext()){
                String dados = reader.nextLine();
                System.out.println(dados);
            }
            reader.close();


        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
