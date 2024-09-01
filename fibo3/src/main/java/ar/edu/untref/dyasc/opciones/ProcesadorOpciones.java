package ar.edu.untref.dyasc.opciones;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;

public interface ProcesadorOpciones {
	
	public void setProximoVerificador(ProcesadorOpciones proximoVerificadorOpciones);
	public void procesarOpcion(String opcion,ContenedorOpciones contenedorOpciones) throws OpcionesNoValidasException;
	public boolean validarFormato(String opcion);
}
