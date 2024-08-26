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
    public void calcularFibonacciCorrectoCincoIteraciones() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1,1,2,3);
		assertThat(fibonacci.calcular(5)).isEqualTo(resultado);
    }
	
	@Test
    public void calcularFibonacciCorrectoOchoIteraciones() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5,8,13);
		assertThat(fibonacci.calcular(8)).isEqualTo(resultado);
    }
	
	@Test
    public void calcularFibonacciIncorrecto() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1,1,2,3,5);
		assertThat(fibonacci.calcular(5)).isNotEqualTo(resultado);
    }
	
	@Test
    public void calcularFibonacciCorrectoUnaIteracion() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0);
		assertThat(fibonacci.calcular(1)).isEqualTo(resultado);
    }
	
	@Test
    public void calcularFibonacciCorrectoDosIteraciones() {
		Fibonacci fibonacci = new Fibonacci();
		List<Integer> resultado = Arrays.asList(0,1);
		assertThat(fibonacci.calcular(2)).isEqualTo(resultado);
    }

}
