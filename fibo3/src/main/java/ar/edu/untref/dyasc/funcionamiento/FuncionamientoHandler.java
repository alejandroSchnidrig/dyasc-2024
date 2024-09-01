package ar.edu.untref.dyasc.funcionamiento;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.untref.dyasc.utils.Constantes;

public class FuncionamientoHandler {
	
	private Map<String, Funcionamiento> funciones;
	
	public FuncionamientoHandler(){
		this.funciones = new HashMap<String, Funcionamiento>();
		this.funciones.put(Constantes.L, new FuncionamientoLista());
		this.funciones.put(Constantes.S, new FuncionamientoSumatoria());
	}
	
	public List<Integer> aplicarFuncion(List<Integer> serie, String funcion) {
		return this.funciones.get(funcion).aplicarFuncion(serie);
	}

}
