package Interface;

import javax.swing.*;

public class JProgressBar_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

        JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
        progressBar.setValue(90);
        progressBar.setBounds(20, 130, 360, 10);

        frame.add(progressBar);

    }
}
