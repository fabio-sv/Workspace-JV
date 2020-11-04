package Interface;

import javax.swing.*;

public class JLabel_Interface {
    public static void main(String[] args) {
        JFrame frame_test = new JFrame("Titulo");
        frame_test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_test.setSize(400, 300);
        frame_test.setLayout(null);
        frame_test.setVisible(true);

        //Instâciando um Label
        JLabel label =new JLabel("Texto", JLabel.CENTER);
        //Define o posicionamento so Label
        label.setBounds(10, 100, 200, 30);
        //Adiciona o Label no Frame
        frame_test.add(label);
    }
}
    /*
         Métodos de JButton

        getText	Retorna o texto do componente.
        setText	Altera o texto do componente.

     */
