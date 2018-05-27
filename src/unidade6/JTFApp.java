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
public class JTFApp extends JFrame implements ActionListener, WindowListener {
    
    public static void main(String[] args) {
        
        JTFApp frame = new JTFApp();
        frame.setTitle("Primeira Aplicação");
        frame.setSize(350, 250);
        frame.addWindowListener(frame);
        
        JTextField tf = new JTextField("Digite Aqui!");
        tf.addActionListener(frame);
        
        Container container = frame.getContentPane();
        container.add(tf, BorderLayout.NORTH);
        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Encerrando a aplicação");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
