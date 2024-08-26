package ar.edu.untref.dyasc;

import ar.edu.untref.dyasc.utils.Constantes;

public class Salida {
	
	public String salidaFibo(String resultado, Integer iteracciones) {
		String salida = Constantes.SALIDA;
		salida = salida.replaceAll(Constantes.ITERACIONES, iteracciones.toString());
		salida = salida.replaceAll(Constantes.RESULTADO, resultado);
		return salida;
	}
	
	public void imprimir(String valor) {
		System.out.println(valor);
	}

}
