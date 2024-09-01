package ar.edu.untref.dyasc.fibonacci;

import java.io.IOException;
import java.util.List;

import ar.edu.untref.dyasc.direccion.DireccionHandler;
import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.funcionamiento.FuncionamientoHandler;
import ar.edu.untref.dyasc.orientacion.OrientadorHandler;
import ar.edu.untref.dyasc.utils.Constantes;
import ar.edu.untref.dyasc.opciones.ProcesadorOpcionesHandler;
import ar.edu.untref.dyasc.opciones.VerificadorOpciones;
import ar.edu.untref.dyasc.opciones.ContenedorOpciones;

public class ProgramaFibonacci {
	
	private VerificadorOpciones verificadorOpciones;
	private ProcesadorOpcionesHandler procesadorOpciones;
	private ContenedorOpciones contenedorOpciones;
	private Fibonacci fibonacci;
	private DireccionHandler direccionHandler;
	private OrientadorHandler orientadorHandler;
	private FuncionamientoHandler funcionamientoHandler;
	private Salida salida;
	private Formateador formateador;
	
	public ProgramaFibonacci() {
		this.verificadorOpciones = new VerificadorOpciones();
		this.procesadorOpciones = new ProcesadorOpcionesHandler();
		this.contenedorOpciones = new ContenedorOpciones();
		this.fibonacci = new Fibonacci();
		this.direccionHandler = new DireccionHandler();
		this.orientadorHandler = new OrientadorHandler();
		this.funcionamientoHandler = new FuncionamientoHandler();
		this.salida = new Salida();
		this.formateador = new Formateador();
	}
	
	public void ejecutar(String[] opciones) {
		try {
			this.verificadorOpciones.verificar(opciones);
			
			for(String opcion : opciones) {
				this.procesadorOpciones.procesar(opcion, contenedorOpciones);
			}
			
			List<Integer> listaFibonacci = this.fibonacci.calcular(contenedorOpciones.getIteraciones());
			listaFibonacci = this.direccionHandler.direccionar(listaFibonacci, contenedorOpciones.getDireccion());
			listaFibonacci = this.funcionamientoHandler.aplicarFuncion(listaFibonacci, contenedorOpciones.getFuncionamiento());
			String serieFibonacci = this.orientadorHandler.orientar(listaFibonacci, contenedorOpciones.getOrientacion());
			serieFibonacci = this.formateador.formatearSerieFibonacci(serieFibonacci, contenedorOpciones.getIteraciones());
			
			if(contenedorOpciones.isSalidaPantalla()) {
				this.salida.salidaPorPantalla(serieFibonacci); 
			}else {
				this.salida.salidaPorArchivo(serieFibonacci, contenedorOpciones.getNombreArchivo());
				this.salida.salidaPorPantalla(this.formateador.formatearMsgSalidaPorArchivo(contenedorOpciones.getNombreArchivo(), contenedorOpciones.getIteraciones())); 
			}
		}catch(OpcionesNoValidasException onve) {
			this.salida.salidaPorPantalla(Constantes.OPCIONES_NO_VALIDAS);
		}catch(IOException ioe) {
			this.salida.salidaPorPantalla(Constantes.ERROR_ARCHIVO);
		}catch(Exception e) {
			this.salida.salidaPorPantalla(Constantes.ERROR_GENERAL);
		}
	}

}
