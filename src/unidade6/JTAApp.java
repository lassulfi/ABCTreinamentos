/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author LuisDaniel
 */
public class JTAApp {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextArea app");
        frame.setSize(350, 250);
        
        JTextArea textArea = new JTextArea("Seu texto aqui!");
        
        Container container = frame.getContentPane();
        container.add(textArea, BorderLayout.NORTH);
        
        frame.setVisible(true);
    }
}
