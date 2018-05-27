/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisDaniel
 */
public class DialogApp {
    
    public static void main(String[] args) {
     
        JOptionPane.showMessageDialog(null, "Iniciando a aplicação...", 
                "Instalaão Concluída", JOptionPane.INFORMATION_MESSAGE);
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        
        int resposta = JOptionPane.showConfirmDialog(null, 
                "O nome " + nome + " foi informado. Salvar as alterações?");
        
        JOptionPane.showMessageDialog(null, resposta);
        
    }
}
