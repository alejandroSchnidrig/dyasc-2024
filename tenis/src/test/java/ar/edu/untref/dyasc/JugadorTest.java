package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class JugadorTest {
	
	@Test
    public void crearObjetoJugador() {
        Jugador jugador = new Jugador();
        assertNotNull(jugador);
    }
	
	@Test
	public void jugadorSeCreaConCeroPuntos() {
		Jugador jugador = new Jugador();
		assertThat(jugador.getPuntaje()).isEqualTo(0);
	}

}
