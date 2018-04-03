/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author LuisDaniel
 */
public class PropertiesApp {
    
    public static void main(String[] args) throws Exception {
        Properties sites = new Properties();
        
        sites.loadFromXML(new FileInputStream("C:\\Users\\LuisDaniel\\Documents"
                + "\\NetBeansProjects\\ABCTreinamentos\\src\\unidade4\\sites.xml"));
        System.out.println(sites.getProperty("1"));
    }
}
