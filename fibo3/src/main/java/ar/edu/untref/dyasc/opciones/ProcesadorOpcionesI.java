package ar.edu.untref.dyasc.opciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class ProcesadorOpcionesI implements ProcesadorOpciones {
	
	@SuppressWarnings("unused")
	private ProcesadorOpciones verificadorOpciones;

	@Override
	public void setProximoVerificador(ProcesadorOpciones proximoVerificadorOpciones) {
		this.verificadorOpciones = proximoVerificadorOpciones;
	}

	@Override
	public void procesarOpcion(String opcion, ContenedorOpciones contenedorOpciones) throws OpcionesNoValidasException {
		if(Character.isDigit(opcion.charAt(0)) || Character.isDigit(opcion.charAt(1))) {
			if(!validarFormato(opcion)){
				throw new OpcionesNoValidasException();
			}
			
			contenedorOpciones.setIteraciones(Integer.parseInt(opcion));
		}
	}

	@Override
	public boolean validarFormato(String opcion) {
		Pattern pattern = Pattern.compile(Constantes.REGEX_OPCION_I);
	    Matcher matcher = pattern.matcher(opcion);
		return matcher.find();
	}

}
