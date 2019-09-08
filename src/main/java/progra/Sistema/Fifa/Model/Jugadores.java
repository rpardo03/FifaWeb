package progra.Sistema.Fifa.Model;

import java.util.*;

public class Jugadores {

    private ListaJugador<Jugador> jugadores;

    public Jugadores(ListaJugador<Jugador> jugadorees) {
        this.jugadores = jugadorees;
    }

    public ListaJugador<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ListaJugador<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}