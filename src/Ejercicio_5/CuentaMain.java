/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        System.out.println("Ingrese cantidad a ingresar: ");
        cuenta.ingresar(leer.nextDouble());
        System.out.println("Ingrese cantidad a retirar: ");
        cuenta.retirar(leer.nextDouble());
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
      

    }

}
