package ar.edu.untref.dyasc.opciones;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;

public class ProcesadorOpcionesHandler {
	
	private ProcesadorOpciones verificadorOpcionesO;
	
	public ProcesadorOpcionesHandler() {
		this.verificadorOpcionesO = new ProcesadorOpcionesO();
		ProcesadorOpciones verificadorOpcionesM = new ProcesadorOpcionesM();
		ProcesadorOpciones verificadorOpcionesF = new ProcesadorOpcionesF();
		ProcesadorOpciones verificadorOpcionesI = new ProcesadorOpcionesI();
		
		verificadorOpcionesO.setProximoVerificador(verificadorOpcionesM);
		verificadorOpcionesM.setProximoVerificador(verificadorOpcionesF);
		verificadorOpcionesF.setProximoVerificador(verificadorOpcionesI);
	}
	
	public void procesar(String opcion, ContenedorOpciones contenedorOpciones) throws OpcionesNoValidasException {
		this.verificadorOpcionesO.procesarOpcion(opcion, contenedorOpciones);
	}
}
