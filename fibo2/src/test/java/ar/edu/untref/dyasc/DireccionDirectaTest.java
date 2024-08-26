package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.direccion.DireccionDirecta;
import ar.edu.untref.dyasc.direccion.Direccion;

public class DireccionDirectaTest {
	
	@Test
    public void crearObjeto() {
		Direccion direccionDirecta = new DireccionDirecta();
		assertNotNull(direccionDirecta);
	}
	
	@Test
    public void direccionaDirectamente() {
		Direccion direccionDirecta = new DireccionDirecta();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		assertThat(direccionDirecta.direccionar(listaNumeros)).isEqualTo(listaNumeros);
	}

}
