/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package guia.pkg7.Libro;

import java.util.Scanner;


/**
 *
 * @author matia
 */
public class Libro {
    
//      Atributos
        public int ISBN;
        public String Titulo;
        public String Autor;
        public int nPagina;
        
//      Constructores
    public Libro(int ISBN, String Titulo, String Autor, int nPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nPagina = nPagina;
    }
    
    public Libro() {
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese n° de ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo: ");
        Titulo = leer.next();
        System.out.println("Ingrese Autor: ");
        Autor = leer.next();
        System.out.println("Ingrese n° de pagina: ");
        nPagina = leer.nextInt();
    }
    
    public void mostrarLibro() {
        System.out.println("");
        System.out.println("Sus datos son: ");
        System.out.println("N° de ISBN: " + ISBN);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("N° de página: " + nPagina);
    }
}
