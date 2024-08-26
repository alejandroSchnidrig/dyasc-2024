package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SalidaTest {
	
	@Test
    public void crearObjeto() {
		Salida salida = new Salida();
		assertNotNull(salida);
    }
	
	@Test
	public void imprimirFiboCorrecto() {
		Salida salida = new Salida();
		String resultado = "0 0 1 2 3";
		Integer iteraciones = 5; 
		assertThat(salida.salidaFibo(resultado, iteraciones)).isEqualTo("fibo<5>: 0 0 1 2 3");
	}
	
	@Test
	public void imprimirFiboIncorrecto() {
		Salida salida = new Salida();
		String resultado = "0 0 1 2 3 5";
		Integer iteraciones = 6; 
		assertThat(salida.salidaFibo(resultado, iteraciones)).isNotEqualTo("fibo<5>: 0 0 1 2 3 5 8");
	}

}
