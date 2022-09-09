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

/**
 *
 * @author matia
 */
public class OperacionesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion op = new Operacion();
        op.crearOperacion();
        

        System.out.println("La suma de los numeros ingresado es: " + op.sumar(op.getNumero1(), op.getNumero2()));
        System.out.println("La resta de los numeros ingresado es: " + op.restar(op.getNumero1(), op.getNumero2()));
        
        if (op.multiplicar(op.getNumero1(), op.getNumero2()) == 0){
            System.out.println("ERROR al multiplicar por 0");
        }

 
        if (op.dividir(op.getNumero1(), op.getNumero2()) == 0){    
            System.out.println("No se puede divir por 0");
        } else {
            System.out.println("La division de los numeros ingresado es: " + op.dividir(op.getNumero1(), op.getNumero2()));
        }  
    }
}
