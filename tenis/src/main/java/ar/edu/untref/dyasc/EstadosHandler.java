package ar.edu.untref.dyasc;

public class EstadosHandler {

	public Estados getEstado(Jugador jugador1, Jugador jugador2) {
		if(jugador1.getSets() < 3 && jugador2.getSets() < 3) {
			return Estados.PARTIDO_EN_CURSO;
		}
		
		if(jugador1.getSets() == 3 || jugador2.getSets() == 3) {
			return Estados.PARTIDO_FINALIZADO;
		}
		
		return Estados.PARTIDO_EN_CURSO;
	}

}
