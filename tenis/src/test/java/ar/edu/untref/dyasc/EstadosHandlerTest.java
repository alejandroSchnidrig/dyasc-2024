package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class EstadosHandlerTest {
	
	@Test
	public void crearObjetoEstadosHandler(){
		Jugador jugador = new Jugador("Jugador1");
		assertNotNull(jugador);
	}
	
	@Test
	public void elPartidoSeEstaJugando() {
		EstadosHandler estadosHandler = new EstadosHandler();
		Jugador jugador1 = new Jugador("Federer");
	    Jugador jugador2 = new Jugador("Nadal");
	    jugador1.anotoPunto();
	    jugador2.anotoPunto();
	    Estados estado = estadosHandler.getEstado(jugador1, jugador2);
	    assertThat(estado).isEqualTo(Estados.PARTIDO_EN_CURSO);
	}
	
	@Test
	public void elPartidoTermino() {
		EstadosHandler estadosHandler = new EstadosHandler();
		Jugador jugador1 = new Jugador("Federer");
	    Jugador jugador2 = new Jugador("Nadal");
	    jugador1.ganoSet();
	    jugador1.ganoSet();
	    jugador1.ganoSet();
	    Estados estado = estadosHandler.getEstado(jugador1, jugador2);
	    assertThat(estado).isEqualTo(Estados.PARTIDO_FINALIZADO);
	} 
}
