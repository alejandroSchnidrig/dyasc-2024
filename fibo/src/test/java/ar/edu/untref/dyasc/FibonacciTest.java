package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
	
	@Test
    public void crearObjeto() {
		Fibonacci fibonacci = new Fibonacci();
		assertNotNull(fibonacci);
    }
	
	@Test
    public void calcularFibonacciCorrecto() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1,1,2,3);
		fibonacci.calcular(5);
		assertThat(fibonacci.getResultado()).isEqualTo(resultado);
    }
	
	@Test
    public void calcularFibonacciIncorrecto() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5);
		fibonacci.calcular(5);
		assertThat(fibonacci.getResultado()).isNotEqualTo(resultado);
    }

}
