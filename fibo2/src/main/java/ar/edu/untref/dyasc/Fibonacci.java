package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public List<Integer> calcular(int iteraciones) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (iteraciones == 1) {
			resultado.add(0);
            return resultado;
        }
        
        if (iteraciones == 2) {
        	resultado.add(0);
        	resultado.add(1);
            return resultado;
        }
        
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
		
		return resultado;
	}
}
