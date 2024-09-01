package ar.edu.untref.dyasc.orientacion;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import ar.edu.untref.dyasc.utils.Constantes;

public class OrientacionHorizontal implements Orientacion {
	
	@Override
	public String orientar(List<Integer> serie) {
		return Arrays.stream(serie.toArray())
				.map(Objects::toString)
    	        .collect(Collectors.joining(Constantes.ESPACIO));
	}
	
}
