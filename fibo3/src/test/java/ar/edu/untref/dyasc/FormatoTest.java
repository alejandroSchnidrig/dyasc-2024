package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import ar.edu.untref.dyasc.fibonacci.Formateador;

public class FormatoTest {
	
    @Test
    public void crearObjeto() {
        Formateador formateador = new Formateador();
		assertNotNull(formateador);
    }
	
    @Test
    public void formatearSerieFibonacciCorrecto() {
        Formateador formateador = new Formateador();
        String serie = "0 0 1 2 3";
        Integer iteraciones = 5; 
        assertThat(formateador.formatearSerieFibonacci(serie, iteraciones)).isEqualTo("fibo<5>: 0 0 1 2 3");
    }
	
    @Test
    public void formatearMsgSalidaPorArchivoCorrecto() {
        Formateador formateador = new Formateador();
        String nombreArchivo = "salida.txt";
        Integer iteraciones = 5; 
        assertThat(formateador.formatearMsgSalidaPorArchivo(nombreArchivo, iteraciones)).isEqualTo("fibo<5> guardado en salida.txt");
    }
	
    @Test
    public void formatearMsgSalidaPorArchivoIncorrecto() {
        Formateador formateador = new Formateador();
        String nombreArchivo = "salida.txt";
        Integer iteraciones = 5; 
        assertThat(formateador.formatearMsgSalidaPorArchivo(nombreArchivo, iteraciones)).isNotEqualTo("fibo<6> guardado en salida.txt");
    }

}
