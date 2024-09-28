package ar.edu.untref.dyasc;

public class Tablero {

	public void imprimirResutado(Jugador jugador1, Jugador jugador2) {
		System.out.print("---------------------------------------------\n" +
	                     "|             RESULTADO PARTIDO              |\n" +
				         "---------------------------------------------\n" + 
	                     "|  Jugadores     sets     games    puntos    |\n" +
		                 "|  " + jugador1.getNombre() + "         " + jugador1.getSets() + "        " + jugador1.getGames() + "        " +jugador1.getPuntaje() + "      |\n" +
		                 "|  " + jugador2.getNombre() + "         " + jugador2.getSets() + "        " + jugador2.getGames() + "        " +jugador2.getPuntaje() + "      |\n" +
		                 "---------------------------------------------\n");
		
		
	}

}
