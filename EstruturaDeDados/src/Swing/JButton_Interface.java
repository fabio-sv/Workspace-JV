package Swing;

import javax.swing.*;

public class JButton_Interface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("Texto do Botão");
        button.setBounds(20, 120, 360, 40);
        frame.add(button);

    }
}
        /*
        Métodos de JButton

        getText	Retorna o texto do componente.
        setText	Altera o texto do componente.
        setEnabled	Habilita ou desabilita o componente.
        setHorizontalTextPosition	Define o alinhamento horizontal do texto no componente.
        setVerticalTextPosition	Define o alinhamento vertical do texto no componente.
        setToolTipText	Define uma mensagem ao componente.
        */