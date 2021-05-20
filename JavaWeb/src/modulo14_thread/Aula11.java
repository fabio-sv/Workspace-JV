package modulo14_thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

class ObjetoFilaThread {

    private String email;
    private String nome;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoFilaThread that = (ObjetoFilaThread) o;
        return email.equals(that.email) && nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, nome);
    }

    @Override
    public String toString() {
        return "ObjetoFilaThread{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
            new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {

        System.out.println("Rodando");

        while (true) {

            synchronized (pilha_fila) {  //Bloquear o acesso a está lista por outros processos

                Iterator iteracao = pilha_fila.iterator();

                while (iteracao.hasNext()) {//Enquanto conter dados na lista irá processar

                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
                    System.out.println("-----------------------------------------");
                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());
                    iteracao.remove();

                    try {
                        Thread.sleep(1000); //tempo de descarga de memória
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

            try {
                Thread.sleep(1000); // Tempo para limpeza de memória
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class TimeTela extends JDialog {

    private JPanel JPanel = new JPanel(new GridBagLayout()); //Painel de componentes
    private JLabel hora = new JLabel("Nome");
    private JTextField mostraTempo = new JFormattedTextField();
    private JButton jButton = new JButton("Add Lista");
    private JButton jButton2 = new JButton("Stop");

    private JLabel hora2 = new JLabel("E-mail");
    private JTextField mostraTempo2 = new JFormattedTextField();

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    public TimeTela() {
        setTitle("Minha tela");
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
        JPanel.add(mostraTempo, gridBagConstraints);

        hora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        JPanel.add(hora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
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

                ObjetoFilaThread filaThread = new ObjetoFilaThread();
                filaThread.setNome(mostraTempo.getText());
                filaThread.setEmail(mostraTempo2.getText());

                fila.add(filaThread);

            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        fila.start();
        add(JPanel, BorderLayout.WEST);
        setVisible(true);
    }
}

public class Aula11 {
    public static void main(String[] args) {

        TimeTela timeTela = new TimeTela();

    }
}
