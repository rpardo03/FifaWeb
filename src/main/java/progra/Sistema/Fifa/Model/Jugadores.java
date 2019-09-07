package progra.Sistema.Fifa.Model;

import java.util.*;

public class Jugadores {

    private ArrayList<Jugador> jugadores;

    public Jugadores(ArrayList<Jugador> jugadorees) {
        this.jugadores = jugadorees;
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Ljugadores) {
        this.jugadores = Ljugadores;
    }

}