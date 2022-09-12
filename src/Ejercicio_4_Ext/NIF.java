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
class NIF {
        private int DNI;
    private char letra;
    private String nombre;

    public NIF() {
    }

    public NIF(int DNI, char letra, String nombre) {
        this.DNI = DNI;
        this.letra = letra;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}

