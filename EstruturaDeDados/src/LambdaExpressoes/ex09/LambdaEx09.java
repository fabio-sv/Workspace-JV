package LambdaExpressoes.ex09;

import javax.swing.*;

public class LambdaEx09 {
    public static void main(String[] args) {

        //Cria campo de entrada de texto
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        //Cria botão clicavel
        JButton button = new JButton("click");
        button.setBounds(80, 100, 70, 30);

        //Expressão lambda
        button.addActionListener(qq_valor -> {

            textField.setText("hello swing");

        });

        JFrame frame = new JFrame();
        frame.add(textField);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
}
