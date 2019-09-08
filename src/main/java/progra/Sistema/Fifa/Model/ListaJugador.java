package progra.Sistema.Fifa.Model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListaJugador<Jugador> implements Iterable {

    private JugadorNodo cabeza;

    public ListaJugador() {
        this.cabeza = null;
    }

    private class JugadorNodo {

        public Jugador jugador;
        public JugadorNodo jugSiguiente;

        public JugadorNodo(Jugador j) {
            this.jugador = j;
            this.jugSiguiente = null;
        }
    }

    public void agregarJugador(Jugador jugador) {
        JugadorNodo nuevoJugador = new JugadorNodo(jugador);
        if (this.cabeza == null) {
            this.cabeza = nuevoJugador;
        } else {
            JugadorNodo puntero = cabeza;
            while (puntero.jugSiguiente != null) {
                puntero = puntero.jugSiguiente;
            }
            puntero.jugSiguiente = nuevoJugador;
        }
    }

    public void mostrarJugadores() {
        if (this.cabeza == null) {
            System.out.println("No hay jugadores agregados.");
        } else {
            JugadorNodo puntero = cabeza;
            while (puntero.jugSiguiente != null) {
                System.out.println(puntero.jugador.toString());
                puntero = puntero.jugSiguiente;
            }
            System.out.println(puntero.jugador.toString());
        }
    }

    public JugadorNodo obtenerNodo(int n) {
        int contador = 0;
        if (cabeza == null) {
            return null;
        } else {
            JugadorNodo puntero = cabeza;
            while (contador < (n - 1) && puntero.jugSiguiente != null) {
                puntero = puntero.jugSiguiente;
                contador++;
            }
            return puntero.jugSiguiente;
        }
    }

    public JugadorNodo getCabeza() {
        return cabeza;
    }

    @Override
    public Iterator iterator() {
        return new Iterador();
    }

    private class Iterador implements Iterator {

        private int siguiente;

        @Override
        public boolean hasNext() {
            return obtenerNodo(siguiente) != null;
        }

        @Override
        public Jugador next() {
            JugadorNodo sigNodo = obtenerNodo(siguiente);
            siguiente++;
            return sigNodo.jugador;
        }
    }
}
