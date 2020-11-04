package Interface;

import java.io.File;
import javax.swing.JFileChooser;

public class JFileChooser_Interface {
    public static void main(String[] args) {

        JFileChooser filechooser = new JFileChooser();

        int retorno = filechooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            System.out.println(file.toString());
        }
        else{
            System.out.println("Nenhum arquivo foi selecionado");
        }

    }

}
