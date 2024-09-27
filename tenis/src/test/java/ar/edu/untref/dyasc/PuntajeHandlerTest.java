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
    public void jugador1AnotaCuatroPuntosGanaUnGame(){
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

    @Test
    public void jugador2AnotaCuatroPuntosGanaUnGame(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador2.getGames()).isEqualTo(1);

    }

    @Test
    public void jugador1GanaUnGameSeReseteaPuntaje(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador1.getPuntaje()).isEqualTo(0);

    }

    @Test
    public void jugador2GanaUnGameSeReseteaPuntaje(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador2.getPuntaje()).isEqualTo(0);

    }

    @Test
    public void jugador1GanaSeisGamesSumaSet(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador1.getSets()).isEqualTo(1);
    }

    @Test
    public void jugador2GanaSeisGamesSumaSet(){
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2);
        assertThat(jugador2.getSets()).isEqualTo(1);
    }
}