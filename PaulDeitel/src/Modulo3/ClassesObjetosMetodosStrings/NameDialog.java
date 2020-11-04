package Modulo3.ClassesObjetosMetodosStrings;

import javax.swing.JOptionPane;

/**
 *
 * @author Fábio
 * 
 * page 107
 */
public class NameDialog {
    public static void main(String[] args) {
        
        // pede o nome do usuário
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // cria a mensagem 
        String message = String.format("Welcome, %s to Java Programming", name);
        
        // exibe a mensagem
        JOptionPane.showMessageDialog(null, message);
    }
    
}
