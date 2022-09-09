/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import java.util.Arrays;

/**
 *
 * @author matia
 */
public class arraysMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10;
        }
        Arrays.sort(arregloA);
        
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;  
        }

        System.out.println("------------------------------------------------");
        System.out.print("> Arreglo A: ");

        for (int i = 0; i < 50; i++) {
            System.out.println(" [" + arregloA[i] + "] ");
        }
        System.out.println("");
        System.out.print("> Arreglo B: ");

        for (int i = 0; i < 20; i++) {
            System.out.println(" [" + arregloB[i] + "] ");
        }

        System.out.println("");
        System.out.println("------------------------------------------------");

    }

}
