package ar.edu.untref.dyasc;

public class Partido {
	
	public Partido() {
		
	}
     
	public void jugarPunto(Jugador jugador1, Jugador jugador2) {
		Integer punto = (int) (Math.random() * 2) + 1;
		if(punto == 1) {
			jugador1.anotoPunto();
		}else {
			jugador2.anotoPunto();
		}
	}
	
	

}
