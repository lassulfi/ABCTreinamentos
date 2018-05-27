/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LuisDaniel
 */
public class ConverterApp {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Conversor de Temperatura Celsus para Fahrenheit");
        frame.setSize(350, 250);
        
        JTextField celsius = new JTextField("0");
        JButton button = new JButton("Converter");
        JLabel fahrenheit = new JLabel("32° Fahrenheit");
        
        GridLayout grid = new GridLayout(2, 2);
        FlowLayout flow = new FlowLayout();
        BorderLayout border = new BorderLayout(5, 5);
        
        Container container = frame.getContentPane();
        container.setLayout(grid);
        
        container.add(celsius);
        container.add(new JLabel("Celsius"));
        container.add(button);
        container.add(fahrenheit);
        
        frame.setVisible(true);
    }
}
