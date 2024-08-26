package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.orientacion.OrientacionVertical;

public class Ejecutable {
	
    public static void main(String[] args) throws OpcionesNoValidasException {
    	Programa programa = new Programa();
    	programa.ejecutar(args);
    }
    
}
