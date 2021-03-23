package Files.ex02;

import java.io.File;

public class FileEx02 {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Workspaces\\Test-File\\testeDelete.txt");

        //Deletar arquivo
        arquivo.delete();
    }
}
