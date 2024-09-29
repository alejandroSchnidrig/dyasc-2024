package ar.edu.untref.dyasc;

import java.util.Map;

public class Tablero {
	
	private Map<Integer, String> puntos = Map.of(
			0, "0",
		    1, "15",
		    2, "30",
		    3, "40"
	);

	public void imprimirResutado(Jugador jugador1, Jugador jugador2, Estados estadoPartido) { 
		String puntosJugador1 = jugador1.isAdvance() ? "A" : puntos.get(jugador1.getPuntaje());
		String puntosJugador2 = jugador2.isAdvance() ? "A" : puntos.get(jugador2.getPuntaje());
		String ganador = jugador1.getSets() == 3 ? jugador1.getNombre() : jugador2.getSets() == 3 ? jugador2.getNombre() : " ";
		
		if(!(Estados.PARTIDO_FINALIZADO == estadoPartido)) {
			System.out.print("---------------------------------------------\n" +
                    "|             RESULTADO PARTIDO              |\n" +
			         "---------------------------------------------\n" + 
                    "   Jugadores     sets     games    puntos     \n" +
	                 "   " + jugador1.getNombre() + "         " + jugador1.getSets() + "        " + jugador1.getGames() + "        " + puntosJugador1 + "       \n" +
	                 "   " + jugador2.getNombre() + "         " + jugador2.getSets() + "        " + jugador2.getGames() + "        " + puntosJugador2 + "       \n" +
	                 "                                              \n" +
	                 "              " +   estadoPartido    + "         \n" +
	                 "---------------------------------------------\n");  
		}else {
			System.out.print("     El ganador del partido es " + ganador + "!!!");
		}
	}

}
