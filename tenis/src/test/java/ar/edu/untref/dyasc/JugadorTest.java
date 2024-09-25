package ar.edu.untref.dyasc;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class JugadorTest {
	
	@Test
    public void crearObjetoJugador() {
        Jugador jugador = new Jugador();
        assertNotNull(jugador);
    }

}
