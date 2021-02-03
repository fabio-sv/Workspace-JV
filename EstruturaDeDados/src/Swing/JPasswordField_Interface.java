package Swing;

import javax.swing.*;

public class JPasswordField_Interface {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JPasswordField password = new JPasswordField();
        password.setBounds(20,130, 360, 40);
        frame.add(password);

    }
}
    /*
        Metodos JPasswordField

        getPassword - Retorna o texto do componente, porém em um array onde cada caractere é um elemento.
        getEchoChar - Retorna o caractere utilizado para substituir os caracteres digitados – o padrão é asterisco.
        setEchoChar - Altera o caractere utilizado para substituir os caracteres digitados.*/