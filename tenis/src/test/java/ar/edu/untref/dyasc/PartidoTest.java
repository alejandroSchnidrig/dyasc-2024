package ar.edu.untref.dyasc;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class PartidoTest {
	
	@Test
    public void crearObjetoPartido() {
		Partido partido = new Partido();
        assertNotNull(partido);
    }
}
