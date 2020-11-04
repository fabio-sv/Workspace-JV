package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionListener_Eventos {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("Button One");
        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Button Two");
            }
        });
        button.setBounds(20, 120, 200, 40);
        frame.add(button);
    }
}
