package ar.edu.untref.dyasc.orientacion;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import ar.edu.untref.dyasc.utils.Constantes;

public class OrientacionVertical implements Orientacion {

	@Override
	public String orientar(List<Integer> resultado) {
		return Constantes.SALTO_LINEA + Arrays.stream(resultado.toArray())
				.map(Objects::toString)
    	        .collect(Collectors.joining(Constantes.SALTO_LINEA));
	}

}
