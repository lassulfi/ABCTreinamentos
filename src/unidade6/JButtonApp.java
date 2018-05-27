/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author LuisDaniel
 */
public class JButtonApp extends JFrame implements ActionListener, WindowListener {

    public UIManager.LookAndFeelInfo looks[];    
    
    public JButtonApp() {}
           
    public static void main(String[] args) {
        
        JButtonApp frame = new JButtonApp();
        frame.setTitle("JButton App");
        frame.setSize(350, 250);
        
        
        JButton button = new JButton("Clique aqui!");
        button.addActionListener(frame);
        
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button);
        
        frame.addWindowListener(frame);
        
        //L&F
        frame.looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(frame.looks[3].getClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(null, 
                ev.getActionCommand().toString() + "\n evento de clique no botão");
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Encerrando a aplicação...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
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
