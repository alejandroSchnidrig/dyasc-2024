package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.funcionamiento.Funcionamiento;
import ar.edu.untref.dyasc.funcionamiento.FuncionamientoSumatoria;

public class FuncionamientoSumatoriaTest {
	
	@Test
    public void crearObjeto() {
		Funcionamiento funcionamientoSumatoria = new FuncionamientoSumatoria();
		assertNotNull(funcionamientoSumatoria);
    }
	
	@Test
	public void funcionamientoSumatoriaCorrecto() {
		Funcionamiento funcionamientoSumatoria = new FuncionamientoSumatoria();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		List<Integer> sumatoria = Arrays.asList(7);
		assertThat(funcionamientoSumatoria.aplicarFuncion(listaNumeros)).isEqualTo(sumatoria);
	}
	
	@Test
	public void funcionamientoSumatoriaIncorrecto() {
		Funcionamiento funcionamientoSumatoria = new FuncionamientoSumatoria();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		List<Integer> sumatoria = Arrays.asList(10);
		assertThat(funcionamientoSumatoria.aplicarFuncion(listaNumeros)).isNotEqualTo(sumatoria);
	}

}
