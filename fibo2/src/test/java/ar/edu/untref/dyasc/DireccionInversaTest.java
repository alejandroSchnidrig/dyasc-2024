package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.direccion.Direccion;
import ar.edu.untref.dyasc.direccion.DireccionInversa;

public class DireccionInversaTest {
	
	@Test
    public void crearObjeto() {
		Direccion direccionInversa = new DireccionInversa();
		assertNotNull(direccionInversa);
	}
	
	@Test
    public void direccionaInversamente() {
		Direccion direccionInversa = new DireccionInversa();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		List<Integer> esperado = Arrays.asList(3,2,1,1,0);
		assertThat(direccionInversa.direccionar(listaNumeros)).isEqualTo(esperado);
	}

}
