package ar.edu.untref.dyasc;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class TableroTest {
	
	 @Test
	    public void crearObjetoTableroTest() {
	        Tablero tablero = new Tablero();
	        assertNotNull(tablero);
	    }

}
