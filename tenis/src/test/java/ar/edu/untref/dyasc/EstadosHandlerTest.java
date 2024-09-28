package ar.edu.untref.dyasc;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class EstadosHandlerTest {
	
	@Test
	public void crearObjetoEstadosHandler(){
		Jugador jugador = new Jugador("Jugador1");
		assertNotNull(jugador);
	}
}
