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
        if (jugador1.getGames() > 5) {
            jugador1.ganoSet();
            jugador1.resetearPuntaje();
            jugador1.resetearGame();
            jugador2.resetearPuntaje();
            jugador2.resetearGame();
        }
        if (jugador2.getGames() > 5) {
            jugador2.ganoSet();
            jugador2.resetearPuntaje();
            jugador2.resetearGame();
            jugador1.resetearPuntaje();
            jugador1.resetearGame();
        }
    }
}