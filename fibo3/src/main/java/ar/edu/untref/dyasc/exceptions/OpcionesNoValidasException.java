package ar.edu.untref.dyasc.exceptions;

import ar.edu.untref.dyasc.utils.Constantes;

@SuppressWarnings("serial")
public class OpcionesNoValidasException extends Exception {

	public OpcionesNoValidasException(){
		super(Constantes.OPCIONES_NO_VALIDAS_EXC_MENSAJE);
	}
}
