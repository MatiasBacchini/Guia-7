/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Cuenta {
    
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {
    }
    
    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero de cuenta: ");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI: ");
        this.dniCliente = leer.nextLong();
        System.out.println("Ingrese saldo actual: ");
        this.saldoActual = leer.nextInt(); 
        return new Cuenta();
    }
    
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }
    
    public void retirar(double retiro) {
        if (this.saldoActual < retiro) {
            this.saldoActual = 0;    
        } else {
            this.saldoActual -= retiro;
        }
    }
    
    public void extraccionRapida() {
        if (this.saldoActual <= 0) {
            System.out.println("ERROR AL EXTRAR");
        } else  {
            this.saldoActual -= this.saldoActual * 0.2;
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo es: $ " + this.saldoActual);
    }
    
    public void consultarDatos() {
        System.out.println("Numero de cuenta:  " + this.numeroCuenta);
        System.out.println("DNI:  " + this.dniCliente);
        System.out.println("Saldo actual:  " + this.saldoActual);
    }
    
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
}
