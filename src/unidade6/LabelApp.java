/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LuisDaniel
 */
public class LabelApp {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("LabelApp");
        frame.setSize(350, 250);
        
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2, 1));
        container.add(new JLabel("Isto é um rótulo"));
                
        frame.setVisible(true);
    }
    
}
