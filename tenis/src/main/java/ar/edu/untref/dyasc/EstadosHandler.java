package ar.edu.untref.dyasc;

public class EstadosHandler {

	public Estados getEstado(Jugador jugador1, Jugador jugador2) {
		
		if(jugador1.getSets() == 3 || jugador2.getSets() == 3) {
			return Estados.PARTIDO_FINALIZADO;
		}
		
		if(jugador1.getPuntaje() == 3 && jugador2.getPuntaje() == 3) {
			return Estados.DEUCE;
		}
		
		if(jugador1.getSets() < 3 && jugador2.getSets() < 3) {
			return Estados.PARTIDO_EN_CURSO;
		}
		
		return Estados.PARTIDO_EN_CURSO;
	}

}
