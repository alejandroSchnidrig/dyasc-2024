package ar.edu.untref.dyasc;

public class PuntajeHandler {

    public void procesarPuntaje(Jugador jugador1, Jugador jugador2, Estados estadoPartido) {
        if(Estados.TIE_BRAKE == estadoPartido) {
            if(jugador1.getPuntaje() - jugador2.getPuntaje() >= 2 && jugador1.getPuntaje() >= 7) {
                jugador1.ganoSet();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
            }

            if(jugador2.getPuntaje() - jugador1.getPuntaje() >= 2 && jugador2.getPuntaje() >= 7) {
                jugador2.ganoSet();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
            }

        }else if(Estados.DEUCE == estadoPartido) {
    		if(jugador1.getPuntaje() - jugador2.getPuntaje() >= 2 && jugador1.getGames() < 5) {
    			jugador1.ganoGame();
                jugador1.resetearPuntaje();
                jugador2.resetearPuntaje();
    		}else if(jugador1.getPuntaje() - jugador2.getPuntaje() >= 2) {
    			jugador1.ganoSet();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
    		}
    		
    		if(jugador2.getPuntaje() - jugador1.getPuntaje() >= 2 && jugador2.getGames() < 5) {
    			jugador2.ganoGame();
                jugador1.resetearPuntaje();
                jugador2.resetearPuntaje();
    		}else if(jugador2.getPuntaje() - jugador1.getPuntaje() >= 2) {
    			jugador2.ganoSet();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
    		}
    		
    	}else if(Estados.PARTIDO_EN_CURSO == estadoPartido){
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
            
            if (jugador1.getGames() - jugador2.getGames() >= 2 && jugador1.getGames() > 5) {
                jugador1.ganoSet();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
            }
            
            if (jugador2.getGames() - jugador1.getGames() >= 2 && jugador2.getGames() > 5) {
                jugador2.ganoSet();
                jugador2.resetearPuntaje();
                jugador2.resetearGame();
                jugador1.resetearPuntaje();
                jugador1.resetearGame();
            }
    	}
    }
}