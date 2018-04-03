/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author LuisDaniel
 */

class Shape{}
class Circle extends Shape{}
class Rectangle extends Shape{}


public class Generic15 {
    public static void main(String[] args) {
        Vector<Shape> picture = new Vector<Shape>();
        picture.add(new Circle());
        picture.add(new Rectangle());
        //Rectangle rect = picture.get(1);
        
        List<String> ls = new ArrayList<String>();
        List<?> l = ls;
    }
}
