/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4_Ext;

/**
 *
 * @author matia
 */
public class NIFMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                NIF n = new NIF();
        servicioNIF sn = new servicioNIF();
        
        
        sn.llenadoDatos(n);
        System.out.println("");
        sn.crearNif(n);
        System.out.println("");
        sn.mostrarNif(n); 
        System.out.println("");
    }
    
}
    

