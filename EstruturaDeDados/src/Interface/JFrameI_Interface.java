package Interface;

import javax.swing.*;

public class JFrameI_Interface {
    public static void main(String[] args) {

        //Instânciando um Frame
        JFrame frame = new JFrame("Titulo");
        //Criandos os botões de Maximizar, Minimizar e Fecha
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Difinindo o tamanho do Frame
        frame.setSize(300,450);
        //Configuração do componente
        frame.setLayout(null);
        //Tornando o Frame visível
        frame.setVisible(true);

    }


}
