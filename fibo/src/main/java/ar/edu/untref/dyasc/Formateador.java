package ar.edu.untref.dyasc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Formateador {
	
	public static String imprimirResultadoFinal(int iteraciones, List<Integer> lista, String separador) {
		String resultado = Arrays.stream(lista.toArray())
				.map(Objects::toString)
    	        .collect(Collectors.joining(separador));
		
		return Constantes.PALABRA_FIBO + Constantes.APERTURA_LLAVE + iteraciones + 
					Constantes.CIERRE_LLAVE + Constantes.DOS_PUNTOS + Constantes.ESPACIO + resultado;
	}
	
}
