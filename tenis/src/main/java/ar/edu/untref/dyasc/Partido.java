package ar.edu.untref.dyasc;

public class Partido {

	private PuntajeHandler puntajeHandler = new PuntajeHandler();
	private EstadosHandler estadosHandler = new EstadosHandler();
	private Tablero tablero = new Tablero();
	private Estados estadoPartido = Estados.PARTIDO_EN_CURSO;
	
	public void jugarPartido(Jugador jugador1, Jugador jugador2) {
		while(Estados.PARTIDO_FINALIZADO != estadoPartido) {
			estadoPartido = estadosHandler.getEstado(jugador1, jugador2);
			jugarPunto(jugador1, jugador2, estadoPartido);
			puntajeHandler.procesarPuntaje(jugador1,jugador2, estadoPartido);
			tablero.imprimirResutado(jugador1, jugador2, estadoPartido);
		}
	}
     
	public void jugarPunto(Jugador jugador1, Jugador jugador2, Estados estadoPartido) {
		Integer punto = (int) (Math.random() * 2) + 1;
		
		if(Estados.DEUCE == estadoPartido) {
			if(punto == 1) {
				if(jugador1.isAdvance()) {
					jugador1.setWinAdvance(true);
				}else if(jugador2.isAdvance()) {
					jugador1.setAdvance(false);
					jugador2.setAdvance(false);
				}else {
					jugador1.setAdvance(true);
				}
			}else {
				if(jugador2.isAdvance()) {
					jugador2.setWinAdvance(true);
				}else if(jugador1.isAdvance()) {
					jugador1.setAdvance(false);
					jugador2.setAdvance(false);
				}else {
					jugador2.setAdvance(true);
				}
			}
		}else {
			if(punto == 1) {
				jugador1.anotoPunto();
			}else{
				jugador2.anotoPunto();
			}
		}
		
	}

}
