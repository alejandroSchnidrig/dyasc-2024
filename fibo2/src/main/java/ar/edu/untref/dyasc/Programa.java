package ar.edu.untref.dyasc;

import java.util.List;

import ar.edu.untref.dyasc.direccion.Direccionador;
import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.orientacion.Orientador;
import ar.edu.untref.dyasc.utils.Constantes;

public class Programa {
	
	private ProcesadorParametros procesadorParametros = new ProcesadorParametros();
	private Fibonacci fibonacci = new Fibonacci();
	private Direccionador direccionador = new Direccionador();
	private Orientador orientador = new Orientador();
	private Salida salida = new Salida();
	
	public void ejecutar(String[] args) {
		try {
			procesadorParametros.procesarParametros(args);
			List<Integer> listaFibonacci = fibonacci.calcular(procesadorParametros.getIteraciones());
			direccionador.direccionar(listaFibonacci, procesadorParametros.getDireccion());
			String resultado = orientador.orientar(listaFibonacci, procesadorParametros.getOrientacion());
			resultado = salida.salidaFibo(resultado, procesadorParametros.getIteraciones());
			salida.imprimir(resultado);
		}catch(OpcionesNoValidasException onve) {
			salida.imprimir(Constantes.OPCIONES_NO_VALIDAS);
		}
	}

}
