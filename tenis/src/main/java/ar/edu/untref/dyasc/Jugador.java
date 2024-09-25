package ar.edu.untref.dyasc;

public class Jugador {
	
	private Integer puntaje;
	private String nombre;
	
	public Jugador(){
		this.nombre = null;
		this.puntaje = 0;
	}
	
	public Integer getPuntaje() {
		return this.puntaje;
	}

	public String getNombre() {
		return this.nombre;
	}

}
