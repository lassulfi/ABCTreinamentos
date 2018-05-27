/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author LuisDaniel
 */
public class CheckApp {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ceckbox App");
        frame.setSize(350, 250);
        
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(new JCheckBox("1 - Sim"));
        container.add(new JCheckBox("2 - Não"));
        
        ButtonGroup btg = new ButtonGroup();
        
        JRadioButton rb = new JRadioButton("Pequeno", true);
        btg.add(rb);
        container.add(rb);
        
        rb = new JRadioButton("Médio");
        btg.add(rb);
        container.add(rb);
        
        rb = new JRadioButton("Grande");
        btg.add(rb);
        container.add(rb);
        
        String[] init = {"Brasil", "Argetina", "Paraguai", "Uruguai"};
        JComboBox<String> combo = new JComboBox<>(init);
        
        container.add(combo);
        
        frame.setVisible(true);
        
    }
}
