/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author LuisDaniel
 */
public class JPFApp {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JPassword App");
        frame.setSize(350, 250);
        
        Container container = frame.getContentPane();
        JPasswordField password = new JPasswordField("123456");
        
        container.add(password, BorderLayout.NORTH);
        
        frame.setVisible(true);
        
    }
}
