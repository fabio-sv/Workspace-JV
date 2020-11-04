package Interface;

import javax.swing.*;

public class JTextArea_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 130, 360, 40);
        frame.add(textArea);
    }
}
