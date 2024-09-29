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
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getGames()).isEqualTo(1);

    }

    @Test
    public void jugador2AnotaCuatroPuntosGanaUnGame(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getGames()).isEqualTo(1);

    }

    @Test
    public void jugador1GanaUnGameSeReseteaPuntaje(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getPuntaje()).isEqualTo(0);

    }

    @Test
    public void jugador2GanaUnGameSeReseteaPuntaje(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getPuntaje()).isEqualTo(0);

    }

    @Test
    public void jugador1GanaSeisGamesSumaSet(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getSets()).isEqualTo(1);
    }

    @Test
    public void jugador2GanaSeisGamesSumaSet(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getSets()).isEqualTo(1);
    }

    @Test
    public void jugador1GanaSeisGamesReseteaPuntaje(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getPuntaje()).isEqualTo(0);
    }

    @Test
    public void jugador1GanaSeisGamesReseteaGame(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getGames()).isEqualTo(0);
    }

    @Test
    public void jugador2GanaSeisGamesReseteaPuntaje(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getPuntaje()).isEqualTo(0);
    }

    @Test
    public void jugador2GanaSeisGamesReseteaGame(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getGames()).isEqualTo(0);
    }
    
    @Test
    public void partidoEntraEnDeuceGanaGameJugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.DEUCE);
        assertThat(jugador1.getGames()).isEqualTo(1);
    }
    
    @Test
    public void partidoEntraEnDeuceGanaGameJugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.DEUCE);
        assertThat(jugador2.getGames()).isEqualTo(1);
    }
    
    @Test
    public void partidoEntraEnDeuceGanaGameGanaSetJugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.DEUCE);
        assertThat(jugador1.getSets()).isEqualTo(1);
    }
    
    @Test
    public void partidoEntraEnDeuceGanaGameGanaSetJugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.DEUCE);
        assertThat(jugador2.getSets()).isEqualTo(1);
    }

    @Test
    public void partidoEntraEnTieBrakeGanaSetJugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador1.getSets()).isEqualTo(1);
    }

    @Test
    public void partidoEntraEnTieBrakeGanaSetJugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador2.getSets()).isEqualTo(1);
    }

    @Test
    public void partidoEntraEnTieBrakeGanaSetGanaPartidoJugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoSet();
        jugador1.ganoSet();
        jugador2.ganoSet();
        jugador2.ganoSet();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador1.getSets()).isEqualTo(3);
    }

    @Test
    public void partidoEntraEnTieBrakeGanaSetGanaPartidoJugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoSet();
        jugador1.ganoSet();
        jugador2.ganoSet();
        jugador2.ganoSet();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador2.getSets()).isEqualTo(3);
    }
    
    @Test
    public void jugadorNoGanaGameConDiferenciaMenorDeDosGamesJugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador1.getSets()).isEqualTo(0);
    }

    @Test
    public void jugadorNoGanaGameConDiferenciaMenorDeDosGamesJugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.PARTIDO_EN_CURSO);
        assertThat(jugador2.getSets()).isEqualTo(0);
    }
    
    @Test
    public void partidoEntraEnTieBrakeNoGanaGameConDiferenciaMenorDe2Jugador1(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoSet();
        jugador1.ganoSet();
        jugador2.ganoSet();
        jugador2.ganoSet();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador1.getSets()).isEqualTo(2);
    }
    
    @Test
    public void partidoEntraEnTieBrakeNoGanaGameConDiferenciaMenorDe2Jugador2(){
        Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.ganoSet();
        jugador1.ganoSet();
        jugador2.ganoSet();
        jugador2.ganoSet();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador1.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador2.ganoGame();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.TIE_BRAKE);
        assertThat(jugador2.getSets()).isEqualTo(2);
    }
    
    @Test
    public void jugador1tieneVentajaEnDeuce() {
    	Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");
        PuntajeHandler puntajeHandler = new PuntajeHandler();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador1.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador2.anotoPunto();
        jugador1.anotoPunto();
        puntajeHandler.procesarPuntaje(jugador1,jugador2, Estados.DEUCE);
        assertThat(jugador1.isAdvance()).isEqualTo(true);
    }
}