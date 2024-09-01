package ar.edu.untref.dyasc.opciones;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class ProcesadorOpcionesO implements ProcesadorOpciones {
	
	private ProcesadorOpciones verificadorOpciones;

	@Override
	public void setProximoVerificador(ProcesadorOpciones proximoVerificadorOpciones) {
		this.verificadorOpciones = proximoVerificadorOpciones;	
	}

	@Override
	public void procesarOpcion(String opcion, ContenedorOpciones contenedorOpciones) throws OpcionesNoValidasException {
		if(opcion.startsWith(Constantes.OPCION_O)) {
			if(!validarFormato(opcion)){
				throw new OpcionesNoValidasException();
			}
			
			Map<String, Runnable> mapaOpciones = new HashMap<>();
			mapaOpciones.put(Constantes.V, () -> contenedorOpciones.setOrientacion(Constantes.V));
			mapaOpciones.put(Constantes.H, () -> contenedorOpciones.setOrientacion(Constantes.H));
			mapaOpciones.put(Constantes.D, () -> contenedorOpciones.setDireccion(Constantes.D));
			mapaOpciones.put(Constantes.I, () -> contenedorOpciones.setDireccion(Constantes.I));

	        for (Map.Entry<String, Runnable> entry : mapaOpciones.entrySet()) {
	            if (opcion.contains(String.valueOf(entry.getKey()))) {
	                entry.getValue().run();
	            }
	        }
	        
	        this.verificadorOpciones.procesarOpcion(opcion, contenedorOpciones);
		}else {
			this.verificadorOpciones.procesarOpcion(opcion, contenedorOpciones);
		}
	}
	
	@Override
	public boolean validarFormato(String opcion) {
		Pattern pattern = Pattern.compile(Constantes.REGEX_OPCION_O);
	    Matcher matcher = pattern.matcher(opcion);
		return matcher.find();
	}

}
