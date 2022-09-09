/*
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Ejercicio_12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author matia
 */
public class PersonaServis {
    Scanner leer = new Scanner(System.in);
    public void crearPersona (PersonaEntidad cP){
        
        
        System.out.println("**** BIENVENIDO ****");
        System.out.println("");
        System.out.println("Ingrese su nombre: ");
        cP.setNombre(leer.nextLine());
        System.out.println("A continuacion ingrese su fecha de nacimiento");
        System.out.println("Primero el dia: ");
        int dia = leer.nextInt();
        System.out.println("Seguido del mes: ");
        int mes = leer.nextInt();
        System.out.println("Y por ultimo el año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        cP.setfNacimiento(fecha);
    }
    
    public  int  calcularEdad (PersonaEntidad cE) {
        Date fechahoy = new Date ();
        int calcTiempo;
        calcTiempo = fechahoy.getYear() - cE.getfNacimiento().getYear();
        
        return calcTiempo;
    }
    
    public boolean menorQue (PersonaEntidad p){
        //int edad1 = calcularEdad(p);
        
        System.out.println("Ingrese la edad de su amigo: ");
        int edad2 = leer.nextInt();
        System.out.println("Su amigo es menor que usted?...");
        if (edad2 > calcularEdad(p)) {
            return false;
        }else {
            return true;
        }
    }
    
    public String mostrarPersona (PersonaEntidad mp){
        
        return mp.toString();
    }
}
