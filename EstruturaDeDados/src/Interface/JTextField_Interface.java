package Interface;

import javax.swing.*;

public class JTextField_Interface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        JTextField textfield = new JTextField();
        textfield.setBounds(20, 130, 360, 40);
        frame.add(textfield);
    }
    /*
    Principas Métodos de JTextField

    getText	Retorna o texto do componente.
    getSelectedText	Retorna o texto selecionado no componente.
    setText	Altera o texto do componente.
    selectAll	Seleciona todo o texto do componente.
    setEditable	Habilita ou desabilita o componente para edição.
    isEditable	Valida se o componente é editável ou não.*/

}
