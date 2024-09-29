package ar.edu.untref.dyasc;

public class Tablero {

	public void imprimirResutado(Jugador jugador1, Jugador jugador2) { 
		String puntosJugador1 = jugador1.isAdvance() ? "A" : jugador1.getPuntaje().toString();
		String puntosJugador2 = jugador2.isAdvance() ? "A" : jugador2.getPuntaje().toString();
		
		
		System.out.print("---------------------------------------------\n" +
	                     "|             RESULTADO PARTIDO              |\n" +
				         "---------------------------------------------\n" + 
	                     "|  Jugadores     sets     games    puntos    |\n" +
		                 "|  " + jugador1.getNombre() + "         " + jugador1.getSets() + "        " + jugador1.getGames() + "        " + puntosJugador1 + "      |\n" +
		                 "|  " + jugador2.getNombre() + "         " + jugador2.getSets() + "        " + jugador2.getGames() + "        " + puntosJugador2 + "      |\n" +
		                 "---------------------------------------------\n");
		
		
	}

}
