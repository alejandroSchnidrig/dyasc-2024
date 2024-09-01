package ar.edu.untref.dyasc.direccion;

import java.util.Collections;
import java.util.List;

public class DireccionInversa implements Direccion {

	@Override
	public List<Integer> direccionar(List<Integer> serie) {
		Collections.reverse(serie);
		return serie;
	}

}
