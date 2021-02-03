package Swing;

import javax.swing.*;

public class JScrollBar_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
        scrollBar.setBounds(20, 130, 360, 40);

        frame.add(scrollBar);
    }
}
