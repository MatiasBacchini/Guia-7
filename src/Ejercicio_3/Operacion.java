/*
Crear una clase llamada op que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese valor numero 1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese valor numero 2: ");
        numero2 = leer.nextInt();
        return new Operacion(numero1, numero2);
    }

    public int sumar(int numero1, int numero2) {
        return this.numero1 + this.numero2;
    }

    public int restar(int numero1, int numero2) {
        return this.numero1 - this.numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        if (numero1 != 0 || numero2 != 0) {
            return this.numero1 * this.numero2;
        }
        return 0;
    }

    public int dividir(int numero1, int numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        }
        System.out.println("La division no se podra relizar porque su divisor o dividendo es 0 ");
        return 0;
    }
}
