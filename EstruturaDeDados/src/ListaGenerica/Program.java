package ListaGenerica;

import javax.swing.*;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

       for(int i = 0; i <= 4; i++){

           Cliente cliente = new Cliente();
           String nome = JOptionPane.showInputDialog("Nome");
           cliente.setNome(nome);
           String idade = JOptionPane.showInputDialog("Idade");
           cliente.setIdade(idade);

           clientes.add(cliente);
       }

        System.out.println(clientes);

    }
}
