package Interface;

import javax.swing.*;

public class JComboBox_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        String[] itens = {"Item 1", "Item 2"};

        JComboBox comboBox = new JComboBox(itens);
        comboBox.setBounds(20, 130, 360, 40);
        frame.add(comboBox);

    }
}
