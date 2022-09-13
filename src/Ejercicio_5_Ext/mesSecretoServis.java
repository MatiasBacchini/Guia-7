/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Ejercicio_5_Ext;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class mesSecretoServis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void solicitarMes(mesSecreto ms) {

        System.out.println(" Ingrese el Mes que cree sera el resultado");
        ms.setMesSecreto(leer.nextLine());

    }

    public void obtenerMes(mesSecreto ms) {

        // carga Vector meses con los meses
        String[] alt = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        // eleccion numero aleatorio del mes 
        int pos = (int) (Math.random() * 11 + 1);
        // Extraer mes Secreto    
//        System.out.println(pos + 1);
        String ops = "";
        for (int i = 0; i < 12; i++) {
            if (pos == i) {
                ops = alt[i];
            }
        }
        ms.setMes(ops);
        System.out.println(ops.toUpperCase());
    }

    public void resolverAcertijo(mesSecreto ms) {

        if (ms.getMes().equalsIgnoreCase(ms.getMesSecreto())) {
            System.out.println(" haz acertado!!!!!".toUpperCase());
            System.out.println(" El mes Ingresado por usted fue ".toUpperCase() + ms.getMes().toUpperCase() + ", es igual al mes aleatorio : ".toUpperCase() + " - " + ms.getMes().toUpperCase() + " - ");
        } else {
            System.out.println("lo lamento, no acerto".toUpperCase());
        }

    }

}
