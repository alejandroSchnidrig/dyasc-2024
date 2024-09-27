package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class PartidoTest {
	
	@Test
    public void crearObjetoPartido() {
		Partido partido = new Partido();
        assertNotNull(partido);
    }
	
	@Test
	public void partidoJuegaPunto() {
		Partido partido = new Partido();
		Jugador jugador1 = new Jugador("Jugador1");
		Jugador jugador2 = new Jugador("Jugador2");
		partido.jugarPunto(jugador1, jugador2);
		boolean sumoPunto = false;
		if (jugador1.getPuntaje() == 1 || jugador2.getPuntaje() == 1) {
			sumoPunto = true;
		}
		assertThat(sumoPunto).isEqualTo(true);
	}
	
	@Test
	public void partidoJuegaPartidoHastaQueUnJugarGane() {
		Partido partido = new Partido();
		Jugador jugador1 = new Jugador("Jugador1");
		Jugador jugador2 = new Jugador("Jugador2");
		partido.jugarPartido(jugador1, jugador2);
		boolean ganoPartido = false;
		if(jugador1.getSets() == 3  || jugador2.getSets() == 3 ) {
			ganoPartido = true;
		}
		assertThat(ganoPartido).isEqualTo(true);
	}
}
