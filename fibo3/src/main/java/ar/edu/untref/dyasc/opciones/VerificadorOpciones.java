package ar.edu.untref.dyasc.opciones;

import java.util.HashMap;
import java.util.Map;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class VerificadorOpciones {
	
	private Map<String, String> tipoOpciones;
	
	public VerificadorOpciones() {
		this.tipoOpciones = new HashMap<String, String>();
		this.tipoOpciones.put(Constantes.OPCION_O, Constantes.OPCION_O);
		this.tipoOpciones.put(Constantes.OPCION_M, Constantes.OPCION_M);
		this.tipoOpciones.put(Constantes.OPCION_F, Constantes.OPCION_F);
	}
	
	public void verificar(String[] opciones) throws OpcionesNoValidasException {
		if(opciones.length == 0 || opciones.length > 4){
			throw new OpcionesNoValidasException();
		}
		
		for(String opcion : opciones) {
			if(!(Character.isDigit(opcion.charAt(0)) || Character.isDigit(opcion.charAt(1)))) {
				String clave = opcion.split(Constantes.IGUAL)[0];
				if(!tipoOpciones.containsKey(clave)) {
					throw new OpcionesNoValidasException();
				}
			}
		}		
	}

}
