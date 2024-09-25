package ar.edu.untref.dyasc;

public class Jugador {
	
	private Integer puntaje;
	private String nombre;
	private Integer games;
	private Integer sets;
	
	public Jugador(){
		this.nombre = null;
		this.puntaje = 0;
		this.games = 0;
		this.sets = 0;
	}

	public Jugador(String nombre){
		this.nombre = nombre;
		this.puntaje = 0;
		this.games = 0;
		this.sets = 0;
	}
	
	public Integer getPuntaje() {
		return this.puntaje;
	}

	public void anotoPunto(){
		this.puntaje++;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void ganoGame(){
		this.games++;
	}

	public Integer getGames() {
		return this.games;
	}

	public Integer getSets() {
		return this.sets;
	}

	public void ganoSet()  {

		this.sets++;
	}
}
