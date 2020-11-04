package Interface;

import javax.swing.*;

public class JCheckBox_Interface {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JCheckBox checkBox = new JCheckBox("CheckBox");
        checkBox.setBounds(20, 130, 360, 40);
        frame.add(checkBox);
    }
}
