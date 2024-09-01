package ar.edu.untref.dyasc.opciones;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class ProcesadorOpcionesF implements ProcesadorOpciones {

	private ProcesadorOpciones verificadorOpciones;

	@Override
	public void setProximoVerificador(ProcesadorOpciones proximoVerificadorOpciones) {
		this.verificadorOpciones = proximoVerificadorOpciones;
	}

	@Override
	public void procesarOpcion(String opcion, ContenedorOpciones contenedorOpciones) throws OpcionesNoValidasException {
		if(opcion.startsWith(Constantes.OPCION_F)) {
			if(!validarFormato(opcion)){
				throw new OpcionesNoValidasException();
			}
			
			String argumento = opcion.split(Constantes.IGUAL)[1];
			
			Map<String, Runnable> mapaOpciones = new HashMap<>();
			mapaOpciones.put(argumento, () -> {
			    contenedorOpciones.setNombreArchivo(argumento);
			    contenedorOpciones.setIsSalidaPantalla(false);
			});
			
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
		Pattern pattern = Pattern.compile(Constantes.REGEX_OPCION_F);
	    Matcher matcher = pattern.matcher(opcion);
		return matcher.find();
	}

}
