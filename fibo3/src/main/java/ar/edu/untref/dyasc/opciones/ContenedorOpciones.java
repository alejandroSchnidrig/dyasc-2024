package ar.edu.untref.dyasc.opciones;

public class ContenedorOpciones {

	private String orientacion;
	private String direccion;
	private String funcionamiento;
	private String nombreArchivo;
	private Boolean isSalidaPantalla;
	private int iteraciones;

	public ContenedorOpciones() {
		this.orientacion = "h";
		this.direccion = "d";
		this.funcionamiento = "l";
		this.nombreArchivo = null;
		this.isSalidaPantalla = true;
		this.iteraciones = 2;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFuncionamiento() {
		return funcionamiento;
	}

	public void setFuncionamiento(String funcionamiento) {
		this.funcionamiento = funcionamiento;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public Boolean isSalidaPantalla() {
		return isSalidaPantalla;
	}

	public void setIsSalidaPantalla(Boolean isSalidaPantalla) {
		this.isSalidaPantalla = isSalidaPantalla;
	}

	public int getIteraciones() {
		return iteraciones;
	}

	public void setIteraciones(int iteraciones) {
		this.iteraciones = iteraciones;
	}
	
}
