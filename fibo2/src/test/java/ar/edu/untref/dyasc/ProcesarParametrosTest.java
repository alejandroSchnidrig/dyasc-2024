package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.exceptions.OpcionesNoValidasException;
import ar.edu.untref.dyasc.utils.Constantes;

public class ProcesarParametrosTest {
	
	@Test
	public void crearObjeto(){
		ProcesadorParametros procesarParametros = new ProcesadorParametros();
		assertNotNull(procesarParametros);	
	}
	
	@Test
	public void procesarLineaComandosHD() throws OpcionesNoValidasException{
		ProcesadorParametros procesadorParametros = new ProcesadorParametros();
		String[] args = {"-o=hd", "5"};
		procesadorParametros.procesarParametros(args);
		assertThat(procesadorParametros.getOrientacion()).isEqualTo(Constantes.H);
		assertThat(procesadorParametros.getDireccion()).isEqualTo(Constantes.D);
	}
	
	@Test
	public void procesarLineaComandosHI() throws OpcionesNoValidasException{
		ProcesadorParametros procesadorParametros = new ProcesadorParametros();
		String[] args = {"-o=hi", "3"};
		procesadorParametros.procesarParametros(args);
		assertThat(procesadorParametros.getOrientacion()).isEqualTo(Constantes.H);
		assertThat(procesadorParametros.getDireccion()).isEqualTo(Constantes.I);
	}
	
	@Test
	public void procesarLineaComandosVD() throws OpcionesNoValidasException{
		ProcesadorParametros procesadorParametros = new ProcesadorParametros();
		String[] args = {"-o=vd", "8"};
		procesadorParametros.procesarParametros(args);
		assertThat(procesadorParametros.getOrientacion()).isEqualTo(Constantes.V);
		assertThat(procesadorParametros.getDireccion()).isEqualTo(Constantes.D);
	}
	
	@Test
	public void procesarLineaComandosVI() throws OpcionesNoValidasException{
		ProcesadorParametros procesadorParametros = new ProcesadorParametros();
		String[] args = {"-o=vi", "10"};
		procesadorParametros.procesarParametros(args);
		assertThat(procesadorParametros.getOrientacion()).isEqualTo(Constantes.V);
		assertThat(procesadorParametros.getDireccion()).isEqualTo(Constantes.I);
	}
	
	@Test
	public void procesarLineaComandosIteraciones() throws OpcionesNoValidasException{
		ProcesadorParametros procesadorParametros = new ProcesadorParametros();
		String[] args = {"-o=hd", "7"};
		procesadorParametros.procesarParametros(args);
		assertThat(procesadorParametros.getIteraciones()).isEqualTo(7);
	}

}
