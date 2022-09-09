/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double superficie(double base, double altura) {
        return this.base * this.altura;
    }

    public double perimetro(double base, double altura) {
        return ((this.base + this.altura) * 2);
    }

    public void dibujo() {

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese valor de la base de nuestro rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el valor de la altura de nuestro rectangulo");
        this.altura = leer.nextDouble();
        return new Rectangulo(this.altura, this.base);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
