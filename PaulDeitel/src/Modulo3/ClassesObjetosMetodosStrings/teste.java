package Modulo3.ClassesObjetosMetodosStrings;

import javax.swing.*;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome;

        nome = JOptionPane.showInputDialog(null, "Nome ");

        System.out.println(nome);

        JOptionPane.showMessageDialog(null, "Bem vindo(a) " + nome + "!");



        in.close();

    }
}
