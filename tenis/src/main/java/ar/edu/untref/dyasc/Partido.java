package ar.edu.untref.dyasc;

public class Partido {

	private PuntajeHandler  puntajeHandler = new PuntajeHandler();
	
	private final String MENSAJE_PARTIDO_TERMINADO  = "Ganador del partido: ";
	
	public Partido() {
		
	}
	
	public String jugarPartido(Jugador jugador1, Jugador jugador2) {
		while(jugador1.getSets() < 3 && jugador2.getSets() < 3) {
			jugarPunto(jugador1, jugador2);
			puntajeHandler.procesarPuntaje(jugador1,jugador2);
		}
		
		return jugador1.getSets() == 3 ? MENSAJE_PARTIDO_TERMINADO + jugador1.getNombre() : MENSAJE_PARTIDO_TERMINADO + jugador2.getNombre();
	}
     
	public void jugarPunto(Jugador jugador1, Jugador jugador2) {
		Integer punto = (int) (Math.random() * 2) + 1;
		if(punto == 1) {
			jugador1.anotoPunto();
		}else {
			jugador2.anotoPunto();
		}
	}

}
