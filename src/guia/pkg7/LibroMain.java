/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7;

import guia.pkg7.Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author matia
 */
public class LibroMain {
    
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
 System.out.println("Por favor, ingrese los siguientes datos:");
        
        Libro libro = new Libro();

        libro.cargarLibro();
        
        libro.mostrarLibro();
    }
    
}


//        (leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
                
//        System.out.println("");
//        System.out.println("Sus datos son: ");
//        System.out.println("N° de ISBN: " + libro.ISBN);
//        System.out.println("Titulo: " + libro.Titulo);
//        System.out.println("Autor: " + libro.Autor);
//        System.out.println("N° de página: " + libro.nPagina);

