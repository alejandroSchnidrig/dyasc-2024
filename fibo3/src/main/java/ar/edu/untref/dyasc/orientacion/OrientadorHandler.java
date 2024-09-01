package ar.edu.untref.dyasc.orientacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.untref.dyasc.utils.Constantes;

public class OrientadorHandler {
	
	private Map<String, Orientacion> orientaciones;
	
	public OrientadorHandler() {
		this.orientaciones = new HashMap<String, Orientacion>();
		this.orientaciones.put(Constantes.V, new OrientacionVertical());
		this.orientaciones.put(Constantes.H, new OrientacionHorizontal());
	}
	
	public String orientar(List<Integer> serie, String orientacion) {
		return this.orientaciones.get(orientacion).orientar(serie);
	}

}
