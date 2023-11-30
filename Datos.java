package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datos {
    private static final String TEAMS_FILE_PATH = "src\\main\\resources\\Equipos";

    public static List<Equipo> cargarEquipos() {
        List<Equipo> equipos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(TEAMS_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datosEquipo = line.split(";");
                int id = Integer.parseInt(datosEquipo[0]);
                String nombre = datosEquipo[1];
                int ranking = Integer.parseInt(datosEquipo[2]);
                String rutaBandera = datosEquipo[3];

                List<Jugador> jugadores = cargarJugadores(id);

                Equipo equipo = new Equipo(id, nombre, ranking, rutaBandera, jugadores);
                equipos.add(equipo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return equipos;
    }

    public static List<Jugador> cargarJugadores(int idSeleccion) {
        String texto1 = String.valueOf(idSeleccion);
        List<Jugador> jugadores = new ArrayList<>();
        String fileName = "src\\main\\resources\\"+texto1;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datosJugador = line.split(";");
                int numero = Integer.parseInt(datosJugador[0]);
                String nombre = datosJugador[1];
                String posicion = datosJugador[2];

                Jugador jugador = new Jugador(numero, nombre,null, posicion);
                jugadores.add(jugador);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jugadores;
    }
}
