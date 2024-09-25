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
	
	@Test
	public void jugadorSeCreaSinNombre() {
		Jugador jugador = new Jugador();
		assertThat(jugador.getNombre()).isEqualTo(null);
	}

	@Test
	public void jugadorSeCreaConNombre(){
		Jugador jugador = new Jugador("Jugador1");
		assertThat(jugador.getNombre()).isEqualTo("Jugador1");
	}

	@Test
	public void jugadorAnotaUnPunto(){
		Jugador jugador = new Jugador("Jugador1");
		jugador.anotoPunto();
		assertThat(jugador.getPuntaje()).isEqualTo(1);
	}

	public void jugadorGanoUnGame(){
		Jugador jugador = new Jugador("Jugador1");
		jugador.ganoGame();
		assertThat(jugador.getGames()).isEqualTo(1);
	}

	public void jugadorGanoUnSet(){
		Jugador jugador = new Jugador("Jugador1");
		jugador.ganoSet();
		assertThat(jugador.getSets()).isEqualTo(1);
	}

}
