/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisDaniel
 */
public class Avaliacao extends JApplet {

    private static final long serialVersionUID = 1L;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        String notas = JOptionPane.showInputDialog("Informe a nota");
        float nota = Float.parseFloat(notas);
        
        if (nota < 0 || nota >100) {
            JOptionPane.showMessageDialog(null, "Nota inválida. Informar nota "
                    + "entre 0 e 100");
            paint(null);
        } else if (nota < 50){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota < 70){
            JOptionPane.showMessageDialog(null, "Regular");
        } else if (nota < 90){
            JOptionPane.showMessageDialog(null, "Bom");
        } else {
            JOptionPane.showMessageDialog(null, "Excelente");
            System.exit(0);
        }
    }
}
