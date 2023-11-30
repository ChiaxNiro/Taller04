package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Equipo> equipos = Datos.cargarEquipos();

        for (Equipo equipo : equipos) {
            System.out.println("Equipo: " + equipo.getNombre() + ", Ranking: " + equipo.getRanking());
            System.out.println("Jugadores:");
            for (Jugador jugador : equipo.getJugadores()) {
                System.out.println("  - " + jugador.getNombre() + " (Número: " + jugador.getNumero() + ", Posición: " + jugador.getPosicion() + ")");
            }
            System.out.println("---------------------------------------------");
        }
        GuiEquipos gui = new GuiEquipos();
    }


}