/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4_Ext;

import java.util.Scanner;

/**
 *
 * @author matia
 */
class servicioNIF {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenadoDatos(NIF n){
        // solicitud de Nombre y DNI
        System.out.println(" Ingrese su Nombre Completo");
        n.setNombre(leer.nextLine());
        System.out.println(" Ingrese su numero de DNI");
        n.setDNI(leer.nextInt());
    }
    
    public void crearNif(NIF n){
    // carga Vector letra con carateres
        char[] caracter = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};        
    // Calculo de la posicion a buscar 
        int pos = n.getDNI()% 23; 
//        System.out.println(pos);
        char ca = 0;
        int x = 0;
        for (int i = 0; i < 23; i++) {
            if (pos == i) {
                ca = caracter[i];
            }
            x++;
        }
        n.setLetra(ca);
//        System.out.println(n.getLetra()); 
    }
    
    public void mostrarNif(NIF n){
        System.out.println(" El número NIF correspondiente es : ");
        System.out.println(" ");
        System.out.println(" Número de NIF de " + n.getNombre() + ", es el número " +
                n.getDNI()+ "-" + n.getLetra() + " .-");
    }    

}
    
