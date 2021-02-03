package Swing;

import javax.swing.*;

public class JRadioButton_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JRadioButton radioButton = new JRadioButton();
        radioButton.setBounds(20, 130, 360, 40);
        frame.add(radioButton);
    }
}
