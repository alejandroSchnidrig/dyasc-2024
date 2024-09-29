package ar.edu.untref.dyasc;

public class EstadosHandler {

	public Estados getEstado(Jugador jugador1, Jugador jugador2) {
		
		if(jugador1.getSets() == 3 || jugador2.getSets() == 3) {
			return Estados.PARTIDO_FINALIZADO;
		}else if(jugador1.getGames() == 6 && jugador2.getGames() == 6) {
			return Estados.TIE_BRAKE;
		}else if(jugador1.getPuntaje() >= 3 && jugador2.getPuntaje() >= 3) {
			return Estados.DEUCE;
		}else if(jugador1.getSets() < 3 && jugador2.getSets() < 3) {
			return Estados.PARTIDO_EN_CURSO;
		}
		
		return Estados.PARTIDO_EN_CURSO;
	}

}
