/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3.persistencia;

import br.abctreinamentos.rh.Administrativo;
import br.abctreinamentos.rh.Diretor;

/**
 *
 * @author LuisDaniel
 */
public class PersistenciaApp {
    
    public static void main(String[] args) {
        
        GenericDAO<Administrativo> admin = new GenericDAO<>();
        admin.create(new Administrativo());
        
        GenericDAO<Diretor> diretor = new GenericDAO<>();
        diretor.create(new Diretor());
    }
    
}
