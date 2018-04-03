/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisDaniel
 */
public class ScannerAppv2 {
    
    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(new FileReader("C:\\Users\\LuisDaniel\\"
                    + "Documents\\NetBeansProjects\\ABCTreinamentos\\src\\unidade2\\"
                    + "numeros.txt"));
            
            double soma = 0;
            String valor;
            while(entrada.hasNext()){
                valor = entrada.next();
                soma += Double.parseDouble(valor);
            }
            
            entrada.close();
            
            JOptionPane.showMessageDialog(null, "A soma dos valores é " + soma);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
