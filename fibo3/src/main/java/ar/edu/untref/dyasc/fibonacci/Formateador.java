package ar.edu.untref.dyasc.fibonacci;

import ar.edu.untref.dyasc.utils.Constantes;

public class Formateador {
	
	public String formatearSerieFibonacci(String serie, Integer iteracciones) {
		String salida = Constantes.FORMATO_SERIE_FIBONACCI;
		salida = salida.replaceAll(Constantes.ITERACIONES, iteracciones.toString());
		salida = salida.replaceAll(Constantes.RESULTADO, serie);
		return salida;
	}
	
	public String formatearMsgSalidaPorArchivo(String nombreArchivo, Integer iteracciones) {
		String salida = Constantes.FORMATO_ARCHIVO_SERIE_FIBONACCI;
		salida = salida.replaceAll(Constantes.ITERACIONES, iteracciones.toString());
		salida = salida.replaceAll(Constantes.NOMBRE_ARCHIVO, nombreArchivo);
		return salida;
	}

}
