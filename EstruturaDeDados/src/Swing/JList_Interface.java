package Swing;

import javax.swing.*;

public class JList_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        String[] itens = {"Iten 01", "Iten 02", "Iten 03"};

        JList list = new JList(itens);
        list.setBounds(20, 130, 360, 40);
        frame.add(list);

    }


}
