package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class PuntajeHandlerTest {

    @Test
    public void crearObjetoPuntajeHandler() {
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        assertNotNull(puntajeHandler);
    }
}