/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6_Ext;

/**
 *
 * @author matia
 */
public class Ahorcado {

    private String[] palabra;
    private String[] paAux;
    private int cantLetrasEncontradas = 0;
    private int cantJugadasMaximas = 0;
    private String letra;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] paAux, String letra, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.paAux = paAux;
        this.letra = letra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPaAux() {
        return paAux;
    }

    public void setPaAux(String[] paAux) {
        this.paAux = paAux;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}
