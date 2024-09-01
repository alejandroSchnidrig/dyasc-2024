package ar.edu.untref.dyasc.funcionamiento;

import java.util.ArrayList;
import java.util.List;

public class FuncionamientoSumatoria implements Funcionamiento {

	@Override
	public List<Integer> aplicarFuncion(List<Integer> serie) {
		int sumatoria = serie.stream().mapToInt(Integer::intValue).sum();
		serie = new ArrayList<Integer>();
		serie.add(sumatoria);
		return serie;
	}

}
