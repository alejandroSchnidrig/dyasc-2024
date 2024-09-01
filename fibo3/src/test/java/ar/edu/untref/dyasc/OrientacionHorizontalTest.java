package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.orientacion.Orientacion;
import ar.edu.untref.dyasc.orientacion.OrientacionHorizontal;

public class OrientacionHorizontalTest {
	
	@Test
    public void crearObjeto() {
		Orientacion orientacionHorizontal = new OrientacionHorizontal();
		assertNotNull(orientacionHorizontal);
	}
	
	@Test
    public void orientaHorizontalmente() {
		Orientacion orientacionHorizontal = new OrientacionHorizontal();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		assertThat(orientacionHorizontal.orientar(listaNumeros)).isEqualTo("0 1 1 2 3");
	}

}
