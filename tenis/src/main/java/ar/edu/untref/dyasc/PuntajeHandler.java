package ar.edu.untref.dyasc;

public class PuntajeHandler {

    public void procesarPuntaje(Jugador jugador1, Jugador jugador2, Estados estadoPartido) {
        if(Estados.TIE_BRAKE == estadoPartido) {
            if(jugador1.getPuntaje() - jugador2.getPuntaje() >= 2 && jugador1.getPuntaje() >= 7) {
            	ganoSetJugador1(jugador1, jugador2);
            }

            if(jugador2.getPuntaje() - jugador1.getPuntaje() >= 2 && jugador2.getPuntaje() >= 7) {
            	ganoSetJugador2(jugador1, jugador2);
            }

        }else if(Estados.DEUCE == estadoPartido) {
    		if(jugador1.isWinAdvance() && jugador1.getGames() < 5) {
    			ganoGameJugador1(jugador1, jugador2);
                resetarVentajas(jugador1, jugador2);
    		}else if(jugador1.isWinAdvance() && jugador1.isAdvance()) {
    			ganoSetJugador1(jugador1, jugador2);
                resetarVentajas(jugador1, jugador2);
    		}
    		
    		if(jugador2.isWinAdvance() && jugador2.getGames() < 5 && jugador2.isAdvance()) {
    			ganoGameJugador2(jugador1, jugador2);
                resetarVentajas(jugador1, jugador2);
    		}else if(jugador2.isWinAdvance() && jugador2.isAdvance()) {
    			ganoSetJugador2(jugador1, jugador2);
                resetarVentajas(jugador1, jugador2);
    		}
    		
    	}else if(Estados.PARTIDO_EN_CURSO == estadoPartido){
    		if (jugador1.getPuntaje() > 3) {
    			ganoGameJugador1(jugador1, jugador2);
            }
    		
            if (jugador2.getPuntaje() > 3) {
            	ganoGameJugador2(jugador1, jugador2);
            }
            
            if (jugador1.getGames() - jugador2.getGames() >= 2 && jugador1.getGames() > 5) {
            	ganoSetJugador1(jugador1, jugador2);
            }
            
            if (jugador2.getGames() - jugador1.getGames() >= 2 && jugador2.getGames() > 5) {
            	ganoSetJugador2(jugador1, jugador2);
            }
    	}
    }
    
    private void resetarVentajas(Jugador jugador1, Jugador jugador2) {
    	 jugador1.setAdvance(false);
         jugador1.setWinAdvance(false);
         jugador2.setAdvance(false);
         jugador2.setWinAdvance(false);
    }
    
    private void ganoSetJugador1(Jugador jugador1, Jugador jugador2) {
    	jugador1.ganoSet();
        jugador1.resetearPuntaje();
        jugador1.resetearGame();
        jugador2.resetearPuntaje();
        jugador2.resetearGame();
    }
    
    private void ganoSetJugador2(Jugador jugador1, Jugador jugador2) {
    	jugador2.ganoSet();
        jugador2.resetearPuntaje();
        jugador2.resetearGame();
        jugador1.resetearPuntaje();
        jugador1.resetearGame();
    }
    
    private void ganoGameJugador1(Jugador jugador1, Jugador jugador2) {
    	jugador1.ganoGame();
        jugador1.resetearPuntaje();
        jugador2.resetearPuntaje();
    }
    
    private void ganoGameJugador2(Jugador jugador1, Jugador jugador2) {
    	jugador2.ganoGame();
        jugador2.resetearPuntaje();
        jugador1.resetearPuntaje();
    }
}