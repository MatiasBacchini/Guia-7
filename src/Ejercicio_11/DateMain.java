/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author matia
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int dia, mes, anio, hoy;
        
        System.out.println("Ingrese Dia: ");
        dia=leer.nextInt();
        System.out.println("Ingrese Mes: ");
        mes=leer.nextInt();
        System.out.println("Ingrese Año: ");
        anio=leer.nextInt();
        
        Date fecha = new Date (anio-1900, mes-1, dia);
        
        Date fechaHoy = new Date();
        
        hoy=fechaHoy.getYear() - fecha.getYear();
        System.out.println(fecha);
        System.out.println(fechaHoy);
        System.out.println("Tiene " + hoy + " años");
    
    }
    
}
