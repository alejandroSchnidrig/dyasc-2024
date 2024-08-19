package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	private List<Integer> resultado = new ArrayList<Integer>();
	
	public void calcular(int iteraciones) {
		
		int fiboA = 0;
		int fiboB = 1;
		int fibonacci = 0;
		
		resultado.add(fiboA);
		resultado.add(fiboB);
		
		for(int i = 2; i < iteraciones; i++) {
			fibonacci = fiboA + fiboB;
			resultado.add(fibonacci);

			fiboA = fiboB;
			fiboB = fibonacci;
		}
	}

	public List<Integer> getResultado() {
		return resultado;
	}

	public void setResultado(List<Integer> valores) {
		this.resultado = valores;
	}
	
}
