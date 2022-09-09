/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Circunferencia {
    
    private double radio;
    public double area;
    public double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio:");
        radio = leer.nextFloat();
    }
    
    public void area() {
        area = Math.PI * Math.pow(radio,2);
    }
    
    public void perimetro() {
        perimetro = 2 * Math.PI * radio;
    }
    
    public void mostrarAreaPerimetro() {
        System.out.println("");
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);  
      
    }
}
