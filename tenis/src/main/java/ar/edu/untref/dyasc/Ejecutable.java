package ar.edu.untref.dyasc;

public class Ejecutable {
	
	 public static void main(String[] args) {
		 Jugador jugador1 = new Jugador("jugador1");
	     Jugador jugador2 = new Jugador("jugador2");
	     Partido partido = new Partido();
	     partido.jugarPartido(jugador1, jugador2);
	 }

}
