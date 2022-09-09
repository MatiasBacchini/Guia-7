/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ejercicio_9;

import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author matia
 */
public class matematicaServis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public matematicaEntidad mat() {
        matematicaEntidad operaciones = new matematicaEntidad();

        operaciones.setN1((int) (Math.random() * 10));
        operaciones.setN2((int) (Math.random() * 10));

        return operaciones;
    }

    public void devolverMayor(matematicaEntidad operaciones) {
        System.out.println(operaciones.getN1());
        System.out.println(operaciones.getN2());

        if (operaciones.getN1() > operaciones.getN2()) {
            System.out.println("El numero Mayor es: " + operaciones.getN1());

        } else {
            System.out.println("EL numero Menor es: " + operaciones.getN2());
        }
    }

    public void calcularPotencia(matematicaEntidad operaciones) {
        double nromayor = 0, nromenor = 0, potencia = 0;
        double nro1 = round(operaciones.getN1());
        double nro2 = round(operaciones.getN2());

        if (operaciones.getN1() > operaciones.getN2()) {
            nromayor = operaciones.getN1();
            nromenor = operaciones.getN2();
        } else if (operaciones.getN1() < operaciones.getN2()) {
            nromayor = operaciones.getN2();
            nromenor = operaciones.getN1();

            potencia = pow(nromayor, nromenor);
        }
        System.out.println(" La potencia del número " + nromayor + " elevada al " + nromenor + " es " + potencia);
    }

    public void calcularRaiz(matematicaEntidad operaciones) {
        double menor = min(operaciones.getN1(), operaciones.getN2());
        double raiz = abs(menor);

        System.out.println("la raiz del menor numero es: " + raiz);
    }
}
