package ar.edu.untref.dyasc;

public class Partido {

	private PuntajeHandler puntajeHandler = new PuntajeHandler();
	private EstadosHandler estadosHandler = new EstadosHandler();
	private Estados estadoPartido = Estados.PARTIDO_EN_CURSO; 
	private final String MENSAJE_PARTIDO_TERMINADO  = "Ganador del partido: ";
	
	public Partido() {
		
	}
	
	public String jugarPartido(Jugador jugador1, Jugador jugador2) {
		while(Estados.PARTIDO_FINALIZADO != estadoPartido) {
			jugarPunto(jugador1, jugador2);
			estadoPartido = estadosHandler.getEstado(jugador1, jugador2);
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
