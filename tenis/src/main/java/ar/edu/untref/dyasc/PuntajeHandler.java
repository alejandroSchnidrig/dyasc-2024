package ar.edu.untref.dyasc;

public class PuntajeHandler {

    public void procesarPuntaje(Jugador jugador1, Jugador jugador2) {
        if (jugador1.getPuntaje() > 3) {
            jugador1.ganoGame();
            jugador1.resetearPuntaje();
            jugador2.resetearPuntaje();
        }
        if (jugador2.getPuntaje() > 3) {
            jugador2.ganoGame();
            jugador2.resetearPuntaje();
            jugador1.resetearPuntaje();
        }
    }
}