package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.fibonacci.ProgramaFibonacci;

public class Ejecutable {
	
    public static void main(String[] opciones) throws OpcionesNoValidasException {
    	ProgramaFibonacci programaFibonacci = new ProgramaFibonacci();
    	programaFibonacci.ejecutar(opciones);
    }
    
}
