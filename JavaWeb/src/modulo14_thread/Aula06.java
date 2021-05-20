package modulo14_thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class TelaTime extends JDialog {

    private JPanel JPanel = new JPanel(new GridBagLayout()); //Painel de componentes
    private JLabel hora = new JLabel("Time Thread 1");
    private JTextField mostraTempo = new JFormattedTextField();
    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");

    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (true) { //Fica sempre rodando
                mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
                        .format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true) { //Fica sempre rodando
                mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
                        .format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Thread thread1Time;
    private Thread thread2Time;
    private JLabel hora2 = new JLabel("Time Thread 2");
    private JTextField mostraTempo2 = new JFormattedTextField();

    public TelaTime() {
        setTitle("Minha tela de time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();//controla o posicionamento
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        hora.setPreferredSize(new Dimension(200, 25));
        JPanel.add(hora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        mostraTempo.setEnabled(false);
        JPanel.add(mostraTempo, gridBagConstraints);

        hora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        JPanel.add(hora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        mostraTempo2.setEnabled(false);
        JPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        JPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        JPanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time = new Thread(thread1);
                thread1Time.start();

                thread2Time = new Thread(thread2);
                thread2Time.start();

                jButton.setEnabled(false);
                jButton2.setEnabled(true);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time.stop();
                thread2Time.stop();

                jButton.setEnabled(true);
                jButton2.setEnabled(false);

            }
        });

        jButton2 .setEnabled(false);

        add(JPanel, BorderLayout.WEST);
        setVisible(true);
    }
}


public class Aula06 {
    public static void main(String[] args) {

        TimeTela telaTime = new TimeTela();

    }
}
