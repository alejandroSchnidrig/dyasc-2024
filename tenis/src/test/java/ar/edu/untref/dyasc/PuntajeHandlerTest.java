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

    @Test
    public void jugadorAnotaCuatroPuntosGanaUnGame(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador1.getGames()).isEqualTo(1);

    }
}