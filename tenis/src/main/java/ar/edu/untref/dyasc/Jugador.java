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
	
	public void evaluarPuntaje() {
		if(this.puntaje > 3) {
			this.games++;
		}
	}
	
	public void evaluarGames() {
		if(this.games > 5) {
			this.sets++;
		}
	}

	public void anotoPunto(){
		this.puntaje++;
	}
	
	public void ganoGame(){
		this.games++;
	}
	
	public void ganoSet()  {
		this.sets++;
	}

	public String getNombre() {
		return this.nombre;
	}
 
	public Integer getPuntaje() {
		return this.puntaje;
	}

	public Integer getGames() {
		return this.games;
	}

	public Integer getSets() {
		return this.sets;
	}

    public void resetearPuntaje() {
        this.puntaje = 0;
    }

	public void resetearGame() {
		this.games = 0;
	}

}
