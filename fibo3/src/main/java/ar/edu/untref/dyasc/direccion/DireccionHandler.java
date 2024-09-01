package ar.edu.untref.dyasc.direccion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.untref.dyasc.utils.Constantes;

public class DireccionHandler {
	
	private Map<String, Direccion> direcciones;
	
	public DireccionHandler() {
		this.direcciones = new HashMap<String, Direccion>();
		this.direcciones.put(Constantes.D, new DireccionDirecta());
		this.direcciones.put(Constantes.I, new DireccionInversa());
	}
	
	public List<Integer> direccionar(List<Integer> serie, String direccion) {
		return this.direcciones.get(direccion).direccionar(serie);
	}

}
