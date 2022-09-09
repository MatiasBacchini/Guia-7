/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Ejercicio_6;

/**
 *
 * @author matia
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int capacidadActual;
    

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int capacidadTaza) {
        if (this.capacidadActual == capacidadTaza ||  capacidadTaza < this.capacidadActual) {
            System.out.println("La taza se llenó");
        } else {
            System.out.println("La taza se ha llenado " + this.capacidadActual + " ml.");
        }
        this.capacidadActual -= capacidadTaza;
    }

    public void vaciarCafetera() {
        this.capacidadActual = 0;
    }

    public void agregarCafe(int cantidadCafe) {
        if (cantidadCafe == 0) {
            System.out.println("Tiene que ingresar una cantidad.");
        } else if (cantidadCafe > this.capacidadMaxima) {
            System.out.println("Hay más café del permitido.");
        } else if (this.capacidadActual == this.capacidadMaxima) {
            System.out.println("La cafetera ya está llena.");
        } else {
            this.capacidadActual += cantidadCafe;
            System.out.println("Se agregó " + cantidadCafe + " de café.");
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}

