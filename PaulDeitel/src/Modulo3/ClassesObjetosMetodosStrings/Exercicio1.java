/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo3.ClassesObjetosMetodosStrings;

import javax.swing.JOptionPane;
/**
 *
 * @author Fábio
 * 
 * page 108
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Informe um número inteiro");
        
        //tratamento de exceções
        try{
            int valor = Integer.parseInt(input);
            
            JOptionPane.showMessageDialog(null, valor);
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro! Informe apenas números inteiros");
        }
        
      
         
    }
}
    
