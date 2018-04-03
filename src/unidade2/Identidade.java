/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import javax.swing.JApplet;

/**
 *
 * @author LuisDaniel
 */
public class Identidade extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        int I[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    I[i][j] = 1;
                } else {
                    I[i][j] = 0;
                }
                System.out.print(I[i][j]);
            }
            System.out.println("\n=====");
        }
    }

    // TODO overwrite start(), stop() and destroy() methods

}
