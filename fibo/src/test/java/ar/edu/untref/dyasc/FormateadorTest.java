package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FormateadorTest {
	
	@Test
    public void ImprimirResultadoFormateadoConEspacios() {
		List<Integer> resultado = Arrays.asList(0,1,1,2,3);
		assertThat(Formateador.imprimirResultadoFinal(5, resultado, Constantes.ESPACIO)).isEqualTo("fibo<5>: 0 1 1 2 3");
    }
	
	@Test
    public void ImprimirResultadoFormateadoConComa() {
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5);
		assertThat(Formateador.imprimirResultadoFinal(6, resultado, Constantes.COMA + Constantes.ESPACIO)).isEqualTo("fibo<6>: 0, 1, 1, 2, 3, 5");
    }
	
	@Test
    public void ImprimirResultadoFormateadoResultadoIncorrecto() {
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5,8);
		assertThat(Formateador.imprimirResultadoFinal(7, resultado, Constantes.ESPACIO)).isNotEqualTo("fibo<7>: 0 1 1 2 3 5");
    }
	
	@Test
    public void ImprimirResultadoFormateadoNroIterracionesIncorrecto() {
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5,8);
		assertThat(Formateador.imprimirResultadoFinal(10, resultado, Constantes.ESPACIO)).isNotEqualTo("fibo<7>: 0 1 1 2 3 5 8");
    }
	
}
