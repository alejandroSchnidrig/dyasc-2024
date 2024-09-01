package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.funcionamiento.Funcionamiento;
import ar.edu.untref.dyasc.funcionamiento.FuncionamientoLista;

public class FuncionamientoListaTest {
	
	@Test
    public void crearObjeto() {
		Funcionamiento funcionamientoLista = new FuncionamientoLista();
		assertNotNull(funcionamientoLista);
    }
	
	@Test
	public void funcionamientoListaCorrecto() {
		Funcionamiento funcionamientoLista = new FuncionamientoLista();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		assertThat(funcionamientoLista.aplicarFuncion(listaNumeros)).isEqualTo(listaNumeros);
	}

}
