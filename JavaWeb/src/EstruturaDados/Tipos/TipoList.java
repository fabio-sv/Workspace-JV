package EstruturaDados.Tipos;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TipoList {
    public static void main(String[] args) {

        // cria a lista
        List<String> nomes = new ArrayList<String>();

        for (int i = 0; i < 3; i++){
            // coleta os nomes
            String name = JOptionPane.showInputDialog("Nome");
            // adiciona nomes na lista
            nomes.add(name);

        }

        System.out.println(nomes);

        /*String remove = JOptionPane.showInputDialog("Remover nome da lista");
        // romove nomes da lista
        nomes.remove(remove);

        System.out.println(nomes);*/

        for(String nome : nomes){
            if (nome.equalsIgnoreCase("jane")){
                nomes.remove("Jane");
                nomes.add("Goku");

            }
        }

        System.out.println(nomes);



    }
}
