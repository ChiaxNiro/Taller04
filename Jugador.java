package org.example;

public class Jugador {
    private int numero;
    private String nombre;
    private String seleccion;
    private String posicion;


    public Jugador(int numero, String nombre, String seleccion, String posicion) {
        this.numero = numero;
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }
}
