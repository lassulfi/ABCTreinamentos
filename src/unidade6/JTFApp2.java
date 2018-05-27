/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LuisDaniel
 */
public class JTFApp2{
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("JTF App 2");
        frame.setSize(350, 250);
        
        JTextField tf = new JTextField("Digite Aqui!");
        tf.addActionListener(ev->{
            JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
        });
        
        Container container = frame.getContentPane();
        container.add(tf, BorderLayout.NORTH);
        
        frame.setVisible(true);
        
    }
}
