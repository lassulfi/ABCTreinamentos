/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author LuisDaniel
 */
public class AloMundo extends JApplet {

    private static final long serialVersionUID = 1L;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        System.out.println("Inicializando...");
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g) {
        this.setBackground(Color.GREEN);
        this.setSize(400, 100);
        //g.drawRect(0, 0, 150, 150);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Versão JVM: " + System.getProperty("java.version"), 20, 20);
        g.drawString("Versão S.O. : " + System.getProperty("os.name"), 20, 50);
    }

    @Override
    public void destroy() {
        System.out.println("Eliminando...");
    }

    @Override
    public void stop() {
        System.out.println("Parando...");
    }

    @Override
    public void start() {
        System.out.println("Executando...");
    }

}
