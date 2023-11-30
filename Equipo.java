package org.example;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
        private int id;
        private String nombre;
        private int ranking;
        private String rutabaBandera;

        private List<Jugador> jugadores;

    public Equipo(int id, String nombre, int ranking, String rutabaBandera, List<Jugador> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.ranking = ranking;
        this.rutabaBandera = rutabaBandera;
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
            jugadores.add(jugador);
        }

        public List<Jugador> getJugadores() {
            return jugadores;
        }

        public String getNombre() {
            return nombre;
        }

    public int getRanking() {
        return ranking;
    }
}
