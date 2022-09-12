/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package Ejercicio_1_Ext;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class CancionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingresa el titulo de una cancion");
        String titulo = leer.nextLine();
        System.out.println("ingresa el autor");
        String autor = leer.nextLine();
        Cancion cancion = new Cancion(titulo, autor);
        System.out.println(cancion.toString());
    }

}
