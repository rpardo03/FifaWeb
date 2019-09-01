package progra.Sistema.Fifa.Services;

import progra.Sistema.Fifa.Model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManejoDato {

    public ArrayList<Jugador> leerDatos(String path) {
        String lineaTexto;
        File archivo = new File(path);
        ArrayList<Jugador> jugadoresArchivos = new ArrayList<Jugador>();
        try {
            FileReader fReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fReader);
            int contador = 0;
            while ((lineaTexto = bufferedReader.readLine()) != null && contador < 13237) {
                contador++;
                if (contador > 1) {
                    String[] datosJugador = lineaTexto.split(";");
                    Jugador j = new Jugador();
                    j.setNombre(datosJugador[2]);
                    j.setEdad(Integer.parseInt(datosJugador[3]));
                    j.setFotografia(datosJugador[4]);
                    j.setNacionalidad(datosJugador[5]);
                    j.setRating(Integer.parseInt(datosJugador[7]));
                    j.setPotencial(Integer.parseInt(datosJugador[8]));
                    j.setClub(datosJugador[9]);
                    j.setControlBalon(Integer.parseInt(datosJugador[64]));// error en el 13237
                    j.setVelocidad(Integer.parseInt(datosJugador[66]));
                    j.setAgilidad(Integer.parseInt(datosJugador[67]));
                    j.setResistencia(Integer.parseInt(datosJugador[72]));
                    jugadoresArchivos.add(j);
                }
            }
            bufferedReader.close();
            fReader.close();
        } catch (IOException e) {
            System.exit(0);
        }
        return jugadoresArchivos;
    }

    public ArrayList<Jugador> selecNacionalidad(ArrayList<Jugador> jugadores, String nacionalidad) {
        ArrayList<Jugador> jugadorsNacionalidad = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNacionalidad().equals(nacionalidad)) {
                jugadorsNacionalidad.add(jugadores.get(i));
            }
        }
        return jugadorsNacionalidad;
    }

    public ArrayList<Jugador> selecEdad(ArrayList<Jugador> jugadores, int edad) {
        ArrayList<Jugador> jugadorsEdad = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getEdad() == edad) {
                jugadorsEdad.add(jugadores.get(i));
            }
        }
        return jugadorsEdad;
    }

    public ArrayList<Jugador> selecClub(ArrayList<Jugador> jugadores, String club) {
        ArrayList<Jugador> jugadorsClub = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getClub().equals(club)) {
                jugadorsClub.add(jugadores.get(i));
            }
        }
        return jugadorsClub;
    }

    public ArrayList<Jugador> selecRating(ArrayList<Jugador> jugadores, int rating) {
        ArrayList<Jugador> jugadorsRating = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getRating() == rating) {
                jugadorsRating.add(jugadores.get(i));
            }
        }
        return jugadorsRating;
    }

    public ArrayList<Jugador> selecPotencial(ArrayList<Jugador> jugadores, int potencial) {
        ArrayList<Jugador> jugadorsPotencial = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getPotencial() == potencial) {
                jugadorsPotencial.add(jugadores.get(i));
            }
        }
        return jugadorsPotencial;
    }

    public ArrayList<Jugador> selecNombre(ArrayList<Jugador> jugadores, String nombre) {
        ArrayList<Jugador> jugadorsNombre = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(nombre)) {
                jugadorsNombre.add(jugadores.get(i));
            }
        }
        return jugadorsNombre;
    }

}