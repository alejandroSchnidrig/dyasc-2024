package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.orientacion.Orientacion;
import ar.edu.untref.dyasc.orientacion.OrientacionVertical;

public class OrientacionVerticalTest {
	
	@Test
    public void crearObjeto() {
		Orientacion orientacionVertical = new OrientacionVertical();
		assertNotNull(orientacionVertical);
	}
	
	@Test
    public void orientaVerticalmente() {
		Orientacion orientacionVertical = new OrientacionVertical();
		List<Integer> listaNumeros = Arrays.asList(0,1,1,2,3);
		assertThat(orientacionVertical.orientar(listaNumeros)).isEqualTo("\n0\n1\n1\n2\n3");
	}

}
